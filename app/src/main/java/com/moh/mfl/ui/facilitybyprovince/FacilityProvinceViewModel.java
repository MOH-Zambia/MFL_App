package com.moh.mfl.ui.facilitybyprovince;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FacilityProvinceViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public FacilityProvinceViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is facilities by province fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
