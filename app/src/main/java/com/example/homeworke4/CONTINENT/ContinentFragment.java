package com.example.homeworke4.CONTINENT;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.homeworke4.COUNTRY.CountryFragment;
import com.example.homeworke4.OnItemClick;
import com.example.homeworke4.R;
import com.example.homeworke4.databinding.FragmentContinentBinding;

import java.util.ArrayList;

public class ContinentFragment extends Fragment implements OnItemClick {
    private FragmentContinentBinding binding;
    private ContinentAdapter adapter;
    private ArrayList<ContinentModel> continentList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContinentBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        loadData();
       adapter = new ContinentAdapter(continentList, this);
       binding.rvContinent.setAdapter(adapter);
    }

    private void loadData() {
        continentList.add(new ContinentModel("https://thumbs.dreamstime.com/z/%D0%B0%D0%B7%D0%B8%D1%8F-%D0%BA%D0%BE%D0%BD%D1%82%D0%B8%D0%BD%D0%B5%D0%BD%D1%82-%D1%81-%D0%BA%D0%BE%D0%BD%D1%82%D1%83%D1%80%D0%B0%D0%BC%D0%B8-%D1%81%D1%82%D1%80%D0%B0%D0%BD-%D0%B2%D0%B5%D0%BA%D1%82%D0%BE%D1%80%D0%BD%D1%8B%D0%B9-%D1%80%D0%B8%D1%81%D1%83%D0%BD%D0%BE%D0%BA-%D0%B5%D0%B2%D1%80%D0%BE%D0%B0%D0%B7%D0%B8%D0%B0%D1%82%D1%81%D0%BA%D0%B8%D0%B5-215002051.jpg","Азия"));
        continentList.add(new ContinentModel("https://thumbs.dreamstime.com/z/%D0%B5%D0%B2%D1%80%D0%BE%D0%BF%D0%B0-%D0%BA%D0%BE%D0%BD%D1%82%D0%B8%D0%BD%D0%B5%D0%BD%D1%82-%D1%81-%D0%BA%D0%BE%D0%BD%D1%82%D1%83%D1%80%D0%B0%D0%BC%D0%B8-%D1%81%D1%82%D1%80%D0%B0%D0%BD-%D0%B2%D0%B5%D0%BA%D1%82%D0%BE%D1%80%D0%BD%D1%8B%D0%B9-%D1%80%D0%B8%D1%81%D1%83%D0%BD%D0%BE%D0%BA-%D1%81%D0%B5%D0%B2%D0%B5%D1%80%D0%BD%D0%B0%D1%8F-%D1%84%D0%BE%D1%80%D0%BC%D0%B0-215002077.jpg","Европа"));
        continentList.add(new ContinentModel("https://thumbs.dreamstime.com/z/%D0%BA%D0%BE%D0%BD%D1%82%D0%B8%D0%BD%D0%B5%D0%BD%D1%82-%D1%81-%D0%BA%D0%BE%D0%BD%D1%82%D1%83%D1%80%D0%B0%D0%BC%D0%B8-%D1%81%D1%82%D1%80%D0%B0%D0%BD-%D1%81%D0%B5%D0%B2%D0%B5%D1%80%D0%BD%D0%BE%D0%B9-%D0%B0%D0%BC%D0%B5%D1%80%D0%B8%D0%BA%D0%B8-%D0%B2%D0%B5%D0%BA%D1%82%D0%BE%D1%80%D0%BD%D1%8B%D0%B9-%D1%80%D0%B8%D1%81%D1%83%D0%BD%D0%BE%D0%BA-215002087.jpg","Северная Америка"));
        continentList.add(new ContinentModel("https://thumbs.dreamstime.com/z/%D0%BA%D0%BE%D0%BD%D1%82%D0%B8%D0%BD%D0%B5%D0%BD%D1%82-%D1%81-%D0%BA%D0%BE%D0%BD%D1%82%D1%83%D1%80%D0%B0%D0%BC%D0%B8-%D1%81%D1%82%D1%80%D0%B0%D0%BD-%D1%8E%D0%B6%D0%BD%D0%BE%D0%B9-%D0%B0%D0%BC%D0%B5%D1%80%D0%B8%D0%BA%D0%B8-%D0%B2%D0%B5%D0%BA%D1%82%D0%BE%D1%80%D0%BD%D1%8B%D0%B9-%D1%80%D0%B8%D1%81%D1%83%D0%BD%D0%BE%D0%BA-%D0%B1%D0%BE%D0%BB%D1%8C%D1%88%D0%B0%D1%8F-215002093.jpg","Южная Америка"));
        continentList.add(new ContinentModel("https://thumbs.dreamstime.com/z/%D0%B0%D1%84%D1%80%D0%B8%D0%BA%D0%B0-%D1%81-%D0%BA%D0%BE%D0%BD%D1%82%D1%83%D1%80%D0%B0%D0%BC%D0%B8-%D1%81%D1%82%D1%80%D0%B0%D0%BD-%D0%B2%D0%B5%D0%BA%D1%82%D0%BE%D1%80%D0%BD%D1%8B%D0%B9-%D1%80%D0%B8%D1%81%D1%83%D0%BD%D0%BE%D0%BA-%D0%B1%D0%BE%D0%BB%D1%8C%D1%88%D0%B0%D1%8F-%D1%84%D0%BE%D1%80%D0%BC%D0%B0-%D0%B7%D0%BE%D0%BD%D1%8B-%D0%B2-%D1%80%D0%B0%D0%B9%D0%BE%D0%BD%D0%B5-215002037.jpg","Африка"));
        continentList.add(new ContinentModel("https://thumbs.dreamstime.com/z/%D0%B0%D0%B2%D1%81%D1%82%D1%80%D0%B0%D0%BB%D0%B8%D0%B9%D1%81%D0%BA%D0%B8%D0%B9-%D0%BA%D0%BE%D0%BD%D1%82%D0%B8%D0%BD%D0%B5%D0%BD%D1%82-%D1%81-%D0%BA%D0%BE%D0%BD%D1%82%D1%83%D1%80%D0%B0%D0%BC%D0%B8-%D1%81%D1%82%D1%80%D0%B0%D0%BD-%D0%B2%D0%B5%D0%BA%D1%82%D0%BE%D1%80%D0%BD%D1%8B%D0%B9-%D1%80%D0%B8%D1%81%D1%83%D0%BD%D0%BE%D0%BA-%D0%B1%D0%BE%D0%BB%D1%8C%D1%88%D0%B0%D1%8F-215002060.jpg","Австралия"));
    }

    @Override
    public void onItemClick(int position) {
        ContinentModel continentModel = continentList.get(position);
        Toast.makeText(requireContext(),continentModel.getName(), Toast.LENGTH_SHORT).show();

        Bundle bundle = new Bundle();
        bundle.putInt("country", position);
        CountryFragment countryFragment = new CountryFragment();
        countryFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, countryFragment).addToBackStack(null).commit();
    }
}