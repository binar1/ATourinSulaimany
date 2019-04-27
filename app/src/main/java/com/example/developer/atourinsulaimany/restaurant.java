package com.example.developer.atourinsulaimany;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by binar on 20/10/2017.
 */

public class restaurant extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView=  inflater.inflate(R.layout.restaurant,container,false);
        ListView listview=(ListView)  rootView.findViewById(R.id.restaurant);
        ArrayList<Item> item=new ArrayList<>();
        item.add(new Item(R.string.nameres1,R.string.locationres1,R.mipmap.diwanres));
        item.add(new Item(R.string.nameres2,R.string.locationres2,R.mipmap.sharifres));
        item.add(new Item(R.string.nameres3,R.string.locationres3,R.mipmap.dawares));
        item.add(new Item(R.string.nameres4,R.string.locationres4,R.mipmap.romares));
        ArrayItemAdapter adapter=new ArrayItemAdapter(getContext(),R.layout.item_view,item);
        listview.setAdapter(adapter);
        return rootView;
    }
}
