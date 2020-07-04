package com.example.vikings

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_floki.*

class FlokiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_floki)

        val amigo = intent.extras?.getString("amigo");

        if(amigo != null){
            tvNavegacaoFloki.visibility = View.VISIBLE
            tvAmigoFloki.setText(amigo)
            tvAmigoFloki.visibility = View.VISIBLE
        }

        btFlokiToRagnar.setOnClickListener {
            val name = "Floki";

            val bundle = Bundle()
            bundle.putString("amigo", name);

            val intent = Intent(this, RagnarActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}
