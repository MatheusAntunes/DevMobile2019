package com.example.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText  mensagemEdtitText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Inflando a view
        setContentView(R.layout.activity_main);
        mensagemEdtitText = findViewById(R.id.mensagemEditText);
    }

    public void enviarMensagem (View view){
       /* Toast.makeText(this, "Funcionou !", Toast.LENGTH_SHORT).show();*/
        Intent i = new Intent(this, ExibeMensagemActivity.class);
        String msg = mensagemEdtitText.getEditableText().toString();
        i.putExtra("mensagem",msg);
        startActivity(i);
    }


}
