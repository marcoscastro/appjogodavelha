package com.mcastrosouza.jogodavelha;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by marcos on 23/12/16.
 */

public class GameActivity extends Activity {
    private TextView textView;
    private String jogador1, jogador2;
    private int vez;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        // obtendo os nomes dos jogadores
        jogador1 = getIntent().getStringExtra("JOGADOR1");
        jogador2 = getIntent().getStringExtra("JOGADOR2");

        // obtendo a textview
        textView = (TextView)findViewById(R.id.viewVez);
        textView.setText(jogador1 + ", é a sua vez!");

        // jogador1 começa
        vez = 1;
    }
}