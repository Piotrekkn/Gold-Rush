package edu.io;

import edu.io.token.EmptyToken;
import edu.io.token.Token;

import java.util.Random;

public class Board {
    public record Coords(int col, int row) {
    }

    private final int size = 8;
    private final Token[][] tokenGrid;
    private final Random random = new Random();

    public Board() {
        this.tokenGrid = new Token[size][size];
        clean();
    }

    public int size() {
        return size;
    }

    public void placeToken(int col, int row, Token token) {
        tokenGrid[col][row] = token;
    }

    public void clean() {
        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++) {
                tokenGrid[col][row] = new EmptyToken();
            }
        }
    }

    public Token peekToken(int col, int row) {
        return tokenGrid[col][row];
    }

    public Coords placeForPlayer() {
        return new Coords(random.nextInt(size), random.nextInt(size));
    }

    public void display() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(tokenGrid[col][row].label() + " ");
            }
            System.out.println();
        }
    }
}