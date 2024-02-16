package com.al.astronauts.service;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001b\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/al/astronauts/service/SpaceRepository;", "", "spaceService", "Lcom/al/astronauts/service/SpaceService;", "issPositionHistoryDao", "Lcom/al/astronauts/db/IssPositionHistoryDao;", "(Lcom/al/astronauts/service/SpaceService;Lcom/al/astronauts/db/IssPositionHistoryDao;)V", "getAstronautsLocation", "Lcom/al/astronauts/model/AstronautsState;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getISSLocation", "Lcom/al/astronauts/model/ISSState;", "currentLocation", "Lcom/al/astronauts/model/IssPosition;", "(Lcom/al/astronauts/model/IssPosition;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getISSPastLocation", "", "Lcom/al/astronauts/model/IssPositionHistory;", "Companion", "app_debug"})
public final class SpaceRepository {
    @org.jetbrains.annotations.NotNull
    private final com.al.astronauts.service.SpaceService spaceService = null;
    @org.jetbrains.annotations.NotNull
    private final com.al.astronauts.db.IssPositionHistoryDao issPositionHistoryDao = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SUCCESS_MESSAGE = "success";
    @org.jetbrains.annotations.NotNull
    public static final com.al.astronauts.service.SpaceRepository.Companion Companion = null;
    
    public SpaceRepository(@org.jetbrains.annotations.NotNull
    com.al.astronauts.service.SpaceService spaceService, @org.jetbrains.annotations.NotNull
    com.al.astronauts.db.IssPositionHistoryDao issPositionHistoryDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getISSLocation(@org.jetbrains.annotations.Nullable
    com.al.astronauts.model.IssPosition currentLocation, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.al.astronauts.model.ISSState> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getAstronautsLocation(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.al.astronauts.model.AstronautsState> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getISSPastLocation(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.al.astronauts.model.IssPositionHistory>> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/al/astronauts/service/SpaceRepository$Companion;", "", "()V", "SUCCESS_MESSAGE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}