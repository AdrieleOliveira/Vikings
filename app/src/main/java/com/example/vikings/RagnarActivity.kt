package com.example.vikings

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_ragnar.*

class RagnarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ragnar)

        val amigo = intent.extras?.getString("amigo");

        if(amigo != null){
            tvNavegacaoRagnar.visibility = View.VISIBLE
            tvAmigoRagnar.setText(amigo)
            tvAmigoRagnar.visibility = View.VISIBLE
        }

        btRagnarToBjorn.setOnClickListener {
            val name = "Ragnar Lothbrok";

            val bundle = Bundle()
            bundle.putString("amigo", name);

            val intent = Intent(this, BjornActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        btRagnarToFloki.setOnClickListener {
            val name = "Ragnar Lothbrok";

            val bundle = Bundle()
            bundle.putString("amigo", name);

            val intent = Intent(this, FlokiActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        btRagnarToLagertha.setOnClickListener {
            val name = "Ragnar Lothbrok";

            val bundle = Bundle()
            bundle.putString("amigo", name);

            val intent = Intent(this, BjornActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

    }
}
