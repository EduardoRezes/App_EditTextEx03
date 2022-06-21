package com.example.texteditor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    /**
     * Declaração de Variaveis*/
    private TextView textView;
    private EditText edtText;
    private SeekBar seekBar;
    private Button btnUpload;
    private CheckBox checkNegrito;
    private CheckBox checkItalico;
    private CheckBox checkMaiusculo;
    private RadioGroup radioGroupColor;
    private RadioButton rbRed;
    private RadioButton rbGreen;
    private RadioButton rbBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        edtText = findViewById(R.id.edtText);
        seekBar = findViewById(R.id.seekBar);
        btnUpload = findViewById(R.id.btnUpload);
        checkNegrito = findViewById(R.id.checkNegrito);
        checkItalico = findViewById(R.id.checkItalico);
        checkMaiusculo = findViewById(R.id.checkMaiusculo);
        radioGroupColor = findViewById(R.id.radioGroupColor);
        rbRed = findViewById(R.id.rbRed);
        rbGreen = findViewById(R.id.rbGreen);
        rbBlue = findViewById(R.id.rbBlue);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textView.setTextSize(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    @Override
    public void onClick(View view) {
        textView.setText(edtText.getText().toString());
    }

    /**
     * Verifica os checkBox marcados pelo usuario.*/
    public void cboxClick(View view){
        if(checkNegrito.isChecked()){
            textView.setTypeface(null, Typeface.BOLD);
        }
        if(checkItalico.isChecked()){
            textView.setTypeface(null,Typeface.ITALIC);

        }
        if(checkMaiusculo.isChecked()){
            textView.setAllCaps(true);
        }
    }
    /**
     * Verifica os RadioButton das cores selecionadas pelo usuario*/
    public void radioClick(View view){

        if(rbRed.isChecked()){
            textView.setTextColor(Color.RED);
        }
        if(rbGreen.isChecked()){
            textView.setTextColor(Color.GREEN);
        }
        if(rbBlue.isChecked()){
            textView.setTextColor(Color.BLUE);
        }
    }
}