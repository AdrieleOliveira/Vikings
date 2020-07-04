package com.example.vikings

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_bjorn.*

class BjornActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bjorn)

        val amigo = intent.extras?.getString("amigo");

        if(amigo != null){
            tvNavegacaoBjorn.visibility = View.VISIBLE
            tvAmigoBjorn.setText(amigo)
            tvAmigoBjorn.visibility = View.VISIBLE
        }

        btBjornToAthelstan.setOnClickListener {
            val name = "Bjorn Ironside";

            val bundle = Bundle()
            bundle.putString("amigo", name);

            val intent = Intent(this, AthelstanActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        btBjornToFloki.setOnClickListener {
            val name = "Bjorn Ironside";

            val bundle = Bundle()
            bundle.putString("amigo", name);

            val intent = Intent(this, FlokiActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        btBjornToLagertha.setOnClickListener {
            val name = "Bjorn Ironside";

            val bundle = Bundle()
            bundle.putString("amigo", name);

            val intent = Intent(this, LagerthaActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        btBjornToRagnar.setOnClickListener {
            val name = "Bjorn Ironside";

            val bundle = Bundle()
            bundle.putString("amigo", name);

            val intent = Intent(this, RagnarActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }


    }
}
