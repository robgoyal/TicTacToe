/* Name: TicTacToe.java
   Author: Robin Goyal
   Last-Modified: May 25, 2017
   Purpose: Create a basic Tic Tac Toe Game
*/
import java.awt.*;
import javax.swing.*;
import java.util.Arrays;

public class TicTacToe extends JFrame {

    // Score values initialized
    public static int xScore = 0;
    public static int drawScore = 0;
    public static int oScore = 0;

    // Panels for JFrame
    private JPanel grid;
    private JPanel northPanel;
    private JPanel scorePanel;
    private JPanel winnerPanel;

    // Create Labels and initialize 
    public static JLabel winnerLabel = new JLabel();
    private static JLabel xText = new JLabel("Player X: " + xScore + "     ");
    private static JLabel drawText = new JLabel("Draw: " + drawScore + "     ");
    private static JLabel oText = new JLabel("Player O: " + oScore + "     ");

    public static XOButton buttons[];
    private Font scoreFont = new Font("Serif", Font.BOLD, 14);

    public TicTacToe() {

        // Frame parameters
        super("Tic Tac Toe");
        setSize(500, 500);
        setResizable(false);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLUE);

        // Score panel with JLabels added
        scorePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        scorePanel.add(xText);
        scorePanel.add(drawText);
        scorePanel.add(oText);

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

    // Update score labels to reflect updated score
    public static void updateText() {
        xText.setText("Player X: " + xScore + "     ");
        drawText.setText("Draw: " + drawScore + "     ");
        oText.setText("Player O: " + oScore + "     ");

    }
    public static void main(String args[]) {
        TicTacToe test = new TicTacToe();
        playGame test1 = new playGame();
        //System.out.println(Arrays.toString(test.buttons));
    }
}