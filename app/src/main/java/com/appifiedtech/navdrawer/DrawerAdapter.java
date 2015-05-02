package com.appifiedtech.navdrawer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by ANDDEV-2 on 4/20/2015.
 */
public class DrawerAdapter extends BaseAdapter{

    Context context;
    String []listArr;
    public DrawerAdapter(Context context,String []listArr){
        this.context = context;
        this.listArr = listArr;
    }
    @Override
    public int getCount() {
        return listArr.length;
    }

    @Override
    public Object getItem(int position) {
        return listArr[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    static class ViewHolder{
        TextView textViewTitle;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_row,null);
            viewHolder = new ViewHolder();
            viewHolder.textViewTitle = (TextView) convertView.findViewById(R.id.title);
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.textViewTitle.setText(listArr[position]);
        return convertView;
    }
}
