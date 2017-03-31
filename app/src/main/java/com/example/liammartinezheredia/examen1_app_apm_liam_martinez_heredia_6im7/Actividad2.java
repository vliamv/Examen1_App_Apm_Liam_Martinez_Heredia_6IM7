package com.example.liammartinezheredia.examen1_app_apm_liam_martinez_heredia_6im7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Actividad2 extends AppCompatActivity {
    TextView conversion;
    String num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        conversion =(TextView) findViewById(R.id.resultado);

        Bundle recibir = this.getIntent().getExtras();
        num = recibir.getString("Resultado");

        conversion.setText(num + "  dolares ");
    }




    public void onClickEnviar(View miview){
        try {
            Toast.makeText(this, "Envia tu correo ", Toast.LENGTH_SHORT).show();
            Intent enviamail = new Intent(Intent.ACTION_SEND);
            enviamail.setType("text/plain");
            enviamail.putExtra(Intent.EXTRA_EMAIL, new String[] { "eoropeza@ipn.mx" } );
            enviamail.putExtra(Intent.EXTRA_SUBJECT, "  examen 1er parcial");
            enviamail.putExtra(Intent.EXTRA_TEXT,"son " + num + "  dolares");

            startActivity(enviamail);

        }
        catch(Exception e){
            Toast.makeText(this,"Ya valio",Toast.LENGTH_SHORT).show();
        }
    }
}
