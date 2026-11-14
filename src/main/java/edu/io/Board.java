package edu.io;

public class Board {

    private Token[][] tokenGrid;

    public int size = 8;

    public Board() {
        tokenGrid = new Token[size][size];
        clean();
    }

    public void placeToken(int x, int y, Token token) {
        tokenGrid[x][y] = token;
    }

    public void clean() {
        for (int x = 0; x < tokenGrid.length; x++) {
            for (int y = 0; y < tokenGrid[0].length; y++) {
                tokenGrid[x][y] = new Token("・");
            }
        }

    }

    public Token peekToken(int x, int y) {

        return tokenGrid[x][y];
    }

    public void display() {
        for (int x = 0; x < tokenGrid.length; x++) {
            for (int y = 0; y < tokenGrid[0].length; y++) {
                System.out.print(tokenGrid[x][y].label);
            }
            System.out.println("");
        }
    }

}
