package com.desafiolatam.gato.model;

import android.util.Log;

import androidx.annotation.NonNull;
//////////////////////////////////////////////////////////////7
public class Board implements Iboard{

   private static final int BOARD_SIZE=3;

   // @VisibleForTesting
    protected Cell[][] cells;

   // @VisibleForTesting
    protected IPlayer currentPlayer;

    private IPlayer player1;
    private IPlayer player2;

    public Board(@NonNull IPlayer player1, @NonNull IPlayer player2) {

        cells=new Cell[BOARD_SIZE][BOARD_SIZE];
        this.player1=player1;
        this.player2=player2;
        this.currentPlayer=player1;
    }

////////////////////////////////////////////////////////////////////////////////////////////
    ////estos metodos son desde la implementacion


    @Override
    public Boolean nexMove(int row, int col) {
        return null;
    }

    @Override
    public Boolean hasWinnerMove() {
        return null;
    }

    @Override
    public IPlayer getWinnerMove() {
        return null;
    }

    @Override
    public void switchPlayer() {
        Log.d("switchPlayer", "called");
        this.currentPlayer = this.currentPlayer == player1 ? player2 : player1;

    }
/////////////////////////////////////////////////////////////////////////////////////////////////7
    @Override
    public Boolean isFull() {
        for (Cell[] row : cells) {
            for (Cellcell : row) {
                if (isCellNullOrEmpty(cell))
                {return false;
                }
            }
        }
        return true;
    }
////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public IPlayer getCurrent() {

        returncurrentPlayer.getPlayerTurn();
    }


    ////estos metodos son desde la implementacion//////////
    public boolean nextMove(final int row, final int col) {
        if (!isCellEmpty(this.cells[row][col])) return false;
        Cell cell=new Cell(this.currentPlayer);
        this.cells[row][col] =cell;
        return true;   }


    //// estos son los metodos de la clase
    ///////////////////////////////////////////
    private boolean hasThreeHorizontal(){


        for (inti=0; i<BOARD_SIZE; i++) {
            if (areEqual(cells[i][0], cells[i][1], cells[i][2])) {
                return true;
            }
        }
        return false;




    }
    ///////////////////////////////////////////

    private boolean hasThreeVertical(){
        return false;
    }
    ///////////////////////////////////////////

    private boolean hasThreeDiagonals(){
        return false;
    }
    ////////////////////////////////////////////
    private  boolean areEqual(Cell cell){
        for (Cell cell:cels ){
            if (isCellEmpy(cell)){
                return  false;

            }
        }
        Cell comparisonBase=cells[0];
        for (int i=1; i<BOARD_SIZE; i++) {
            if (!comparisonBase.equals(cells[i])) {
                return false;
            }
        }


        return false;
    }
    ////////////////////////////////////////////
    private  boolean isCellEmpty(Cell cell){
        return false;
    }
    ////////////////////////////////////////////




}
