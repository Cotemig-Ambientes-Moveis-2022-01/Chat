package br.com.cotemig.chat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list = ArrayList<Message>()
        list.add(Message("Hi, son, how are you doing? Today, my father and I went to buy a car, bought a cool car.", 1))
        list.add(Message("Oh! Cool Send me photo", 2))
        list.add(Message("Ok\uD83D\uDE09", 1))
        list.add(Message("Will we arrive tomorrow?", 1))

        var chat = findViewById<ListView>(R.id.chat)
        chat.adapter = MessageAdapter(this, list)
    }
}