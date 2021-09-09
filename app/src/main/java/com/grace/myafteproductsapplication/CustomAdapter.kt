package com.grace.myafteproductsapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(var context: Context, var data:ArrayList<Item>):BaseAdapter() {
    private class ViewHolder(row:View?){
        var mTxtName:TextView
        var mTvDescription:TextView
        var mTvPrice:TextView
        var mPersonPic:ImageView
        init {
            this.mTxtName = row?.findViewById(R.id.mTvName) as TextView
            this.mTvDescription = row?.findViewById(R.id.mTvDesc) as TextView
            this.mTvPrice = row?.findViewById(R.id.mTvPrice) as TextView
            this.mPersonPic = row?.findViewById(R.id.mImage) as ImageView
        }
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view:View?
        var viewHolder:ViewHolder
        if (convertView == null){
            var layout = LayoutInflater.from(context)
            view = layout.inflate(R.layout.item_layout,parent,false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        }else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        var item:Item = getItem(position) as Item
        viewHolder.mTxtName.text = item.name
        viewHolder.mTvDescription.text = item.description
        viewHolder.mTvPrice.text = item.price
        viewHolder.mPersonPic.setImageResource(item.photo)
        return view as View
    }

    override fun getItem(position: Int): Any {
        return  data.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return data.count()
    }
}



