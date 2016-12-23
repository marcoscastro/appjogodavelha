package com.mcastrosouza.jogodavelha;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by marcos on 23/12/16.
 */

public class MainActivity extends Activity {
    private String jogador1;
    private String jogador2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jogar(View v) {

        // obtém os nomes dos jogadores
        EditText editJogador1 = (EditText)findViewById(R.id.editJogador1);
        EditText editJogador2 = (EditText)findViewById(R.id.editJogador2);

        jogador1 = editJogador1.getText().toString();
        jogador2 = editJogador2.getText().toString();

        if(jogador1.isEmpty())
            jogador1 = "Jogador1";
        if(jogador2.isEmpty())
            jogador2 = "Jogador2";

        // criando um intent
        Intent intent = new Intent(this, GameActivity.class);
        // passando valores para a outra activity
        intent.putExtra("JOGADOR1", jogador1);
        intent.putExtra("JOGADOR2", jogador2);
        // iniciando a outra activity
        startActivity(intent);
    }
}
