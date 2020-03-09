package com.desafiolatam.gato.model;

public class Player implements IPlayer{

    private String name;
    private int turn;



    public boolean equals(){
        return false;
    }

    @Override
    public String getPlayerName() {
        return null;
    }

    @Override
    public int getPlayerTurn() {
        return 0;
    }
}
