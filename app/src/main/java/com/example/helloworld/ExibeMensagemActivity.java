package com.example.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ExibeMensagemActivity extends AppCompatActivity {

    private TextView mensagemTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //aqui inflo a view
        setContentView(R.layout.activity_exibe_mensagem);

        //somente depois eu faço a busca
        mensagemTextView = findViewById(R.id.mensagemTextView);
        Intent origemInten = getIntent();
        String msg = origemInten.getStringExtra("mensagem");

        mensagemTextView.setText(msg);
    }

}
