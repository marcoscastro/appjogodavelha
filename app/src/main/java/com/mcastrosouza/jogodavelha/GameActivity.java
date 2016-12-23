package com.mcastrosouza.jogodavelha;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by marcos on 23/12/16.
 */

public class GameActivity extends Activity {
    private TextView textView;
    private Button my_btn;
    private String jogador1, jogador2;
    private int vez;
    private char[][] jogo;

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

        jogo = new char[3][3];

        // inicializa a matriz tudo com '-'
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                jogo[i][j] = '-';
            }
        }
    }

    public void marca(int btn) {

        if(btn == 1) {
            if(jogo[0][0] == '-') {
                my_btn = (Button)findViewById(R.id.btn1);
                if(vez == 1) {
                    jogo[0][0] = 'X';
                    vez = 2;
                    my_btn.setText("X");
                } else {
                    jogo[0][0] = 'O';
                    vez = 1;
                    my_btn.setText("O");
                }
            }
        }

        if(btn == 2) {
            if(jogo[0][1] == '-') {
                my_btn = (Button)findViewById(R.id.btn2);
                if(vez == 1) {
                    jogo[0][1] = 'X';
                    vez = 2;
                    my_btn.setText("X");
                } else {
                    jogo[0][1] = 'O';
                    vez = 1;
                    my_btn.setText("O");
                }
            }
        }

        if(btn == 3) {
            if(jogo[0][2] == '-') {
                my_btn = (Button)findViewById(R.id.btn3);
                if(vez == 1) {
                    jogo[0][2] = 'X';
                    vez = 2;
                    my_btn.setText("X");
                } else {
                    jogo[0][2] = 'O';
                    vez = 1;
                    my_btn.setText("O");
                }
            }
        }

        if(btn == 4) {
            if(jogo[1][0] == '-') {
                my_btn = (Button)findViewById(R.id.btn4);
                if(vez == 1) {
                    jogo[1][0] = 'X';
                    vez = 2;
                    my_btn.setText("X");
                } else {
                    jogo[1][0] = 'O';
                    vez = 1;
                    my_btn.setText("O");
                }
            }
        }

        if(btn == 5) {
            if(jogo[1][1] == '-') {
                my_btn = (Button)findViewById(R.id.btn5);
                if(vez == 1) {
                    jogo[1][1] = 'X';
                    vez = 2;
                    my_btn.setText("X");
                } else {
                    jogo[1][1] = 'O';
                    vez = 1;
                    my_btn.setText("O");
                }
            }
        }

        if(btn == 6) {
            if(jogo[1][2] == '-') {
                my_btn = (Button)findViewById(R.id.btn6);
                if(vez == 1) {
                    jogo[1][2] = 'X';
                    vez = 2;
                    my_btn.setText("X");
                } else {
                    jogo[1][2] = 'O';
                    vez = 1;
                    my_btn.setText("O");
                }
            }
        }

        if(btn == 7) {
            if(jogo[2][0] == '-') {
                my_btn = (Button)findViewById(R.id.btn7);
                if(vez == 1) {
                    jogo[2][0] = 'X';
                    vez = 2;
                    my_btn.setText("X");
                } else {
                    jogo[2][0] = 'O';
                    vez = 1;
                    my_btn.setText("O");
                }
            }
        }

        if(btn == 8) {
            if(jogo[2][1] == '-') {
                my_btn = (Button)findViewById(R.id.btn8);
                if(vez == 1) {
                    jogo[2][1] = 'X';
                    vez = 2;
                    my_btn.setText("X");
                } else {
                    jogo[2][1] = 'O';
                    vez = 1;
                    my_btn.setText("O");
                }
            }
        }

        if(btn == 9) {
            if(jogo[2][2] == '-') {
                my_btn = (Button)findViewById(R.id.btn9);
                if(vez == 1) {
                    jogo[2][2] = 'X';
                    vez = 2;
                    my_btn.setText("X");
                } else {
                    jogo[2][2] = 'O';
                    vez = 1;
                    my_btn.setText("O");
                }
            }
        }
    }

    public void btn1() {
        marca(1);
    }

    public void btn2() {
        marca(2);
    }

    public void btn3() {
        marca(3);
    }

    public void btn4() {
        marca(4);
    }

    public void btn5() {
        marca(5);
    }

    public void btn6() {
        marca(6);
    }

    public void btn7() {
        marca(7);
    }

    public void btn8() {
        marca(8);
    }

    public void btn9() {
        marca(9);
    }
}