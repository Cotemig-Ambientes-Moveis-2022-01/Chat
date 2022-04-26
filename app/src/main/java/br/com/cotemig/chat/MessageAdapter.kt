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

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        if (list[p0].type == 1) {
            var view = LayoutInflater.from(context).inflate(R.layout.item_message_blue, null)

            var message = view.findViewById<TextView>(R.id.message)
            message.text = list[p0].message

            return view;
        } else if (list[p0].type == 2) {
            var view = LayoutInflater.from(context).inflate(R.layout.item_message_gray, null)

            var message = view.findViewById<TextView>(R.id.message)
            message.text = list[p0].message

            return view;
        } else {
            var view = LayoutInflater.from(context).inflate(R.layout.item_message_photo, null)

            var photo = view.findViewById<ImageView>(R.id.photo)
            photo.setImageResource(list[p0].picture)

            return view;
        }
    }
}