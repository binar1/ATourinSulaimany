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

public class library extends Fragment {

    @Nullable

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {



        View rootView= inflater.inflate(R.layout.library,container,false);
        ListView listview=(ListView)  rootView.findViewById(R.id.library);
        ArrayList <Item> item=new ArrayList<>();
        item.add(new Item(R.string.namelibrary1,R.string.locationlibrary1,R.mipmap.andesha));
        item.add(new Item(R.string.namelibrary2,R.string.locationlibrary2,R.mipmap.saya));
        item.add(new Item(R.string.namelibrary3,R.string.locationhotel3,R.mipmap.zanyar));
        item.add(new Item(R.string.namelibrary4,R.string.locationlibrary4,R.mipmap.malirangin));
        ArrayItemAdapter arrayAdapter=new ArrayItemAdapter(getContext(),R.layout.item_view,item);
        listview.setAdapter(arrayAdapter);
     return rootView;



    }


}

