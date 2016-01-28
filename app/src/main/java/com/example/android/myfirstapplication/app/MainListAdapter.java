package com.example.android.myfirstapplication.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.myfirstapplication.app.models.SampleModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Sunil Kumar on 23-12-2015. Bheemesh commit 1 for rebase
 */



public class MainListAdapter extends BaseAdapter
{
    ArrayList myList = new ArrayList();
    LayoutInflater inflater;
    Context context;

    public MainListAdapter(Context context, ArrayList myList)
    {
        this.myList = myList;
        this.context = context;
        inflater = LayoutInflater.from(this.context);
    }

    @Override
    public int getCount() {
        return this.myList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.myList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        MyViewHolder mViewHolder;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.list_item, parent, false);
            mViewHolder = new MyViewHolder(convertView);
            convertView.setTag(mViewHolder);
        } else {
            mViewHolder = (MyViewHolder) convertView.getTag();
        }

        SampleModel currentSampleMdl = (SampleModel)getItem(position);

        mViewHolder.tvTitle.setText(currentSampleMdl.getTitle());
        mViewHolder.tvSubTitle.setText(currentSampleMdl.getSubTitle());
        mViewHolder.ivIcon.setImageResource(currentSampleMdl.getImgSrc());

        return convertView;
    }

    private class MyViewHolder {
        TextView tvTitle, tvSubTitle;
        ImageView ivIcon;

        public MyViewHolder(View item) {
            tvTitle = (TextView) item.findViewById(R.id.list_item_title);
            tvSubTitle = (TextView) item.findViewById(R.id.list_item_subTitle);
            ivIcon = (ImageView) item.findViewById(R.id.list_item_imageView);
        }
    }

    public synchronized void removeItem(Object itm){
        myList.remove(itm);
    }
}


