package com.al.astronauts.viewmodel

import com.al.astronauts.MainDispatcherRule
import com.al.astronauts.model.AstronautsState
import com.al.astronauts.model.ISSState
import com.al.astronauts.model.IssPosition
import com.al.astronauts.model.IssPositionHistory
import com.al.astronauts.model.People
import com.al.astronauts.service.SpaceRepository
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.TestDispatcher
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.runTest
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule

@OptIn(ExperimentalCoroutinesApi::class)
class SpaceViewModelTest {
    @get:Rule
    val rule: TestRule = MainDispatcherRule()

    private val spaceRepository: SpaceRepository = mockk()
    private lateinit var subject: SpaceViewModel
    private val dispatcher: TestDispatcher = UnconfinedTestDispatcher()
    private lateinit var astronautsState: MutableList<AstronautsState>
    private lateinit var issState: MutableList<ISSState>

    val people = listOf(People("ISS", "Ana Stronaut"))

    @Before
    fun setUp() {
        subject = SpaceViewModel(spaceRepository)

        astronautsState = mutableListOf()
        issState= mutableListOf()

        subject.astronautsState.observeForever {
            astronautsState.add(it)
        }
        subject.issState.observeForever {
            issState.add(it)
        }
    }

    @Test
    fun `WHEN getAstronautsList AND valid result returned THEN astronautsState is updated`() =
        runTest {
            coEvery { spaceRepository.getAstronautsLocation() } returns AstronautsState.HasAstronauts(people)

            subject.getAstronautsList()

            coVerify { spaceRepository.getAstronautsLocation() }
            Assert.assertEquals(AstronautsState.Loading, astronautsState[0])
            Assert.assertEquals(AstronautsState.HasAstronauts(people), astronautsState[1])
        }
    @Test
    fun `WHEN getAstronautsList AND invalid result returned THEN astronautsState is updated`() =
        runTest {
            val errMsg ="sth wrong"
            coEvery { spaceRepository.getAstronautsLocation() } returns AstronautsState.Error(errMsg)

            subject.getAstronautsList()

            coVerify { spaceRepository.getAstronautsLocation() }
            Assert.assertEquals(AstronautsState.Loading, astronautsState[0])
            Assert.assertEquals(AstronautsState.Error(errMsg), astronautsState[1])
        }

    @Test
    fun `WHEN getIssLocation AND invalid result returned THEN astronautsState is updated`() =
        runTest {
            val errMsg ="sth wrong"
            coEvery { spaceRepository.getISSLocation(any()) } returns ISSState.Error(errMsg)
            coEvery { spaceRepository.getISSPastLocation() } returns listOf(IssPositionHistory("12.2","21.1",1200L))

            subject.getIssLocation()

            coVerify { spaceRepository.getISSLocation(null) }
            Assert.assertEquals(ISSState.Loading, issState[0])
            Assert.assertEquals(ISSState.Error(errMsg), issState[1])
        }
    @Test
    fun `WHEN getIssLocation AND valid result returned THEN astronautsState is updated`() =
        runTest {
            val position  =IssPosition("21.1","21.2")
            coEvery { spaceRepository.getISSLocation(any()) } returns ISSState.HasISSLocation(position)
            coEvery { spaceRepository.getISSPastLocation() } returns listOf(IssPositionHistory("12.2","21.1",1200L))

            subject.getIssLocation()

            coVerify { spaceRepository.getISSLocation(null) }
            Assert.assertEquals(ISSState.Loading, issState[0])
            Assert.assertEquals(ISSState.HasISSLocation(position), issState[1])
        }
}