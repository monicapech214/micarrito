package com.example.micarrito;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class descripcion_mujerestacon extends AppCompatActivity {
Button agregarcarrito;
Button regresacate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion_mujerestacon);
        agregarcarrito = (Button)findViewById(R.id.A_carrito);
        regresacate =  (Button)findViewById(R.id.regresarcate);
        agregarcarrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Se ha agregado al carrito", Toast.LENGTH_LONG).show();
            }
        });
        regresacate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(descripcion_mujerestacon.this, categoria_mujeres.class);
                startActivity(i);
            }
        });
    }
}