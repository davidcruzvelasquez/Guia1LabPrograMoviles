package com.example.guia1_labprogramoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCalc;
    Button btnLog;
    Button btnDat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Asignando variables a botones
        btnCalc = (Button)findViewById(R.id.btnCalculator);
        btnLog = (Button)findViewById(R.id.btnLogin);
        btnDat = (Button)findViewById(R.id.btnData);

        //Crear metodo para redigir de un layout a otro
        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Variable de conexion, parametros (desde, hasta)
                Intent layCalc = new Intent(MainActivity.this, CalcActivity.class);
                //Iniciar activity
                startActivity(layCalc);
            }
        });

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent layLog = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(layLog);
            }
        });

        btnDat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent layDat = new Intent(MainActivity.this, DataActivity.class);
                startActivity(layDat);
            }
        });
    }
}