package com.example.semana03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class List extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView lstGenero;
    String[] matriz = new String[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        matriz[0]= "Pop";
        matriz[1]= "Punk";
        matriz[2]= "Musica Clasica";
        matriz[3]= "Opera";
        matriz[4]= "Rock";
        matriz[5]= "Salsa";
        asignarReferencias();

    }
    private void asignarReferencias() {
        lstGenero = findViewById(R.id.lstGeneros);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,matriz);
        lstGenero.setAdapter(adaptador);
        lstGenero.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String nombre;
        nombre = ((TextView)view).getText().toString();
        Toast.makeText(this,"Genero seleccionado: "+ nombre+ "\nPosicion: "+ position, Toast.LENGTH_SHORT).show();
    }
}
