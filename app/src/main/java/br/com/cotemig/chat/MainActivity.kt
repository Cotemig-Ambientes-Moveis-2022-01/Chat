package br.com.cotemig.chat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listMessages = ArrayList<Message>()
        listMessages.add(Message("Hi, son, how are you doing? Today, my father and I went to buy a car, bought a cool car.", 1))
        listMessages.add(Message("Oh! Cool Send me photo)", 2))
        listMessages.add(Message("Ok\uD83D\uDE09", 1))
        listMessages.add(Message(R.drawable.photo, 3))
        listMessages.add(Message("Will we arrive tomorrow?", 1))

        var messages = findViewById<ListView>(R.id.messages)
        messages.adapter = MessageAdapter(this, listMessages)

    }
}