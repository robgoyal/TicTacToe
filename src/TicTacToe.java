import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.*;
import java.awt.BorderLayout;

public class TicTacToe {
    JFrame frame = new JFrame();

    JPanel p = new JPanel();
    JPanel scoreBoard = new JPanel();

    JLabel player1 = new JLabel("Player 1: ");
    JLabel player2 = new JLabel("Player 2: ");
    JLabel draw = new JLabel("Draw: ");

    XOButton buttons[] = new XOButton[9];

    JPanel northPanel = new JPanel(new GridLayout(2, 3));
    JPanel scorePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

    JPanel infoPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    JLabel winner = new JLabel("No one won yet!");

    public static void main(String args[]) {
        new TicTacToe();
    }

    public TicTacToe() {
        //super("TicTacToe");
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p.setLayout(new GridLayout(3, 3));

        for (int i = 0; i < 9; i++) {
            buttons[i] = new XOButton();
            p.add(buttons[i]);
        }

        scorePanel.add(player1);
        scorePanel.add(draw);
        scorePanel.add(player2);
        northPanel.add(scorePanel);
        //add(northPanel);
        //add(p);

        infoPanel.add(winner);

        northPanel.add(infoPanel);
        
        frame.add(northPanel, BorderLayout.NORTH);
        frame.add(p, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
