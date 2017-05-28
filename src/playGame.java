import java.awt.*;
import javax.swing.*;

public class playGame {
        
    //enum State{Blank, X, O};

    public static byte grid[] = new byte[9];

    public static Boolean playerMove;
    private static boolean xWinner = false;
    private static boolean oWinner = false;
    private static boolean draw = false;

    private static boolean[] winner = new boolean[2];

    public playGame() {
        playerMove = true;
    }

    public static void check (int val) {
        // Run win conditions if there is a winner
        if (containsZero()) {
            playerMove = !playerMove;
            if (grid[0] == val && grid[1] == val && grid[2] == val) {
                winner[val - 1] = true;
                winOrDraw();            
            }
            else if (grid[3] == val && grid[4] == val && grid[5] == val) {
                winner[val - 1] = true;
                winOrDraw();
            }
            else if (grid[6] == val && grid[7] == val && grid[8] == val) {
                winner[val - 1] = true;
                winOrDraw();
            }
            else if (grid[0] == val && grid[3] == val && grid[6] == val) {
                winner[val - 1] = true;
                winOrDraw();
            }
            else if (grid[1] == val && grid[4] == val && grid[7] == val) {
                winner[val - 1] = true;
                winOrDraw();
            }
            else if (grid[2] == val && grid[5] == val && grid[8] == val) {
                winner[val - 1] = true;
                winOrDraw();
            }
            else if (grid[0] == val && grid[4] == val && grid[8] == val) {
                winner[val - 1] = true;
                winOrDraw();
            }
            else if (grid[2] == val && grid[4] == val && grid[6] == val) {
                winner[val - 1] = true;
                winOrDraw();
            }
        }
        
        else {
            draw = true;
            winOrDraw();
        }
    }

    public static void winOrDraw(){
        if (winner[0]) {
            TicTacToe.winnerLabel.setText("Player X WON");
            TicTacToe.xScore++;
        }

        else if (winner[1]) {
            TicTacToe.winnerLabel.setText("Player O WON");
            TicTacToe.oScore++;
        }

        else {
            TicTacToe.winnerLabel.setText("It's a DRAW");
            TicTacToe.drawScore++;
        }

        TicTacToe.updateText();
        disableButtons();
        //reset();
    }

    // Check if grid is not full
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

        /*try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            System.out.println("Hello");
        }*/

        for (byte j = 0; j < 9; j++) {
            grid[j] = 0;
        }

        for (JButton i: TicTacToe.buttons) {
            i.setIcon(null);
            i.setEnabled(true);
        }

        TicTacToe.winnerLabel.setText("");
        // xWinner = false;
        draw = false;
        // oWinner = false;

        winner[0] = false;
        winner[1] = false;
    }
}