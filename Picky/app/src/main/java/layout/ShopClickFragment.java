package layout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.farzicoder.picky.CustomList;
import com.example.farzicoder.picky.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShopClickFragment extends Fragment {

    String [] arrProduct = {
            "Broccoli",
            "Vegetables",
            "Drinks",
            "Bakery Products",
            "Produces",
            "Grains"
    };
    Integer [] arrProductImage = {
            R.drawable.broccoli,
            R.drawable.carrot,
            R.drawable.coffee_cup,
            R.drawable.doughnut,
            R.drawable.food,
            R.drawable.fruit
    };


    public ShopClickFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_shop_click, container, false);
        ListView listView = (ListView) rootView.findViewById(R.id.listOfProducts);
        CustomList adapter = new CustomList(getActivity(), arrProduct, arrProductImage);
        listView.setAdapter(adapter);
        return rootView;
    }

}
