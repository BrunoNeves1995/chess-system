package chessgame.entities;

import bordgame.entities.Board;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
    }

    public  ChassPiece[][] getPiece(){
        ChassPiece[][] mat = new ChassPiece[board.getRow()][board.getColumn()];

        for (int r = 0; r < board.getRow(); r++) {
            for (int c = 0; c < board.getColumn(); c++) {
                mat[r][c] = (ChassPiece) board.piece(c, r);
            }
        }
        return mat;
    }
}
