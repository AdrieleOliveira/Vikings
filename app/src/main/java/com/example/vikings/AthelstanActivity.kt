package com.example.vikings

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_athelstan.*

class AthelstanActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_athelstan)

        val amigo = intent.extras?.getString("amigo");

        if(amigo != null){
            tvNagecaoAthelstan.visibility = View.VISIBLE
            tvAmigoAthelstan.setText(amigo)
            tvAmigoAthelstan.visibility = View.VISIBLE
        }

        btAthelstanToRagnar.setOnClickListener {
            val name = "Athelstan";

            val bundle = Bundle()
            bundle.putString("amigo", name);

            val intent = Intent(this, RagnarActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        btAthelstanToBjorn.setOnClickListener {
            val name = "Athelstan";

            val bundle = Bundle()
            bundle.putString("amigo", name);

            val intent = Intent(this, BjornActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}
