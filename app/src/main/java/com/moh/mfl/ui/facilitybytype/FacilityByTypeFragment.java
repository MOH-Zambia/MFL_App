package com.moh.mfl.ui.facilitybytype;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.mfl.mfl.databinding.FragmentFacilityByTypeBinding;

public class FacilityByTypeFragment extends Fragment {

    private FacilityByTypeViewModel facilityByTypeViewModel;
    private FragmentFacilityByTypeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        facilityByTypeViewModel =
                new ViewModelProvider(this).get(FacilityByTypeViewModel.class);

        binding = FragmentFacilityByTypeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textFacilitytype;
        facilityByTypeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
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