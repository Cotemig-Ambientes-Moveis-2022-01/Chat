package br.com.cotemig.chat.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import br.com.cotemig.chat.R
import br.com.cotemig.chat.models.Account
import coil.load

class FriendsAdapter(var context: Context, var list: List<Account>) : BaseAdapter() {

    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(p0: Int): Any {
        TODO("Not yet implemented")
    }

    override fun getItemId(p0: Int): Long {
        TODO("Not yet implemented")
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var view = LayoutInflater.from(context).inflate(R.layout.item_friend, null)

        var avatar = view.findViewById<ImageView>(R.id.avatar)
        avatar.load(list[p0].picture)
        var name = view.findViewById<TextView>(R.id.name)
        name.text = list[p0].name

        return view
    }
}