package com.al.astronauts.service;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/al/astronauts/service/SpaceService;", "", "getAstronauts", "Lcom/al/astronauts/model/AstronautsResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getISSLocation", "Lcom/al/astronauts/model/ISSPositionResponse;", "app_debug"})
public abstract interface SpaceService {
    
    @retrofit2.http.GET(value = "iss-now.json")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getISSLocation(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.al.astronauts.model.ISSPositionResponse> $completion);
    
    @retrofit2.http.GET(value = "astros.json")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAstronauts(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.al.astronauts.model.AstronautsResponse> $completion);
}