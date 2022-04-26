package br.com.cotemig.chat.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import br.com.cotemig.chat.R
import br.com.cotemig.chat.models.Account
import br.com.cotemig.chat.services.RetrofitInitializer
import br.com.cotemig.chat.ui.adapters.FriendsAdapter
import retrofit2.Call
import retrofit2.Response

class FriendsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friends)

        getFriends()
    }

    fun getFriends() {

        var s = RetrofitInitializer().serviceFriends()
        var call = s.getFriend("71801138")

        call.enqueue(object : retrofit2.Callback<List<Account>> {
            override fun onResponse(call: Call<List<Account>>, response: Response<List<Account>>) {
                response.body()?.let {

                    Toast.makeText(this@FriendsActivity, "Total: ${it.size}", Toast.LENGTH_LONG)
                        .show()

                    showFriends(it)

                }
            }

            override fun onFailure(call: Call<List<Account>>, t: Throwable) {

            }
        })

    }

    fun showFriends(list: List<Account>) {
        var friends = findViewById<ListView>(R.id.friends)
        friends.adapter = FriendsAdapter(this, list)
    }
}