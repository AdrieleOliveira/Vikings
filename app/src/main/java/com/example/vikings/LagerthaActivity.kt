package com.example.vikings

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_lagertha.*

class LagerthaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lagertha)

        val amigo = intent.extras?.getString("amigo");

        if(amigo != null){
            tvNavegacaoLagertha.visibility = View.VISIBLE
            tvAmigoLagertha.setText(amigo)
            tvAmigoLagertha.visibility = View.VISIBLE
        }

        btLagerthaToBjorn.setOnClickListener {
            val name = "Lagertha";

            val bundle = Bundle()
            bundle.putString("amigo", name);

            val intent = Intent(this, BjornActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        btLagerthaToRagnar.setOnClickListener {
            val name = "Lagertha";

            val bundle = Bundle()
            bundle.putString("amigo", name);

            val intent = Intent(this, RagnarActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}
