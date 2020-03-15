package com.example.mytestproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.fragment.app.ListFragment;

public class CityList extends ListFragment implements AdapterView.OnItemClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_list, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.canadianCities, android.R.layout.simple_list_item_1);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String[] cityDesc = getResources().getStringArray(R.array.canadianCitiesDescription);

        CityDescription cityDescpview = new CityDescription();
        Bundle displayDesc = new Bundle();
        displayDesc.putString("cityDescription", cityDesc[position]);
        cityDescpview.setArguments(displayDesc);

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment3, cityDescpview, null)
                .commit();

    }
}
