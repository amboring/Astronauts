package com.al.astronauts.databinding;
import com.al.astronauts.R;
import com.al.astronauts.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentLocationListBindingImpl extends FragmentLocationListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.button_view_map, 6);
        sViewsWithIds.put(R.id.astronauts_title, 7);
        sViewsWithIds.put(R.id.astronauts_list, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentLocationListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentLocationListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (android.widget.TextView) bindings[7]
            , (android.widget.Button) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.ProgressBar) bindings[5]
            , (android.widget.TextView) bindings[3]
            );
        this.distanceText.setTag(null);
        this.issLocationValue.setTag(null);
        this.lastLocation.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progressBar.setTag(null);
        this.userLocationValue.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.spaceViewModel == variableId) {
            setSpaceViewModel((com.al.astronauts.viewmodel.SpaceViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSpaceViewModel(@Nullable com.al.astronauts.viewmodel.SpaceViewModel SpaceViewModel) {
        this.mSpaceViewModel = SpaceViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.spaceViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSpaceViewModelLoadingVisibility((androidx.lifecycle.MediatorLiveData<java.lang.Integer>) object, fieldId);
            case 1 :
                return onChangeSpaceViewModelDistance((androidx.lifecycle.MediatorLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeSpaceViewModelIssText((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeSpaceViewModelUserLocation((androidx.lifecycle.MutableLiveData<android.location.Location>) object, fieldId);
            case 4 :
                return onChangeSpaceViewModelLastIssLocation((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSpaceViewModelLoadingVisibility(androidx.lifecycle.MediatorLiveData<java.lang.Integer> SpaceViewModelLoadingVisibility, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSpaceViewModelDistance(androidx.lifecycle.MediatorLiveData<java.lang.String> SpaceViewModelDistance, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSpaceViewModelIssText(androidx.lifecycle.LiveData<java.lang.String> SpaceViewModelIssText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSpaceViewModelUserLocation(androidx.lifecycle.MutableLiveData<android.location.Location> SpaceViewModelUserLocation, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSpaceViewModelLastIssLocation(androidx.lifecycle.LiveData<java.lang.String> SpaceViewModelLastIssLocation, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        boolean spaceViewModelUserLocationJavaLangObjectNull = false;
        androidx.lifecycle.MediatorLiveData<java.lang.Integer> spaceViewModelLoadingVisibility = null;
        double spaceViewModelUserLocationLatitude = 0.0;
        java.lang.String userLocationValueAndroidStringPositionSpaceViewModelUserLocationLatitudeSpaceViewModelUserLocationLongitude = null;
        java.lang.String spaceViewModelDistanceGetValue = null;
        androidx.lifecycle.MediatorLiveData<java.lang.String> spaceViewModelDistance = null;
        android.location.Location spaceViewModelUserLocationGetValue = null;
        java.lang.String distanceTextAndroidStringUserDistanceTextSpaceViewModelDistance = null;
        double spaceViewModelUserLocationLongitude = 0.0;
        java.lang.String spaceViewModelUserLocationJavaLangObjectNullUserLocationValueAndroidStringEmptyStringUserLocationValueAndroidStringPositionSpaceViewModelUserLocationLatitudeSpaceViewModelUserLocationLongitude = null;
        java.lang.String lastLocationAndroidStringAstronautLastSeenSpaceViewModelLastIssLocation = null;
        androidx.lifecycle.LiveData<java.lang.String> spaceViewModelIssText = null;
        com.al.astronauts.viewmodel.SpaceViewModel spaceViewModel = mSpaceViewModel;
        java.lang.String spaceViewModelLastIssLocationGetValue = null;
        androidx.lifecycle.MutableLiveData<android.location.Location> spaceViewModelUserLocation = null;
        java.lang.Integer spaceViewModelLoadingVisibilityGetValue = null;
        java.lang.String spaceViewModelIssTextGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxSpaceViewModelLoadingVisibilityGetValue = 0;
        androidx.lifecycle.LiveData<java.lang.String> spaceViewModelLastIssLocation = null;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (spaceViewModel != null) {
                        // read spaceViewModel.loadingVisibility
                        spaceViewModelLoadingVisibility = spaceViewModel.getLoadingVisibility();
                    }
                    updateLiveDataRegistration(0, spaceViewModelLoadingVisibility);


                    if (spaceViewModelLoadingVisibility != null) {
                        // read spaceViewModel.loadingVisibility.getValue()
                        spaceViewModelLoadingVisibilityGetValue = spaceViewModelLoadingVisibility.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(spaceViewModel.loadingVisibility.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxSpaceViewModelLoadingVisibilityGetValue = androidx.databinding.ViewDataBinding.safeUnbox(spaceViewModelLoadingVisibilityGetValue);
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (spaceViewModel != null) {
                        // read spaceViewModel.distance
                        spaceViewModelDistance = spaceViewModel.getDistance();
                    }
                    updateLiveDataRegistration(1, spaceViewModelDistance);


                    if (spaceViewModelDistance != null) {
                        // read spaceViewModel.distance.getValue()
                        spaceViewModelDistanceGetValue = spaceViewModelDistance.getValue();
                    }


                    // read @android:string/user_distance_text
                    distanceTextAndroidStringUserDistanceTextSpaceViewModelDistance = distanceText.getResources().getString(R.string.user_distance_text, spaceViewModelDistanceGetValue);
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (spaceViewModel != null) {
                        // read spaceViewModel.issText
                        spaceViewModelIssText = spaceViewModel.getIssText();
                    }
                    updateLiveDataRegistration(2, spaceViewModelIssText);


                    if (spaceViewModelIssText != null) {
                        // read spaceViewModel.issText.getValue()
                        spaceViewModelIssTextGetValue = spaceViewModelIssText.getValue();
                    }
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (spaceViewModel != null) {
                        // read spaceViewModel.userLocation
                        spaceViewModelUserLocation = spaceViewModel.getUserLocation();
                    }
                    updateLiveDataRegistration(3, spaceViewModelUserLocation);


                    if (spaceViewModelUserLocation != null) {
                        // read spaceViewModel.userLocation.getValue()
                        spaceViewModelUserLocationGetValue = spaceViewModelUserLocation.getValue();
                    }


                    // read spaceViewModel.userLocation.getValue() == null
                    spaceViewModelUserLocationJavaLangObjectNull = (spaceViewModelUserLocationGetValue) == (null);
                if((dirtyFlags & 0x68L) != 0) {
                    if(spaceViewModelUserLocationJavaLangObjectNull) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }
            }
            if ((dirtyFlags & 0x70L) != 0) {

                    if (spaceViewModel != null) {
                        // read spaceViewModel.lastIssLocation
                        spaceViewModelLastIssLocation = spaceViewModel.getLastIssLocation();
                    }
                    updateLiveDataRegistration(4, spaceViewModelLastIssLocation);


                    if (spaceViewModelLastIssLocation != null) {
                        // read spaceViewModel.lastIssLocation.getValue()
                        spaceViewModelLastIssLocationGetValue = spaceViewModelLastIssLocation.getValue();
                    }


                    // read @android:string/astronaut_last_seen
                    lastLocationAndroidStringAstronautLastSeenSpaceViewModelLastIssLocation = lastLocation.getResources().getString(R.string.astronaut_last_seen, spaceViewModelLastIssLocationGetValue);
            }
        }
        // batch finished

        if ((dirtyFlags & 0x80L) != 0) {

                if (spaceViewModelUserLocationGetValue != null) {
                    // read spaceViewModel.userLocation.getValue().latitude
                    spaceViewModelUserLocationLatitude = spaceViewModelUserLocationGetValue.getLatitude();
                    // read spaceViewModel.userLocation.getValue().longitude
                    spaceViewModelUserLocationLongitude = spaceViewModelUserLocationGetValue.getLongitude();
                }


                // read @android:string/position
                userLocationValueAndroidStringPositionSpaceViewModelUserLocationLatitudeSpaceViewModelUserLocationLongitude = userLocationValue.getResources().getString(R.string.position, spaceViewModelUserLocationLatitude, spaceViewModelUserLocationLongitude);
        }

        if ((dirtyFlags & 0x68L) != 0) {

                // read spaceViewModel.userLocation.getValue() == null ? @android:string/empty_string : @android:string/position
                spaceViewModelUserLocationJavaLangObjectNullUserLocationValueAndroidStringEmptyStringUserLocationValueAndroidStringPositionSpaceViewModelUserLocationLatitudeSpaceViewModelUserLocationLongitude = ((spaceViewModelUserLocationJavaLangObjectNull) ? (userLocationValue.getResources().getString(R.string.empty_string)) : (userLocationValueAndroidStringPositionSpaceViewModelUserLocationLatitudeSpaceViewModelUserLocationLongitude));
        }
        // batch finished
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.distanceText, distanceTextAndroidStringUserDistanceTextSpaceViewModelDistance);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.issLocationValue, spaceViewModelIssTextGetValue);
        }
        if ((dirtyFlags & 0x70L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.lastLocation, lastLocationAndroidStringAstronautLastSeenSpaceViewModelLastIssLocation);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            this.progressBar.setVisibility(androidxDatabindingViewDataBindingSafeUnboxSpaceViewModelLoadingVisibilityGetValue);
        }
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.userLocationValue, spaceViewModelUserLocationJavaLangObjectNullUserLocationValueAndroidStringEmptyStringUserLocationValueAndroidStringPositionSpaceViewModelUserLocationLatitudeSpaceViewModelUserLocationLongitude);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): spaceViewModel.loadingVisibility
        flag 1 (0x2L): spaceViewModel.distance
        flag 2 (0x3L): spaceViewModel.issText
        flag 3 (0x4L): spaceViewModel.userLocation
        flag 4 (0x5L): spaceViewModel.lastIssLocation
        flag 5 (0x6L): spaceViewModel
        flag 6 (0x7L): null
        flag 7 (0x8L): spaceViewModel.userLocation.getValue() == null ? @android:string/empty_string : @android:string/position
        flag 8 (0x9L): spaceViewModel.userLocation.getValue() == null ? @android:string/empty_string : @android:string/position
    flag mapping end*/
    //end
}