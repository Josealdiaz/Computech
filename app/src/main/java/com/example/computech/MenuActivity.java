package com.example.computech;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    private Button mButtonComprarUsuario;
    private Button mButtonAjustesUsuario;
    private Button mButtonUsuarioUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        mButtonComprarUsuario = findViewById(R.id.buttonComprar);
        mButtonAjustesUsuario= findViewById(R.id.buttonAjustes);
        mButtonUsuarioUsuario= findViewById(R.id.buttonUsuario);


        mButtonComprarUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ComprarUsuarioActivity.class));
            }
        });

        mButtonAjustesUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),AjustesActivity.class));
            }
        });
        mButtonUsuarioUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),UsuarioActivity.class));
            }
        });
    }
}