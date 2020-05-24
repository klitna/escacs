package com.example.ajedrez.Piezas;

public class Torre extends Pieza {

    public Torre(int color) {
        super(color);

        if(color == 1){
            name = "tb";
        }else{
            name = "tn";
        }
    }

    public void printGhost(int row, int col, Pieza[][]tablero, int color){

        //UP
        boolean continuar = true;
        int i = row - 1;
        while(i>=0 && continuar){
            if(tablero[i][col]==null) {
                tablero[i][col] = new Ghost(color);
                i--;
            }else{
                continuar=false;
                if(tablero[i][col].color!=this.color){
                    tablero[i][col].isEatable=true;
                }
            }
        }

    }
}
