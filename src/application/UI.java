package application;

import chessgame.entities.ChassPiece;

public  class UI {

    public static void printBoard(ChassPiece[][] pieces){
        for (int row = 0; row < pieces.length; row++) {
            System.out.print(8 - row + " ");
            for (int col = 0; col < pieces.length; col++) {
                printPiece(pieces[row][col]);
            }
            System.out.println();
        }

        System.out.println(" A B C D E F G H");
    }

    private static void printPiece(ChassPiece piece){
        if (piece == null){
            System.out.print("-");
        }
        else {
            System.out.print(piece);
        }
        System.out.print(" ");
    }
}
