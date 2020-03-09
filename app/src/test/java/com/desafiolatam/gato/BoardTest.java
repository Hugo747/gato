package com.desafiolatam.gato;

public class BoardTest {
    private Board board;
    private Cell cell_1;
    private Cell cell_2;

    @BeforepublicvoidsetUp() {
        IPlayer player1 = newPlayer("May", IPlayer.TURN_PLAYER_1);
        IPlayer player2 = newPlayer("Aron", Player.TURN_PLAYER_2);
        cell_1 = newCell(player1);
        cell_2 = newCell(player2);
        board = newBoard(player1, player2);
    }

    @Test blic voidnextMove_ok() {assertTrue(board.nextMove(0, 0));}@TestpublicvoidnextMove_nok() {introw=0;intcol=0;board.nextMove(row, col);// cell cannot be assignedassertFalse(board.nextMove(row, col));}pu