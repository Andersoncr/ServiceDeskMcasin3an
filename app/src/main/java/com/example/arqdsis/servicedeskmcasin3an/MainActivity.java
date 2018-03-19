package com.example.arqdsis.servicedeskmcasin3an;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    private EditText txtNome;
    public static final String NOME = "com.example.arqdsis.servicedeskmcasin3an";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNome = (EditText)findViewById(R.id.busca_fila);
    }

    public void buscarChamados(View view){
        Intent intent = new Intent(this, ListarChamadosActivity.class);
        String nome = txtNome.getText().toString();
        intent.putExtra(NOME, nome);
        startActivity(intent);
    }
}
