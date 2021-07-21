package com.moh.mfl.ui.facilitybyprovince;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mfl.mfl.databinding.FragmentFacilityByProvinceBinding;

public class FacilityByProvinceFragment extends Fragment {
    private FacilityProvinceViewModel facilityProvinceViewModel;
    private FragmentFacilityByProvinceBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        facilityProvinceViewModel =
                new ViewModelProvider(this).get(FacilityProvinceViewModel.class);

        binding = FragmentFacilityByProvinceBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textFacilitybyprovince;
        facilityProvinceViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}