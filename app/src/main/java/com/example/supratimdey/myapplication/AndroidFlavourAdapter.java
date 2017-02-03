package com.example.supratimdey.myapplication;

import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
/**
 * Created by Supratim Dey on 11/2/2016.
 */

public class AndroidFlavourAdapter extends ArrayAdapter<AndroidFlavour> {

    public AndroidFlavourAdapter(Activity context, List<AndroidFlavour> androidFlavours) {
        super(context,0, androidFlavours);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        AndroidFlavour androidFlavour= getItem(position);
        if(convertView ==null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_flavour, parent, false);
        }

        ImageView iconView= (ImageView) convertView.findViewById(R.id.list_item_icon);
        iconView.setImageResource(androidFlavour.image);

        TextView versionName = (TextView) convertView.findViewById(R.id.list_item_version_name);
        versionName.setText(androidFlavour.versionName);

        TextView versionNumber = (TextView) convertView.findViewById(R.id.list_item_version_number);
        versionNumber.setText(androidFlavour.VersionNumber);

        return convertView;
    }
}
