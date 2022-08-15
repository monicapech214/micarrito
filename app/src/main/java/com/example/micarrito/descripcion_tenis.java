package com.example.micarrito;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class descripcion_tenis extends AppCompatActivity {
Button carritotenis;
Button regresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion_tenis);
        carritotenis=(Button) findViewById(R.id.A_carritotenis);
        regresar = (Button) findViewById(R.id.regresar);
        carritotenis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Se ha agregado al carrito", Toast.LENGTH_LONG).show();
            }
        });
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(descripcion_tenis.this, categoria_mujeres.class);
                startActivity(i);
            }
        });
    }
}