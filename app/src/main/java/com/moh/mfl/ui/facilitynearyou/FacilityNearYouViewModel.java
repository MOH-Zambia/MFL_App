package com.moh.mfl.ui.facilitynearyou;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FacilityNearYouViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FacilityNearYouViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is facilities near you fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}