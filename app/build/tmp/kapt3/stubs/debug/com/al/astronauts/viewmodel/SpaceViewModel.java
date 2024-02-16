package com.al.astronauts.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\"R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u00a8\u0006$"}, d2 = {"Lcom/al/astronauts/viewmodel/SpaceViewModel;", "Landroidx/lifecycle/ViewModel;", "spaceRepository", "Lcom/al/astronauts/service/SpaceRepository;", "(Lcom/al/astronauts/service/SpaceRepository;)V", "_astronautsState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/al/astronauts/model/AstronautsState;", "_issState", "Lcom/al/astronauts/model/ISSState;", "_lastIssLocation", "", "astronautsState", "Landroidx/lifecycle/LiveData;", "getAstronautsState", "()Landroidx/lifecycle/LiveData;", "distance", "Landroidx/lifecycle/MediatorLiveData;", "getDistance", "()Landroidx/lifecycle/MediatorLiveData;", "issState", "getIssState", "issText", "getIssText", "lastIssLocation", "getLastIssLocation", "loadingVisibility", "", "getLoadingVisibility", "userLocation", "Landroid/location/Location;", "getUserLocation", "()Landroidx/lifecycle/MutableLiveData;", "getAstronautsList", "", "getIssLocation", "app_debug"})
public final class SpaceViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.al.astronauts.service.SpaceRepository spaceRepository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.al.astronauts.model.AstronautsState> _astronautsState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.al.astronauts.model.AstronautsState> astronautsState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.al.astronauts.model.ISSState> _issState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.al.astronauts.model.ISSState> issState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.String> issText = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _lastIssLocation = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.String> lastIssLocation = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<android.location.Location> userLocation = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MediatorLiveData<java.lang.Integer> loadingVisibility = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MediatorLiveData<java.lang.String> distance = null;
    
    @javax.inject.Inject
    public SpaceViewModel(@org.jetbrains.annotations.NotNull
    com.al.astronauts.service.SpaceRepository spaceRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.al.astronauts.model.AstronautsState> getAstronautsState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.al.astronauts.model.ISSState> getIssState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getIssText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getLastIssLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<android.location.Location> getUserLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MediatorLiveData<java.lang.Integer> getLoadingVisibility() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MediatorLiveData<java.lang.String> getDistance() {
        return null;
    }
    
    public final void getAstronautsList() {
    }
    
    public final void getIssLocation() {
    }
}