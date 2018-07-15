package sanketsingh;

import javax.swing.*;
import java.awt.*;
import java.applet.*;

import java.awt.event.*;
import java.util.Random;

/*
<applet code="TicTacToeGame.class" width=200 height=200>
</applet>
*/
/** tic tac toe applet class */
public class game extends JApplet implements ActionListener {
	// Declare variables
	private JLabel title;
	private JLabel direction;
	private JLabel result;
	private JButton bn[][] = new JButton[3][3];
	private JPanel contentPane;
	private Random rand = new Random();
	private final String X = "X";
	private final String O = "O";
	private boolean turn = true;

	// End of variables declaration

	/** initialize components */
	public void init() {
		initializeComponent();
	}

	/** method to initilize components */
	private void initializeComponent() {
		title = new JLabel();
		direction = new JLabel();

		// 3x3 Button array
		for (int x = 0; x < 3; x++)
			for (int y = 0; y < 3; y++) {
				bn[x][y] = new JButton();
				bn[x][y].setFont(new Font("Ariel", Font.BOLD, 26));
				bn[x][y].addActionListener(this);
			}
		contentPane = (JPanel) this.getContentPane();

		// Set title for the game
		title.setText("Game Tic Tac Toe");
		title.setFont(new Font("Ariel", Font.BOLD, 35));
		// Give direction to play
		direction.setText("Click Any One Button");
		direction.setFont(new Font("Ariel", Font.BOLD, 25));
		// To display the result
		result = new JLabel();

		contentPane.setLayout(null);
		// Add components and set button size to the content panel
		addComponent(contentPane, title, 59, 13, 346, 32);
		addComponent(contentPane, direction, 55, 69, 354, 28);
		addComponent(contentPane, bn[0][0], 30, 100, 70, 36);
		addComponent(contentPane, bn[0][1], 110, 100, 70, 35);
		addComponent(contentPane, bn[0][2], 190, 100, 70, 36);
		addComponent(contentPane, bn[1][0], 30, 140, 70, 36);
		addComponent(contentPane, bn[1][1], 110, 145, 70, 36);
		addComponent(contentPane, bn[1][2], 190, 145, 70, 36);
		addComponent(contentPane, bn[2][0], 30, 186, 70, 36);
		addComponent(contentPane, bn[2][1], 110, 186, 70, 36);
		addComponent(contentPane, bn[2][2], 190, 186, 70, 36);
		addComponent(contentPane, result, 95, 275, 255, 30);
	}

	/** Add Component Without a Layout Manager (Absolute Positioning) */
	private void addComponent(Container container, Component c, int x, int y, int width, int height) {
		c.setBounds(x, y, width, height);
		container.add(c);
	}

