package com.example.computech;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InicioSesion extends AppCompatActivity {

    private Button mButtonRegistrarUsuario;
    private Button mButtonMenuUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);


        mButtonRegistrarUsuario = findViewById(R.id.ButtonRegistrar);
        mButtonMenuUsuario= findViewById(R.id.ButtonIniciarSesion);

        mButtonRegistrarUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), RegistrarUsuarioActivity.class));
            }
        });

        mButtonMenuUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MenuActivity.class));
            }
        });
    }
}