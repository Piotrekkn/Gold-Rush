package edu.io;

import edu.io.token.GoldToken;
import edu.io.token.PlayerToken;

public class Game {
    private final Board board;

    public Game() {
        this.board = new Board();
    }

    public void join(Player player) {
        PlayerToken token = new PlayerToken(board);
        player.assignToken(token);
    }

    public void start() {
        board.placeToken(2, 2, new GoldToken());
        board.placeToken(5, 3, new GoldToken());
        board.placeToken(1, 6, new GoldToken());
        board.display();
    }

    // public void display(){
    //     board.display();
    // }
}