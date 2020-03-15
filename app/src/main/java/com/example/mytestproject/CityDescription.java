package com.example.mytestproject;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class CityDescription extends Fragment {

    public static CityDescription newInstance(String param1, String param2) {
        CityDescription fragment = new CityDescription();
        Bundle args = new Bundle();
        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Bundle bundle=getArguments();
        String cityDesc = "";

        if(bundle != null) {
            cityDesc = bundle.getString("cityDescription");
        }

        View inflatedView = inflater.inflate(R.layout.city_description, container, false);

        TextView frag3View = (TextView) inflatedView.findViewById(R.id.city_desc_view);

        frag3View.setText(cityDesc);

        return inflatedView;
    }



}
