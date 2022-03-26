package mx.edu.tecmm.moviles.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Enlazar Elementos
        val txtConteo = findViewById<TextView>(R.id.txtNumero)
        val boton = findViewById<Button>(R.id.butnAumentar)
        val restablecer = findViewById<Button>(R.id.Resetear)
        var contar = true
        var conteo: Int
        conteo = -1;


        restablecer.setOnClickListener {
            conteo = 0;
            txtConteo.text = "Se A Restablecido"
            txtConteo.text = "$conteo";
        }


        boton.setOnClickListener {
            if (conteo < 10) {
                if (contar) {
                    conteo++;
                } else if (!contar && conteo > 0) {

                    conteo--;

                } else {
                    contar = true;
                    conteo++;
                }
            } else if (conteo == 10) {
                contar = false;
                conteo--
            }
            txtConteo.text = conteo.toString();

        }
    }
}