package com.desafiolatam.gato.model;

///////////////////interface
 interface Iboard {

    Boolean nexMove(int row, int col);
    Boolean hasWinnerMove();
    IPlayer getWinnerMove();
    void  switchPlayer();
    Boolean isFull();
    IPlayer getCurrent();


}
