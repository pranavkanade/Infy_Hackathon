package com.example.farzicoder.picky;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShopsTabFragment extends Fragment {


    public ShopsTabFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View shopTabView = inflater.inflate(R.layout.fragment_shops_tab, container, false);
        //shopTabView.findViewById(R.id.textViewShop).setBackgroundColor(Color.BLUE);
        return shopTabView;
    }

}
