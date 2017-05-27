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
        /*value++;
        value %= 3;

        switch(value) {
            case 0:
                setIcon(null);
                break;
            case 1:
                setIcon(X);
                break;
            case 2:
                setIcon(O);
                break;
        }*/

        //winnerLabel.setText(e.getActionCommand());
        for (int i = 0; i < 9; i++) {
            if (e.getSource() == TicTacToe.buttons[i]) {
                if (playGame.playerMove && playGame.grid[i] == 0) {
                    setIcon(X);
                    playGame.grid[i] = 1;
                    playGame.won();
                }
                else if (!(playGame.playerMove) && playGame.grid[i] == 0) {
                    setIcon(O);
                    playGame.grid[i] = 2;
                    playGame.won();
                }
            }
        }
        System.out.println(Arrays.toString(playGame.grid));
    }
}