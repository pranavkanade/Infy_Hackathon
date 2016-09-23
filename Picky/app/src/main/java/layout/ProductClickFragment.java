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
public class ProductClickFragment extends Fragment {


    String [] arrShop = {
            "Shop 1",
            "Shop 2",
            "Shop 3",
            "Shop 4"
    };
    Integer [] arrShopImage = {
            R.drawable.shop1,
            R.drawable.shop2,
            R.drawable.shop3,
            R.drawable.shop4
    };
    public ProductClickFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_product_click, container, false);
        //rootView = inflater.inflate(R.layout.fragment_shops_tab, container, false);
//                TextView tv = (TextView) rootView.findViewById(R.id.textViewShop);
//                tv.setText("This is Shops Window");
        ListView listView = (ListView) rootView.findViewById(R.id.listOfShopss);
        CustomList adapter = new CustomList(getActivity(), arrShop, arrShopImage);
        listView.setAdapter(adapter);
        return rootView;
    }

}
