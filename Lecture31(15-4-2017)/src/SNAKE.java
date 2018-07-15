
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SNAKE extends JFrame implements ActionListener, KeyListener {
	private enum GameStatus {
		ZeroWon, CrossWon, Tie, Incomplete;
	}

	private boolean crossTurn = true;
	public static final int BOARD_SIZE = 70;
	public static final String CROSS = "X";
	public static final String ZERO = "O";
	private JButton[][] buttons = new JButton[BOARD_SIZE][BOARD_SIZE];
	Timer timer = new Timer(1000, this);

	public SNAKE() {
		super.setTitle("----SNAKE----");
		super.setBackground(Color.GRAY);
		GridLayout layout = new GridLayout(BOARD_SIZE, BOARD_SIZE);
		super.setLayout(layout);
		super.setSize(1000, 1000);
		super.setResizable(false);
		super.setFocusable(true);

		Font font = new Font("Serif", 1, 150);
		for (int row = 0; row < BOARD_SIZE; row++) {
			for (int col = 0; col < BOARD_SIZE; col++) {
				JButton button = new JButton();
				button.setFont(font);
				button.addActionListener(this);
				button.addKeyListener(this);
				button.setBackground(Color.black);
				this.buttons[row][col] = button;
				super.add(button);
				timer.setRepeats(true);
				timer.start();
			}
		}
		super.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clickedbutton = (JButton) e.getSource();
		System.out.println(clickedbutton);
		clickedbutton.setBackground(Color.CYAN);
		makeMove(clickedbutton);
		GameStatus gs = getGameStatus();
		if (gs == GameStatus.Incomplete) {
			return;
		} else {
			declareWinner(gs);

			int Jchoice = JOptionPane.showConfirmDialog(this, "AGAIN ");

			if (Jchoice == JOptionPane.YES_OPTION) {
				for (int row = 0; row < BOARD_SIZE; row++) {
					for (int col = 0; col < BOARD_SIZE; col++) {
						JButton button = this.buttons[row][col];
						button.setText("");
						button.setBackground(Color.LIGHT_GRAY);
					}
				}
				this.crossTurn = true;
			} else {
				super.dispose();
			}
		}

	}

	private void makeMove(JButton clickedbutton) {
		if (clickedbutton.getText().length() > 0) {
			JOptionPane.showMessageDialog(this, "Dhang se khelo");
			return;
		} else if (crossTurn) {
			clickedbutton.setText(CROSS);
		} else {
			clickedbutton.setText(ZERO);
		}
		crossTurn = !crossTurn;

	}

	private GameStatus getGameStatus() {
		String prev = "", nxt = "";
		int row = 0, col = 0;
		row = 0;
		while (row < BOARD_SIZE) {
			col = 0;
			while (col < BOARD_SIZE - 1) {
				prev = buttons[row][col].getText();
				nxt = buttons[row][col + 1].getText();

				if (!prev.equals(nxt) || prev.length() == 0) {
					break;
				}
				col++;
			}
			if (col == BOARD_SIZE - 1) {
				if (prev.equals(CROSS)) {
					return GameStatus.CrossWon;
				} else if (prev.equals(ZERO)) {
					return GameStatus.ZeroWon;
				}
			}
			row++;
		}
		col = 0;
		while (col < BOARD_SIZE) {
			row = 0;
			while (row < BOARD_SIZE - 1) {
				prev = buttons[row][col].getText();
				nxt = buttons[row + 1][col].getText();

				if (!prev.equals(nxt) || prev.length() == 0) {
					break;
				}
				row++;
			}
			if (row == BOARD_SIZE - 1) {
				if (prev.equals(CROSS)) {
					return GameStatus.CrossWon;
				} else if (prev.equals(ZERO)) {
					return GameStatus.ZeroWon;
				}
			}
			col++;
		} // test for diag1
		row = 0;
		col = 0;
		while (col < BOARD_SIZE - 1 && row < BOARD_SIZE - 1) {
			prev = buttons[row][col].getText();
			nxt = buttons[row + 1][col + 1].getText();

			if (!prev.equals(nxt) || prev.length() == 0) {
				break;
			}
			col++;
			row++;
		}
		if (col == BOARD_SIZE - 1 && row == BOARD_SIZE - 1) {
			if (prev.equals("X")) {
				return GameStatus.CrossWon;
			} else if (prev.equals("O")) {
				return GameStatus.ZeroWon;
			}
		}

		// test for diag2
		row = 0;
		col = BOARD_SIZE - 1;
		while (col > 0 && row < BOARD_SIZE - 1) {
			prev = buttons[row][col].getText();
			prev = buttons[row + 1][col - 1].getText();

			if (!prev.equals(nxt) || prev.length() == 0) {
				break;
			}
			col--;
			row++;
		}
		if (col == 0 && row == BOARD_SIZE - 1) {
			if (prev.equals(CROSS)) {
				return GameStatus.CrossWon;
			} else if (prev.equals(ZERO)) {
				return GameStatus.ZeroWon;
			}
		}

		for (row = 0; row < BOARD_SIZE; row++) {
			for (col = 0; col < BOARD_SIZE; col++) {
				JButton button = this.buttons[row][col];
				if (button.getText().length() == 0) {
					return GameStatus.Incomplete;
				}

			}
		}
		return GameStatus.Tie;
	}

	private void declareWinner(GameStatus gs) {
		if (gs == GameStatus.ZeroWon) {
			JOptionPane.showMessageDialog(this, "Zero is winner");
		}
		if (gs == GameStatus.CrossWon) {
			JOptionPane.showMessageDialog(this, "Cross is winner");
		}
		if (gs == GameStatus.Tie) {
			JOptionPane.showMessageDialog(this, "TIE");
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
