package application;


import chessgame.entities.ChessMatch;

public class Program {
    public static void main(String[] args) {
        ChessMatch  chessMatch = new ChessMatch();

        UI.printBoard(chessMatch.getPiece());



    }
}
