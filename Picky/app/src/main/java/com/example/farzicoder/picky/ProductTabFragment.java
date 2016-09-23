package com.example.farzicoder.picky;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProductTabFragment extends Fragment {


    public ProductTabFragment() {
        // Required empty public constructor
    }

    String [] arrProduct = {
            "Broccoli",
            "Vegetables",
            "Drinks",
            "Bakery Products",
            "Produces",
            "Fruits"
    };
    Integer [] arrProductImage = {
            R.drawable.broccoli,
            R.drawable.carrot,
            R.drawable.coffee_cup,
            R.drawable.doughnut,
            R.drawable.food,
            R.drawable.fruit
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //Toast.makeText(getActivity(), "this is product fragment", Toast.LENGTH_LONG).show();
        View productTabView = inflater.inflate(R.layout.fragment_product_tab, container, false);
//
//        // populate the list;
//        //temp array to fill;
//        String [] listInFrag = {"MainPage", "list Of Items", "List of Shops"};
//
//        ListView listView = (ListView) productTabView.findViewById(R.id.lvProductTab);
//        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<>(
//                getActivity(),
//                android.R.layout.simple_list_item_1,
//                listInFrag
//        );
//        listView.setAdapter(listViewAdapter);
//
//       // CustomList adapter = new CustomList(getActivity(), arrProduct, arrProductImage);
//
//        //listView.setAdapter(adapter);

        return productTabView;
    }

}