	/** checks and balances on game plays depending on users input */
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == bn[0][0]) {
			if ((turn == true) && (bn[0][0].getText().equals(""))) {
				bn[0][0].setText(X);
				turn = false;
				gameStatus();
				cpuMove();
			}

		}
		if (source == bn[0][1]) {
			if ((turn == true) && (bn[0][1].getText().equals(""))) {
				bn[0][1].setText(X);
				turn = false;
				gameStatus();
				cpuMove();
			}

		}
		if (source == bn[0][2]) {
			if ((turn == true) && (bn[0][2].getText().equals(""))) {
				bn[0][2].setText(X);
				turn = false;
				gameStatus();
				cpuMove();
			}

		}
		if (source == bn[1][0]) {
			if ((turn == true) && (bn[1][0].getText().equals(""))) {
				bn[1][0].setText(X);
				turn = false;
				gameStatus();
				cpuMove();
			}

		}
		if (source == bn[1][1]) {
			if ((turn == true) && (bn[1][1].getText().equals(""))) {
				bn[1][1].setText(X);
				turn = false;
				gameStatus();
				cpuMove();
			}

		}
		if (source == bn[1][2]) {
			if ((turn == true) && (bn[1][2].getText().equals(""))) {
				bn[1][2].setText(X);
				turn = false;
				gameStatus();
				cpuMove();
			}

		}
		if (source == bn[2][0]) {
			if ((turn == true) && (bn[2][0].getText().equals(""))) {
				bn[2][0].setText(X);
				turn = false;
				gameStatus();
				cpuMove();
			}

		}
		if (source == bn[2][1]) {
			if ((turn == true) && (bn[2][1].getText().equals(""))) {
				bn[2][1].setText(X);
				turn = false;
				gameStatus();
				cpuMove();
			}

		}
		if (source == bn[2][2]) {
			if ((turn == true) && (bn[2][2].getText().equals(""))) {
				bn[2][2].setText(X);
				turn = false;
				gameStatus();
				cpuMove();
			}

		}
	}

	/** Chech and disply result :WIN/LOSE/TIE */
	public void gameStatus() {
		// horizontal wins
		if ((bn[0][0].getText() == X) && (bn[0][1].getText() == X) && (bn[0][2].getText() == X)) {
			result.setText("Congratz!!!You Win!");
			disableGame();
			return;
		}
		if ((bn[0][0].getText() == O) && (bn[0][1].getText() == O) && (bn[0][2].getText() == O)) {
			result.setText("Sorry!!! You Lose!");
			disableGame();
			return;
		}
		if ((bn[1][0].getText() == O) && (bn[1][1].getText() == O) && (bn[1][2].getText() == O)) {
			result.setText("Game over! You Lose!");
			disableGame();
			return;
		}
		if ((bn[1][0].getText() == X) && (bn[1][1].getText() == X) && (bn[1][2].getText() == X)) {
			result.setText("Congratz!!!You Win!");
			disableGame();
			return;
		}
		if ((bn[2][0].getText() == X) && (bn[2][1].getText() == X) && (bn[2][2].getText() == X)) {
			result.setText("Congratz!!!You Win!");
			disableGame();
			return;
		}
		if ((bn[2][0].getText() == O) && (bn[2][1].getText() == O) && (bn[2][2].getText() == O)) {
			result.setText("Game over! You Lose!");
			disableGame();
			return;
		}
		// virtical wins
		if ((bn[0][0].getText() == X) && (bn[1][0].getText() == X) && (bn[2][0].getText() == X)) {
			result.setText("Congratz!!!You Win!");
			disableGame();
			return;
		}
		if ((bn[0][0].getText() == O) && (bn[1][0].getText() == O) && (bn[2][0].getText() == O)) {
			result.setText("Game over! You Lose!");
			disableGame();
			return;
		}
		if ((bn[0][1].getText() == O) && (bn[1][1].getText() == O) && (bn[2][1].getText() == O)) {
			result.setText("Game over! You Lose!");
			disableGame();
			return;
		}
		if ((bn[0][1].getText() == X) && (bn[1][1].getText() == X) && (bn[2][1].getText() == X)) {
			result.setText("Congratz!!!You Win!");
			disableGame();
			return;
		}
		if ((bn[0][2].getText() == O) && (bn[1][2].getText() == O) && (bn[2][2].getText() == O)) {
			result.setText("Game over! You Lose!");
			disableGame();
			return;
		}
		if ((bn[0][2].getText() == X) && (bn[1][2].getText() == X) && (bn[2][2].getText() == X)) {
			result.setText("Congratz!!!You Win!");
			disableGame();
			return;
		}
		// diangle wins
		if ((bn[0][0].getText() == O) && (bn[1][1].getText() == O) && (bn[2][2].getText() == O)) {
			result.setText("Game over! You Lose!");
			disableGame();
			return;
		}
		if ((bn[0][0].getText() == X) && (bn[1][1].getText() == X) && (bn[2][2].getText() == X)) {
			result.setText("Congratz!!!You Win!");
			disableGame();
			return;
		}
		if ((bn[0][2].getText() == O) && (bn[1][1].getText() == O) && (bn[2][0].getText() == O)) {
			result.setText("Game over! You Lose!");
			disableGame();
			return;
		}
		if ((bn[0][2].getText() == X) && (bn[1][1].getText() == X) && (bn[2][0].getText() == X)) {
			result.setText("Congratz!!!You Win!");
			disableGame();
			return;
		}
		// check if there is any block open (or)if there is no open block then
		// the game is disabled and tie is declared
		for (int x = 0; x < 3; x++)
			for (int y = 0; y < 3; y++)
				if (bn[x][y].getText().equals(""))
					return;
		result.setText("Game over! Tie");
		disableGame();
	}

	/** disable gameboard */
	public void disableGame() {
		for (int x = 0; x < 3; x++)
			for (int y = 0; y < 3; y++)
				bn[x][y].setEnabled(false);
		// turn is set true to prevent infinite loop at the end of the game if
		// tied
		turn = true;
		reset();
	}

	/** cpu random move */
	public void cpuMove() {
		int x = 0;
		int y = 0;
		do {
			x = rand.nextInt(3);
			y = rand.nextInt(3);
			if (bn[x][y].getText().equals("")) {
				bn[x][y].setText(O);
				turn = true;
				gameStatus();
			}
		} while (turn == false);
	}

	/** resets the game; If you win then computer starts from first */
	public void reset() {
		int answer = JOptionPane.showConfirmDialog(this, "If you want to play again? Click Yes or No...", "reset",
				JOptionPane.YES_NO_OPTION);
		if (answer == JOptionPane.YES_OPTION) {
			for (int x = 0; x < 3; x++)
				for (int y = 0; y < 3; y++) {
					bn[x][y].setEnabled(true);
					bn[x][y].setText("");
				}
			turn = true;
			result.setText("");
		}
	}
}