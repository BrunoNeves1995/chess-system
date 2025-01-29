package chessgame.entities;

import bordgame.entities.Board;
import bordgame.entities.Piece;
import chessgame.enums.Color;

public class ChassPiece extends Piece {
    private Color color;
    private Integer moveCount;

    public ChassPiece() {
    }

    public ChassPiece(Board board, Color color, Integer moveCount) {
        super(board);
        this.color = color;
        this.moveCount = moveCount;
    }

    public Color getColor() {
        return color;
    }
}
