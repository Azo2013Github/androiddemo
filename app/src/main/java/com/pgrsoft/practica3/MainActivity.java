package com.pgrsoft.practica3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    //Declaracion de las view que es TextView
    private TextView textView;
    private Date fecha;

    //Vamos a monotorizar ciertas cosas
    static{
        Log.d("INFO", "SE INICIALIZA EL MUNDO ESTATICO");
    }

    public MainActivity(){
        Log.d("INFO", "DENTRO DEL METODO CONSTRUCTOR");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("INFO", "DENTRO DE onCreate()");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.display);
        fecha = new Date();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("INFO", "DENTRO DE onPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("INFO", "DENTRO DE onRESUME()");
        long millisegundos = (new Date()).getTime() - fecha.getTime();
        StringBuilder sb = new StringBuilder();
        sb.append(millisegundos/1000).append(": millisegundos");
        textView.setText(sb.toString());
    }
}
