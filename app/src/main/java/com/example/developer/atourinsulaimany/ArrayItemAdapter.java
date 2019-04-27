package com.example.developer.atourinsulaimany;

import android.content.Context;
import android.location.Location;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;
import java.util.Locale;

/**
 * Created by binar on 20/10/2017.
 */

public class ArrayItemAdapter extends ArrayAdapter<Item> {



    public  ArrayItemAdapter(Context context,int resource,List<Item> objects)
    {
     super(context,resource,objects);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.item_view, parent, false);
        }
     final Item item=getItem(position);
        TextView Name=(TextView) listItem.findViewById(R.id.name);
        TextView location=(TextView) listItem.findViewById(R.id.location);
        ImageView Image=(ImageView) listItem.findViewById(R.id.image);

        Name.setText(item.getName());
        location.setText(item.getLocation());
        Image.setImageResource(item.getUrl());
        return listItem;
    }
}
