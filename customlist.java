package com.example.pc.customlist;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by PC on 16/11/2017.
 */

public class customlist extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemname;
    private final String[] descriptionItem;
    private final Integer[] imgid;


    public customlist(Activity context, String[] itemname, Integer[] imgid, String[] descriptionItem) {
        super(context, R.layout.activity_custom, itemname);
        // TODO Auto-generated constructor stub

        this.context = context;
        this.itemname = itemname;
        this.descriptionItem = descriptionItem;
        this.imgid = imgid;


    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.activity_custom, null, true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView extratxt = (TextView) rowView.findViewById(R.id.textView1);

        //dari instansiasi diatas, dimasukkan data yang diambil dari array yang ada di MainActivity
        txtTitle.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);
        extratxt.setText(descriptionItem[position]);
        return rowView;

    };

}
