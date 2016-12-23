package com.mcastrosouza.jogodavelha;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
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
    private int vez, vencedor;
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

        vez = 1; // jogador1 começa
        vencedor = -1; // incialmente não há resultado

        jogo = new char[3][3];

        // inicializa a matriz tudo com '-'
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                jogo[i][j] = '-';
            }
        }
    }

    public int verificarCampeao() {

        // verificando jogo do jogador 1 nas linhas
        if(jogo[0][0] == 'X' && jogo[0][1] == 'X' && jogo[0][2] == 'X') {
            return 1;
        }
        if(jogo[1][0] == 'X' && jogo[1][1] == 'X' && jogo[1][2] == 'X') {
            return 1;
        }
        if(jogo[2][0] == 'X' && jogo[2][1] == 'X' && jogo[2][2] == 'X') {
            return 1;
        }

        // verificando jogo do jogador 1 nas colunas
        if(jogo[0][0] == 'X' && jogo[1][0] == 'X' && jogo[2][0] == 'X') {
            return 1;
        }
        if(jogo[0][1] == 'X' && jogo[1][1] == 'X' && jogo[2][1] == 'X') {
            return 1;
        }
        if(jogo[0][2] == 'X' && jogo[1][2] == 'X' && jogo[2][2] == 'X') {
            return 1;
        }

        // verificando jogo do jogador 1 nas diagonais
        if(jogo[0][0] == 'X' && jogo[1][1] == 'X' && jogo[2][2] == 'X') {
            return 1;
        }
        if(jogo[0][2] == 'X' && jogo[1][1] == 'X' && jogo[2][0] == 'X') {
            return 1;
        }

        // verificando jogo do jogador 2 nas linhas
        if(jogo[0][0] == 'O' && jogo[0][1] == 'O' && jogo[0][2] == 'O') {
            return 2;
        }
        if(jogo[1][0] == 'O' && jogo[1][1] == 'O' && jogo[1][2] == 'O') {
            return 2;
        }
        if(jogo[2][0] == 'O' && jogo[2][1] == 'O' && jogo[2][2] == 'O') {
            return 2;
        }

        // verificando jogo do jogador 2 nas colunas
        if(jogo[0][0] == 'O' && jogo[1][0] == 'O' && jogo[2][0] == 'O') {
            return 2;
        }
        if(jogo[0][1] == 'O' && jogo[1][1] == 'O' && jogo[2][1] == 'O') {
            return 2;
        }
        if(jogo[0][2] == 'O' && jogo[1][2] == 'O' && jogo[2][2] == 'O') {
            return 2;
        }

        // verificando jogo do jogador 2 nas diagonais
        if(jogo[0][0] == 'O' && jogo[1][1] == 'O' && jogo[2][2] == 'O') {
            return 2;
        }
        if(jogo[0][2] == 'O' && jogo[1][1] == 'O' && jogo[2][0] == 'O') {
            return 2;
        }

        // verifica se houve empate
        boolean empate = true;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(jogo[i][j] == '-') {
                    empate = false;
                    break;
                }
            }
        }

        if(empate) {
            return 0;
        }
        return -1;
    }

    public void marca(int btn) {

        if(vencedor != -1) {
            return;
        }

        textView = (TextView)findViewById(R.id.viewVez);

        if(btn == 1) {
            my_btn = (Button)findViewById(R.id.btn1);
            if(jogo[0][0] == '-') {
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
            my_btn = (Button)findViewById(R.id.btn2);
            if(jogo[0][1] == '-') {
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
            my_btn = (Button)findViewById(R.id.btn3);
            if(jogo[0][2] == '-') {
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
            my_btn = (Button)findViewById(R.id.btn4);
            if(jogo[1][0] == '-') {
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
            my_btn = (Button)findViewById(R.id.btn5);
            if(jogo[1][1] == '-') {
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
            my_btn = (Button)findViewById(R.id.btn6);
            if(jogo[1][2] == '-') {
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
            my_btn = (Button)findViewById(R.id.btn7);
            if(jogo[2][0] == '-') {
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
            my_btn = (Button)findViewById(R.id.btn8);
            if(jogo[2][1] == '-') {
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
            my_btn = (Button)findViewById(R.id.btn9);
            if(jogo[2][2] == '-') {
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

        vencedor = verificarCampeao();
        if(vencedor == 1) {
            textView.setText(jogador1 + ", você ganhou!!");
        } else if(vencedor == 2) {
            textView.setText(jogador2 + ", você ganhou!!");
        } else if(vencedor == 0) {
            textView.setText("Empate :(");
        } else {
            if(vez == 1) {
                textView.setText(jogador1 + ", é a sua vez!");
            } else {
                textView.setText(jogador2 + ", é a sua vez!");
            }
        }

    }

    public void btn1(View v) {
        marca(1);
    }

    public void btn2(View v) {
        marca(2);
    }

    public void btn3(View v) {
        marca(3);
    }

    public void btn4(View v) {
        marca(4);
    }

    public void btn5(View v) {
        marca(5);
    }

    public void btn6(View v) {
        marca(6);
    }

    public void btn7(View v) {
        marca(7);
    }

    public void btn8(View v) {
        marca(8);
    }

    public void btn9(View v) {
        marca(9);
    }

    public void reset(View v) {

        // reseta todas as variáveis
        textView = (TextView)findViewById(R.id.viewVez);
        textView.setText("");
        vez = 1;
        vencedor = -1;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                jogo[i][j] = '-';
            }
        }
        my_btn = (Button)findViewById(R.id.btn1);
        my_btn.setText("");
        my_btn = (Button)findViewById(R.id.btn2);
        my_btn.setText("");
        my_btn = (Button)findViewById(R.id.btn3);
        my_btn.setText("");
        my_btn = (Button)findViewById(R.id.btn4);
        my_btn.setText("");
        my_btn = (Button)findViewById(R.id.btn5);
        my_btn.setText("");
        my_btn = (Button)findViewById(R.id.btn6);
        my_btn.setText("");
        my_btn = (Button)findViewById(R.id.btn7);
        my_btn.setText("");
        my_btn = (Button)findViewById(R.id.btn8);
        my_btn.setText("");
        my_btn = (Button)findViewById(R.id.btn9);
        my_btn.setText("");

        // troca de activity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}