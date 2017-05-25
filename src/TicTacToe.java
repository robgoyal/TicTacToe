import java.awt.*;
import javax.swing.*;

public class TicTacToe extends JFrame {

    private JPanel grid;
    private JPanel northPanel;
    private JPanel scorePanel;
    private JPanel winnerPanel;
    public XOButton buttons[];

    public TicTacToe() {

        // Frame parameters
        super("Tic Tac Toe");
        setSize(500, 500);
        setResizable(false);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Score panel
        scorePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        scorePanel.add(new JLabel("Player X:    "));
        scorePanel.add(new JLabel("Draw:    "));
        scorePanel.add(new JLabel("Player O:    "));

        // Current winner panel
        winnerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        winnerPanel.add(new JLabel("No one won yet!"));

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
        new TicTacToe();
    }
}