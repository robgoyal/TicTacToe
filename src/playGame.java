import java.awt.*;
import javax.swing.*;

public class playGame {
    
    public static byte grid[] = new byte[9];
    public static Boolean playerMove;
    private static boolean winner = false;
    private static boolean draw = false;

    public playGame() {
        playerMove = true;
    }

    public static void won() throws Exception {
        if (containsZero()) {
            playerMove = !playerMove;
            if (grid[0] == 1 && grid[1] == 1 && grid[2] == 1) {
                TicTacToe.winnerLabel.setText("Player 1 WON");
                winner = true;
                disableButtons();
            }

            else if (grid[0] == 2 && grid[1] == 2 && grid[2] == 2) {
                TicTacToe.winnerLabel.setText("Player 2 WON");
                winner = true;
                disableButtons();
            }
        }
        else {
            TicTacToe.winnerLabel.setText("It's a DRAW");
            disableButtons();
            draw = true;
        }

        if (winner || draw) {
            reset();
        }
    }

    public static boolean containsZero() {
        for (int i: grid) {
            if (i == 0) {
                return true;
            }
        }
        return false;
    }

    public static void disableButtons() {
        for (JButton i: TicTacToe.buttons) {
            i.setEnabled(false);
        }
        return;
    }

    public static void reset() {

        int count = 0;
        while (count < 10000) {
            count++;
        }

        for (byte j = 0; j < 9; j++) {
            grid[j] = 0;
        }

        for (JButton i: TicTacToe.buttons) {
            i.setIcon(null);
            i.setEnabled(true);
        }

        draw = false;
        winner = false;
    }
}