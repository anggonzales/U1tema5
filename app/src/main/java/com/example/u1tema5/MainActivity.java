package com.example.u1tema5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mimapa(View view) {
        startActivity(new Intent(this , MiMapa.class));
    }

    public void milyne(View view) {
        startActivity(new Intent(this , MiPolyLine.class));
    }

    public void mipolygon(View view) {
        startActivity(new Intent(this , MiPolygon.class));
    }

    public void mimapacalor(View view) {
        startActivity(new Intent(this , MapaCalor.class));
    }

    public void miclustermap(View view) {
        startActivity(new Intent(this , MiClusterMap.class));
    }

    public void midistancia(View view) {
        startActivity(new Intent(this , DistanciaDosPuntos.class));
    }


}
