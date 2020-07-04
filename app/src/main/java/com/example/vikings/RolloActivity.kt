package com.example.vikings

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_rollo.*

class RolloActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rollo)

        val amigo = intent.extras?.getString("amigo");

        if(amigo != null){
            tvNavegacaoRollo.visibility = View.VISIBLE
            tvAmigoRollo.setText(amigo)
            tvAmigoRollo.visibility = View.VISIBLE
        }

        btRolloToBjorn.setOnClickListener {
            val name = "Rollo";

            val bundle = Bundle()
            bundle.putString("amigo", name);

            val intent = Intent(this, RolloActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}
