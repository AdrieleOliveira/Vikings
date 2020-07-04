package com.example.vikings

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btAthelstan.setOnClickListener {
            val intent = Intent(this, AthelstanActivity::class.java)
            startActivity(intent);
        }

        btBjorn.setOnClickListener {
            val intent = Intent(this, BjornActivity::class.java)
            startActivity(intent)
        }

        btFloki.setOnClickListener {
            val intent = Intent(this, FlokiActivity::class.java)
            startActivity(intent)
        }

        btLagertha.setOnClickListener {
            val intent = Intent(this, LagerthaActivity::class.java)
            startActivity(intent)
        }

        btRagnar.setOnClickListener {
            val intent = Intent(this, RagnarActivity::class.java)
            startActivity(intent)
        }

        btRollo.setOnClickListener {
            val intent = Intent(this, RolloActivity::class.java)
            startActivity(intent)
        }
    }
}
