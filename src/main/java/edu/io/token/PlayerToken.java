package edu.io.token;

import edu.io.Board;

public class PlayerToken extends Token {
    public enum Move {
        NONE,
        LEFT,
        RIGHT,
        UP,
        DOWN
    }

    private final Board board;
    private int col;
    private int row;

    public PlayerToken(Board board) {
        super(Label.PLAYER_TOKEN_LABEL);
        this.board = board;
        Board.Coords startPos = board.placeForPlayer();
        this.col = startPos.col();
        this.row = startPos.row();
        this.board.placeToken(this.col, this.row, this);
    }

    public Board.Coords pos() {
        return new Board.Coords(col, row);
    }

    public void move(Move dir) {
        int nextCol = col;
        int nextRow = row;

        switch (dir) {
            case NONE -> {
            }
            case LEFT -> nextCol -= 1;
            case RIGHT -> nextCol += 1;
            case UP -> nextRow -= 1;
            case DOWN -> nextRow += 1;
        }

        if (nextCol < 0 || nextCol >= board.size() || nextRow < 0 || nextRow >= board.size()) {
            throw new IllegalArgumentException("Cannot move outside the board");
        }

        if (nextCol != col || nextRow != row) {
            board.placeToken(col, row, new EmptyToken());
            col = nextCol;
            row = nextRow;
            board.placeToken(col, row, this);
        }
    }
}