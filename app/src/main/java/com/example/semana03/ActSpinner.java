package com.example.semana03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class ActSpinner extends AppCompatActivity {
    EditText et1, et2;
    Spinner spOperaciones;
    String data[]  = {"Suma", "Resta"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_spinner);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        asignarReferencias();
    }

    private void asignarReferencias() {
        spOperaciones = findViewById(R.id.spOperaciones);
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,data);
        spOperaciones.setAdapter(adaptador);
    }
    public void  btnCalcular(View view){
        int resultado;
        int num1= 0, num2=0;
        if (spOperaciones.getSelectedItem().toString() == "Suma"){
         resultado =Integer.parseInt(et1.getText().toString()) + Integer.parseInt(et2.getText().toString()) ;
            Toast.makeText(this,("La suma es: "+ resultado), Toast.LENGTH_LONG).show();}
        if (spOperaciones.getSelectedItem().toString() != "Suma"){
             resultado = Integer.parseInt(et1.getText().toString()) - Integer.parseInt(et2.getText().toString());
                Toast.makeText(this,("La resta es: "+ resultado), Toast.LENGTH_LONG).show();
            }


    }
}
