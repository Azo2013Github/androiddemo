package com.pgrsoft.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button0;
    private Button buttonPor;
    private Button buttonPorcentaje;
    private Button buttonMas;
    private Button buttonMenos;
    private Button buttonPunto;
    private Button buttonIgual;
    private Button buttonCE;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.display);
        //Poner valores al textView
        textView.setText(textView.getText());
        buttonCE = (Button) findViewById(R.id.idButtonCE);
        button0 = (Button) findViewById(R.id.idButtonZero);
        button1 = (Button) findViewById(R.id.idButton1);
        button2 = (Button) findViewById(R.id.idButton2);
        button3 = (Button) findViewById(R.id.idButton3);
        button4 = (Button) findViewById(R.id.idButton4);
        button5 = (Button) findViewById(R.id.idButton5);
        button6 = (Button) findViewById(R.id.idButton6);
        button7 = (Button) findViewById(R.id.idButton7);
        button8 = (Button) findViewById(R.id.idButton8);
        button9 = (Button) findViewById(R.id.idButton9);
        buttonPor = (Button) findViewById(R.id.idButtonPor);
        buttonPorcentaje = (Button) findViewById(R.id.idButtonPorcentaje);
        buttonMas = (Button) findViewById(R.id.idButtonMenos);

    }

    public void buttonPulsado(View view){
        buttonCE = (Button) findViewById(R.id.idButtonCE);
        Toast.makeText(getApplicationContext(), "Funciona ", Toast.LENGTH_LONG).show();
        int cifrado =0;
        String accion="";
        switch (view.getId()){
            case R.id.idButtonZero: cifrado = 0;
                                    break;
            case R.id.idButton1: cifrado = 1;
                                    break;
            case R.id.idButton2: cifrado = 2;
                                    break;
            case R.id.idButton3: cifrado = 3;
                                    break;
            case R.id.idButton4: cifrado = 4;
                                    break;
            case R.id.idButton5: cifrado = 5;
                                    break;
            case R.id.idButton6: cifrado = 6;
                                    break;
            case R.id.idButton7: cifrado = 7;
                                    break;
            case R.id.idButton8: cifrado = 8;
                                    break;
            case R.id.idButton9: cifrado = 9;
                                    break;

        }

    }
}
