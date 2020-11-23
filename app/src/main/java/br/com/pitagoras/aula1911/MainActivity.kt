package br.com.pitagoras.aula1911

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val list = mutableListOf<String>()

        (1..100).forEachIndexed { index, _ ->
            list.add("Item $index")
        }

        rvContent.run {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = ItemAdapter(list) {
                adapterOnClick(it)
            }
        }
    }

    private fun adapterOnClick(item: String) {
        val intent = Intent(this, ItemDetailActivity()::class.java)
        intent.putExtra(ITEM_ID, item)
        startActivity(intent)
    }

    companion object {
        const val ITEM_ID = "my item"
    }
}