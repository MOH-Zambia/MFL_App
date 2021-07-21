package com.moh.mfl.ui.search;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.mfl.mfl.R;
import com.mfl.mfl.databinding.FragmentSearchBinding;
import com.moh.mfl.adapter.FacilityAdapter;
import com.moh.mfl.model.Facility;
import com.moh.mfl.model.FacilityResponse;
import com.moh.mfl.model.MFLAPIService;
import com.moh.mfl.model.MFLAPIUtils;

import java.util.ArrayList;

import dmax.dialog.SpotsDialog;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchFragment extends Fragment {
    private SearchViewModel searchViewModel;
    private FragmentSearchBinding binding;

    private Context mContext;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext=context;
    }
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        searchViewModel =
                new ViewModelProvider(this).get(SearchViewModel.class);

        binding = FragmentSearchBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        SearchView simpleSearchView = binding.menuSearchView;
        simpleSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                searchfacilities(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                return false;
            }
        });
        /*final TextView textView = binding.textSearch;
        searchViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return root;
    }

    public void searchfacilities(String query) {
        MFLAPIService mflAPIService = MFLAPIUtils.getAPIService();
        AlertDialog progressDialog = new SpotsDialog.Builder().setContext(mContext).setTheme(R.style.customerTransactions).build();
        progressDialog.show();
        mflAPIService.Search(query).enqueue(new Callback<FacilityResponse>() {
            @Override
            public void onResponse(Call<FacilityResponse> call, Response<FacilityResponse> response) {
                 progressDialog.dismiss();
                if (response.isSuccessful()) {
                    if (response.body().getSuccess() == true) {
                        ArrayList<Facility> results = response.body().getData();
                        //listView = (ListView) findViewById(R.id.listView);
                        ListView listView = (ListView) binding.listView;
                        FacilityAdapter adapter = new FacilityAdapter(mContext, results);
                        listView.setAdapter(adapter);
                    } else {
                        //An error occurred
                        alertDialog("Your search query did not return any result.Please try again!","Error");
                        return;
                    }
                } else {
                    //An error occurred
                    alertDialog("Your search query did not return any result.Please try again!","Error");
                    return;
                }
            }

            @Override
            public void onFailure(Call<FacilityResponse> call, Throwable t) {
                //An error occurred
                progressDialog.dismiss();
                alertDialog("Error occurred while searching for facility!","Error");
                return;
            }
        });
    }
    public void alertDialog(String msg, String title) {
        AlertDialog.Builder builder = new AlertDialog.Builder(mContext, R.style.AlertDialogTheme);
        builder.setTitle(title);
        builder.setMessage(msg);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.dismiss();
            }
        });
        builder.setCancelable(true);
        AlertDialog alert = builder.create();
        alert.show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}