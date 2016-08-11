package com.example.rtagata.olamundo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * Created by rtagata on 11/08/2016.
 */
public class OlaMundoActivity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ola_mundo);
        Button copiar = (Button) findViewById(R.id._button);


        copiar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                EditText recuperaTexto = (EditText) findViewById(R.id.edit_textext);
                Log.i("Meu Texto: ", recuperaTexto.getText().toString());

                TextView visualizaTexto = (TextView) findViewById(R.id.text_view);
                Log.i("Meu texto: " , visualizaTexto.getText().toString());
                visualizaTexto.setText(recuperaTexto.getText().toString());
            }
        });
        Log.i("CICLO DE VIDA", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("CICLO DE VIDA", "onStart");
    }

    @Override
    protected void onResume(){
     super.onResume();
        Log.i("CICLO DE VIDA", "onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("CICLO DE VIDA", "onPause");
    }

    @Override
    protected  void onStop(){
        super.onStop();
        Log.i("CICLO DE VIDA", "onStop");
    }

    @Override
    protected  void onDestroy(){
        super.onDestroy();
        Log.i("CICLO DE VIDA", "onDestroy");
    }

}
