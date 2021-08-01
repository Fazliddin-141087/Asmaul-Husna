package uz.mobiller.asmaulhusna.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.item_style.view.*
import uz.mobiller.asmaulhusna.R
import uz.mobiller.asmaulhusna.models.AsmaulHusna

class MyAdabterListView(var list: List<AsmaulHusna>) : BaseAdapter() {
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): AsmaulHusna {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var itemView: View
        if (convertView == null) {
            itemView =
                LayoutInflater.from(parent?.context).inflate(R.layout.item_style, parent, false)
        } else {
            itemView = convertView
        }
        itemView.name.text = list[position].name
        itemView.number.text = list[position].number.toString()
        itemView.img.setImageResource(list[position].img!!)
        return itemView
    }

}