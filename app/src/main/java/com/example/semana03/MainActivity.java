package com.example.semana03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnDeshabi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        asignarReferencias();
    }

    private void asignarReferencias() {
        btnDeshabi = findViewById(R.id.btn_inactivo);
    }

    public void botonGrabar(View view){
        Toast.makeText(this,"Clic en guardar", Toast.LENGTH_LONG).show();
    }
    public void botonDeshabilitar(View view) {
        btnDeshabi.setEnabled(false);
    }
    public void botonImage(View view) {
        Toast.makeText(this,"Click en el boton imagen", Toast.LENGTH_LONG).show();
    }

}
