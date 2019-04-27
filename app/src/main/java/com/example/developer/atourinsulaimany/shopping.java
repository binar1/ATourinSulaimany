package com.example.developer.atourinsulaimany;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by binar on 20/10/2017.
 */

public class shopping extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View rootView=inflater.inflate(R.layout.shopping,container,false);
        ListView listview=(ListView)  rootView.findViewById(R.id.shopping);
        ArrayList<Item> item=new ArrayList<>();
        item.add(new Item(R.string.nameshoping1,R.string.locationshoping1,R.mipmap.majdimall));
        item.add(new Item(R.string.nameshoping2,R.string.locationshoping2,R.mipmap.familymall));
        item.add(new Item(R.string.nameshoping3,R.string.locationshoping3,R.mipmap.citycenter));
        item.add(new Item(R.string.nameshoping4,R.string.locationshoping4,R.mipmap.citystar));
        ArrayItemAdapter adapter=new ArrayItemAdapter(getContext(),R.layout.item_view,item);
        listview.setAdapter(adapter);
        return rootView;

    }
}
