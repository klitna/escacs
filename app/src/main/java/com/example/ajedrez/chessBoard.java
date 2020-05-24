package com.example.ajedrez;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ajedrez.Piezas.Pieza;
import com.example.ajedrez.Piezas.Torre;
import com.example.ajedrez.R;

public class chessBoard extends AppCompatActivity {

    ImageView viewTaulell[][] = new ImageView[8][8];

    ImageView pecesNegres[] = new ImageView[16];
    ImageView pecesBlanques[] = new ImageView[16];

    Pieza tablero[][] = new Pieza[8][8];

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chess_board);

        // Taulell general
        viewTaulell[0][0] = findViewById(R.id.board_0_0);
        viewTaulell[0][1] = findViewById(R.id.board_0_1);
        viewTaulell[0][2] = findViewById(R.id.board_0_2);
        viewTaulell[0][3] = findViewById(R.id.board_0_3);
        viewTaulell[0][4] = findViewById(R.id.board_0_4);
        viewTaulell[0][5] = findViewById(R.id.board_0_5);
        viewTaulell[0][6] = findViewById(R.id.board_0_6);
        viewTaulell[0][7] = findViewById(R.id.board_0_7);

        viewTaulell[1][0] = findViewById(R.id.board_1_0);
        viewTaulell[1][1] = findViewById(R.id.board_1_1);
        viewTaulell[1][2] = findViewById(R.id.board_1_2);
        viewTaulell[1][3] = findViewById(R.id.board_1_3);
        viewTaulell[1][4] = findViewById(R.id.board_1_4);
        viewTaulell[1][5] = findViewById(R.id.board_1_5);
        viewTaulell[1][6] = findViewById(R.id.board_1_6);
        viewTaulell[1][7] = findViewById(R.id.board_1_7);

        viewTaulell[2][0] = findViewById(R.id.board_2_0);
        viewTaulell[2][1] = findViewById(R.id.board_2_1);
        viewTaulell[2][2] = findViewById(R.id.board_2_2);
        viewTaulell[2][3] = findViewById(R.id.board_2_3);
        viewTaulell[2][4] = findViewById(R.id.board_2_4);
        viewTaulell[2][5] = findViewById(R.id.board_2_5);
        viewTaulell[2][6] = findViewById(R.id.board_2_6);
        viewTaulell[2][7] = findViewById(R.id.board_2_7);

        viewTaulell[3][0] = findViewById(R.id.board_3_0);
        viewTaulell[3][1] = findViewById(R.id.board_3_1);
        viewTaulell[3][2] = findViewById(R.id.board_3_2);
        viewTaulell[3][3] = findViewById(R.id.board_3_3);
        viewTaulell[3][4] = findViewById(R.id.board_3_4);
        viewTaulell[3][5] = findViewById(R.id.board_3_5);
        viewTaulell[3][6] = findViewById(R.id.board_3_6);
        viewTaulell[3][7] = findViewById(R.id.board_3_7);

        viewTaulell[4][0] = findViewById(R.id.board_4_0);
        viewTaulell[4][1] = findViewById(R.id.board_4_1);
        viewTaulell[4][2] = findViewById(R.id.board_4_2);
        viewTaulell[4][3] = findViewById(R.id.board_4_3);
        viewTaulell[4][4] = findViewById(R.id.board_4_4);
        viewTaulell[4][5] = findViewById(R.id.board_4_5);
        viewTaulell[4][6] = findViewById(R.id.board_4_6);
        viewTaulell[4][7] = findViewById(R.id.board_4_7);

        viewTaulell[5][0] = findViewById(R.id.board_5_0);
        viewTaulell[5][1] = findViewById(R.id.board_5_1);
        viewTaulell[5][2] = findViewById(R.id.board_5_2);
        viewTaulell[5][3] = findViewById(R.id.board_5_3);
        viewTaulell[5][4] = findViewById(R.id.board_5_4);
        viewTaulell[5][5] = findViewById(R.id.board_5_5);
        viewTaulell[5][6] = findViewById(R.id.board_5_6);
        viewTaulell[5][7] = findViewById(R.id.board_5_7);

        viewTaulell[6][0] = findViewById(R.id.board_6_0);
        viewTaulell[6][1] = findViewById(R.id.board_6_1);
        viewTaulell[6][2] = findViewById(R.id.board_6_2);
        viewTaulell[6][3] = findViewById(R.id.board_6_3);
        viewTaulell[6][4] = findViewById(R.id.board_6_4);
        viewTaulell[6][5] = findViewById(R.id.board_6_5);
        viewTaulell[6][6] = findViewById(R.id.board_6_6);
        viewTaulell[6][7] = findViewById(R.id.board_6_7);

        viewTaulell[7][0] = findViewById(R.id.board_7_0);
        viewTaulell[7][1] = findViewById(R.id.board_7_1);
        viewTaulell[7][2] = findViewById(R.id.board_7_2);
        viewTaulell[7][3] = findViewById(R.id.board_7_3);
        viewTaulell[7][4] = findViewById(R.id.board_7_4);
        viewTaulell[7][5] = findViewById(R.id.board_7_5);
        viewTaulell[7][6] = findViewById(R.id.board_7_6);
        viewTaulell[7][7] = findViewById(R.id.board_7_7);


        pecesNegres[0] = findViewById(R.id.negres_0_0);
        pecesNegres[1] = findViewById(R.id.negres_0_1);
        pecesNegres[2] = findViewById(R.id.negres_0_2);
        pecesNegres[3] = findViewById(R.id.negres_0_3);
        pecesNegres[4] = findViewById(R.id.negres_0_4);
        pecesNegres[5] = findViewById(R.id.negres_0_5);
        pecesNegres[6] = findViewById(R.id.negres_0_6);
        pecesNegres[7] = findViewById(R.id.negres_0_7);
        pecesNegres[8] = findViewById(R.id.negres_1_0);
        pecesNegres[9] = findViewById(R.id.negres_1_1);
        pecesNegres[10] = findViewById(R.id.negres_1_2);
        pecesNegres[11] = findViewById(R.id.negres_1_3);
        pecesNegres[12] = findViewById(R.id.negres_1_4);
        pecesNegres[13] = findViewById(R.id.negres_1_5);
        pecesNegres[14] = findViewById(R.id.negres_1_6);
        pecesNegres[15] = findViewById(R.id.negres_1_7);


        pecesBlanques[0] = findViewById(R.id.blanques_0);
        pecesBlanques[1] = findViewById(R.id.blanques_1);
        pecesBlanques[2] = findViewById(R.id.blanques_2);
        pecesBlanques[3] = findViewById(R.id.blanques_3);
        pecesBlanques[4] = findViewById(R.id.blanques_4);
        pecesBlanques[5] = findViewById(R.id.blanques_5);
        pecesBlanques[6] = findViewById(R.id.blanques_6);
        pecesBlanques[7] = findViewById(R.id.blanques_7);
        pecesBlanques[8] = findViewById(R.id.blanques_8);
        pecesBlanques[9] = findViewById(R.id.blanques_9);
        pecesBlanques[10] = findViewById(R.id.blanques_10);
        pecesBlanques[11] = findViewById(R.id.blanques_11);
        pecesBlanques[12] = findViewById(R.id.blanques_12);
        pecesBlanques[13] = findViewById(R.id.blanques_13);
        pecesBlanques[14] = findViewById(R.id.blanques_14);
        pecesBlanques[15] = findViewById(R.id.blanques_15);


       // tablero[0][0] = new Torre(1);
        tablero[0][7] = new Torre(1);
        tablero[7][0] = new Torre(0);
        tablero[7][7] = new Torre(0);

        printTablero();
    }

    public void clickPeca (View view){
        String posPeca = view.getTag().toString();

        int row = Character.getNumericValue(posPeca.charAt(0));
        int col = Character.getNumericValue(posPeca.charAt(1));


        tablero[row][col].printGhost(row, col, tablero, tablero[row][col].color);
        printTablero();


        String loginfo = "Tablero: \n";
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                if(tablero[i][j]!=null){
                    loginfo += tablero[i][j].name;
                }else{
                    loginfo += "   ";
                }
            }
            loginfo += "\n";
        }

        Log.i("infoTaulell", loginfo);
    }


    public void printTablero(){
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                if(tablero[i][j]!=null){
                    if(tablero[i][j].name.equals("G")){
                        viewTaulell[i][j].setBackgroundColor(Color.parseColor("#afae9e"));
                    }else{
                        viewTaulell[i][j].setImageResource(getResources().getIdentifier(tablero[i][j].name, "drawable", getPackageName()));
                    }

                }
            }
        }
    }


    public void cleanTaulell () {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                viewTaulell[i][j].setImageResource(getResources().getIdentifier("", "drawable", getPackageName()));

                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        viewTaulell[i][j].setBackgroundColor(getResources().getColor(R.color.boardL));
                    } else {
                        viewTaulell[i][j].setBackgroundColor(getResources().getColor(R.color.boardH));
                    }
                } else {
                    if (j % 2 == 0) {
                        viewTaulell[i][j].setBackgroundColor(getResources().getColor(R.color.boardH));
                    } else {
                        viewTaulell[i][j].setBackgroundColor(getResources().getColor(R.color.boardL));
                    }
                }

            }
        }
    }

}