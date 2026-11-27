package edu.io;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Player player = new Player();
        game.join(player);
        game.start();

        // Scanner scanner = new Scanner(System.in);
        // while (true) {
        //     System.out.println("Ruch (w=gora, s=dol, a=lewo, d=prawo): ");
        //     String input = scanner.nextLine().trim().toLowerCase();

        //     PlayerToken.Move move = switch (input) {
        //         case "w" -> PlayerToken.Move.UP;
        //         case "s" -> PlayerToken.Move.DOWN;
        //         case "a" -> PlayerToken.Move.LEFT;
        //         case "d" -> PlayerToken.Move.RIGHT;
        //         default -> PlayerToken.Move.NONE;
        //     };

        //     try {
        //         player.token().move(move);
        //         game.display();
        //     } catch (IllegalArgumentException e) {
        //         System.out.println(e.getMessage());
        //     }
        // }
    }
}