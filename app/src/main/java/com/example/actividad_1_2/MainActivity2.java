package com.example.actividad_1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;

public class MainActivity2 extends AppCompatActivity {

    TextView tex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tex = findViewById(R.id.texv);
        String valor = getIntent().getStringExtra("nombre");

        tex.setText("Hola : " + valor);

        getActionBar().hide();

    }
}