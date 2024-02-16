package com.al.astronauts.view;

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\u0018\u0000 72\u00020\u00012\u00020\u0002:\u00017B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010\u001f\u001a\u00020\u001dH\u0002J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010(\u001a\u00020\u001dH\u0016J\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020+H\u0016J-\u0010,\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020\u00052\u000e\u0010.\u001a\n\u0012\u0006\b\u0001\u0012\u0002000/2\u0006\u00101\u001a\u000202H\u0016\u00a2\u0006\u0002\u00103J\u001a\u00104\u001a\u00020\u001d2\u0006\u00105\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0017J\b\u00106\u001a\u00020\u001dH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u00068"}, d2 = {"Lcom/al/astronauts/view/LocationListFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/location/LocationListener;", "()V", "LOCATION_PERMISSION_REQUEST_CODE", "", "_binding", "Lcom/al/astronauts/databinding/FragmentLocationListBinding;", "adapter", "Lcom/al/astronauts/view/AstronautsAdapter;", "binding", "getBinding", "()Lcom/al/astronauts/databinding/FragmentLocationListBinding;", "landingViewModel", "Lcom/al/astronauts/viewmodel/SpaceViewModel;", "getLandingViewModel", "()Lcom/al/astronauts/viewmodel/SpaceViewModel;", "landingViewModel$delegate", "Lkotlin/Lazy;", "locationManager", "Landroid/location/LocationManager;", "locationPermissionCode", "viewModelFactory", "Lcom/al/astronauts/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/al/astronauts/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/al/astronauts/di/ViewModelFactory;)V", "getLocation", "", "makeServiceCall", "observeData", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onLocationChanged", "p0", "Landroid/location/Location;", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "view", "requestLocationPermission", "Companion", "app_debug"})
public final class LocationListFragment extends androidx.fragment.app.Fragment implements android.location.LocationListener {
    @org.jetbrains.annotations.Nullable
    private com.al.astronauts.databinding.FragmentLocationListBinding _binding;
    @org.jetbrains.annotations.Nullable
    private android.location.LocationManager locationManager;
    private final int locationPermissionCode = 2;
    private final int LOCATION_PERMISSION_REQUEST_CODE = 1001;
    @javax.inject.Inject
    public com.al.astronauts.di.ViewModelFactory viewModelFactory;
    @org.jetbrains.annotations.NotNull
    private final com.al.astronauts.view.AstronautsAdapter adapter = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy landingViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String USER_POSITION = "USER LOCATION";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ISS_POSITION = "ISS LOCATION";
    @org.jetbrains.annotations.NotNull
    public static final com.al.astronauts.view.LocationListFragment.Companion Companion = null;
    
    public LocationListFragment() {
        super();
    }
    
    private final com.al.astronauts.databinding.FragmentLocationListBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.al.astronauts.di.ViewModelFactory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull
    com.al.astronauts.di.ViewModelFactory p0) {
    }
    
    private final com.al.astronauts.viewmodel.SpaceViewModel getLandingViewModel() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.S)
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void requestLocationPermission() {
    }
    
    @java.lang.Override
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
    
    private final void makeServiceCall() {
    }
    
    private final void observeData() {
    }
    
    private final void getLocation() {
    }
    
    @java.lang.Override
    public void onLocationChanged(@org.jetbrains.annotations.NotNull
    android.location.Location p0) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/al/astronauts/view/LocationListFragment$Companion;", "", "()V", "ISS_POSITION", "", "USER_POSITION", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}