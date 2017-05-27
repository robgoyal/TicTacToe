/* Name: TicTacToe.java
   Author: Robin Goyal
   Last-Modified: May 25, 2017
   Purpose: Create a basic Tic Tac Toe Game
*/
import java.awt.*;
import javax.swing.*;
import java.util.Arrays;

public class TicTacToe extends JFrame {

    private JPanel grid;
    private JPanel northPanel;
    private JPanel scorePanel;
    private JPanel winnerPanel;
    public static JLabel winnerLabel = new JLabel("No one won yet");
    public static XOButton buttons[];
    private Font scoreFont = new Font("Serif", Font.BOLD, 14);

    public static int xScore = 0;
    private int drawScore = 0;
    private int oScore = 0;

    public TicTacToe() {

        // Frame parameters
        super("Tic Tac Toe");
        setSize(500, 500);
        setResizable(false);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLUE);

        // Score panel
        scorePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        scorePanel.add(new JLabel("Player X: " + xScore + "     "));
        scorePanel.add(new JLabel("Draw: " + drawScore + "      "));
        scorePanel.add(new JLabel("Player O: " + oScore + "     "));

        // Current winner panel
        winnerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        winnerPanel.add(winnerLabel);

        // Combine score panel and winner panel onto top most panel
        northPanel = new JPanel(new GridLayout(2, 1));
        northPanel.add(scorePanel);
        northPanel.add(winnerPanel);

        // Game grid
        buttons = new XOButton[9];

        grid = new JPanel(new GridLayout(3, 3));
        for (int i = 0; i < 9; i++) {
            buttons[i] = new XOButton();
            grid.add(buttons[i]);
        }

        // Add panels and grid to Frame
        add(northPanel, BorderLayout.NORTH);
        add(grid, BorderLayout.CENTER);
        setVisible(true);

    }

    public static void main(String args[]) {
        TicTacToe test = new TicTacToe();
        playGame test1 = new playGame();
        //System.out.println(Arrays.toString(test.buttons));
    }
}