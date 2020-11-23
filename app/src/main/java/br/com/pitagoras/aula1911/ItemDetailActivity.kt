package br.com.pitagoras.aula1911

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_item_detail.*

class ItemDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_detail)

        val bundle: Bundle? = intent.extras

        if (bundle != null) {
            textView2.text = bundle.getString(ITEM_ID)
        }
    }


    companion object {
        const val ITEM_ID = "my item"
    }
}