package daniel.brizuela.menudesplegablebrizz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ActivityLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

// Mandar a llamar a los siguientes elementos
        val btnSiguientePantalla = findViewById<Button>(R.id.BtnNext)




        // Programar el boton
        btnSiguientePantalla.setOnClickListener {

            //Navegar entre pantallascon Intent
            val siguientePantalla = Intent(this, MainActivity:: class.java)
            startActivity(siguientePantalla)
    }
    }
}