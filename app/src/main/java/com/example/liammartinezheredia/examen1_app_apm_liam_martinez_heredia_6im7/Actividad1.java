package com.example.liammartinezheredia.examen1_app_apm_liam_martinez_heredia_6im7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Actividad1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);
    }
    public void onClickConvertir (View miView){

        //division
        double Result;
        EditText Txtpesos =(EditText)findViewById(R.id.Txt_pesos);
        String pesos = Txtpesos.getText().toString();
        int money = Integer.parseInt(pesos);
        Result = money / 15;
        String conv = Double.toString(Result);


        //iniciar actvidad
        Intent Act2 = new Intent(Actividad1.this,Actividad2.class);
        startActivity(Act2);
        finish();

        //crearbundle
        Intent envia = new Intent(this, Actividad2.class);
        Bundle conversion = new Bundle();
        conversion.putString("Resultado", conv);
        envia.putExtras(conversion);
        startActivity(envia);





    }
}
