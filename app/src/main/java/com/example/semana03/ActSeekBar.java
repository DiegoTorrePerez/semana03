package com.example.semana03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class ActSeekBar extends AppCompatActivity {

    TextView txtPorcentaje;
    ProgressBar pbBarra;
    SeekBar sb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_seek_bar);
        asignarReferencias();
    }

    private void asignarReferencias() {
        txtPorcentaje = findViewById(R.id.txtPorcentaje);
        pbBarra = findViewById(R.id.pbBarra);
        sb = findViewById(R.id.sb);
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                pbBarra.setProgress(progress);
                txtPorcentaje.setText(progress+" %");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
