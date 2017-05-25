import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.*;

public class TicTacToe extends JFrame {
    JPanel p = new JPanel();
    JPanel scoreBoard = new JPanel();

    JLabel player1 = new JLabel("Player 1: ");
    JLabel player2 = new JLabel("Player 2: ");
    JLabel draw = new JLabel("Draw: ");

    XOButton buttons[] = new XOButton[9];

    public static void main(String args[]) {
        new TicTacToe();
    }

    public TicTacToe() {
        super("TicTacToe");
        setSize(400, 500);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        p.setLayout(new GridLayout(3, 3));

        for (int i = 0; i < 9; i++) {
            buttons[i] = new XOButton();
            p.add(buttons[i]);
        }

        add(p);

        scoreBoard.setLayout(new FlowLayout(FlowLayout.CENTER));
        add(player1);
        add(draw);
        add(player2);

        setVisible(true);
    }
}
