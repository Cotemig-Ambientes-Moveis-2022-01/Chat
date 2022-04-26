package br.com.cotemig.chat

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class MessageAdapter(var context: Context, var list: List<Message>) : BaseAdapter() {

    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(p0: Int): Any {
        return ""
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {
        if(list[position].type == 1) {
            var view = LayoutInflater.from(context).inflate(R.layout.item_message_blue, null)

            var message = view.findViewById<TextView>(R.id.message)
            message.text = list[position].message

            return view
        }else{
            var view = LayoutInflater.from(context).inflate(R.layout.item_message_grey, null)

            var message = view.findViewById<TextView>(R.id.message)
            message.text = list[position].message

            return view
        }
    }
}