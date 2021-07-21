package com.moh.mfl.ui.facilitybytype;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FacilityByTypeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FacilityByTypeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is facilities by type fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}