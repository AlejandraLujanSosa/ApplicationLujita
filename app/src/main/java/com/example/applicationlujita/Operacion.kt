package com.example.applicationlujita

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_operacion.*

class Operacion : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operacion)


        ConsultarPreciosBtn.setOnClickListener {

                val intent: Intent = Intent(this, CodigoQR::class.java)
                startActivity(intent)
                finish()
            }
    }
}
