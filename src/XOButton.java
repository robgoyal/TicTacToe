import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Arrays;

public class XOButton extends JButton implements ActionListener {
    ImageIcon X, O;

    byte value = 0;

    /*
    0: nothing
    1: X
    2: O
    */

    public XOButton() {
        X = new ImageIcon(this.getClass().getResource("img/playX.png"));
        O = new ImageIcon(this.getClass().getResource("img/playO.png"));
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 9; i++) {

            // Find which button was clicked
            if (e.getSource() == TicTacToe.buttons[i]) {

                // Make sure button clicked wasn't 
                if (playGame.grid[i] == 0) {

                    TicTacToe.winnerLabel.setText("");

                    if (playGame.playerMove) {
                        setIcon(X);
                        playGame.grid[i] = 1;
                        playGame.check(1);
                    }
                    else if (!(playGame.playerMove)) {
                        setIcon(O);
                        playGame.grid[i] = 2;
                        playGame.check(2);
                    }
                }

                else {
                    TicTacToe.winnerLabel.setText("Button was already clicked");
                }
            }
        }
        System.out.println(Arrays.toString(playGame.grid));
    }
}