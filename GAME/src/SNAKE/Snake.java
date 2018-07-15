package SNAKE;

import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Snake extends JPanel implements KeyListener, ActionListener {
	private Timer timer;
	private int delay = 100;
	private int[] X_length = new int[750];
	private int[] Y_length = new int[750];
	private boolean left = false;
	private boolean right = false;
	private boolean down = false;
	private boolean up = false;
	private int len_of_snake = 3;
	private ImageIcon right_mouth;
	private ImageIcon left_mouth;
	private ImageIcon up_mouth;
	private ImageIcon down_mouth;
	private ImageIcon snake_image;
	private ImageIcon titleImage;
	private int moves = 0;
	private int[] food_X = { 25, 50, 75, 100, 125, 150, 175, 200, 225, 250, 275, 300, 325, 350, 375, 400, 425, 450, 475,
			500, 525, 550, 575, 600, 625, 650, 675, 700, 725, 750, 775, 800, 825, 850 };
	private int[] food_Y = { 75, 100, 125, 150, 175, 200, 225, 250, 275, 300, 325, 350, 375, 400, 425, 450, 475, 500,
			525, 550, 575, 600, 625 };
	private ImageIcon foodimage;
	private Random rand = new Random();
	private int X_pos = rand.nextInt(34);
	private int Y_pos = rand.nextInt(23);
	private int score = 0;

	public Snake() {
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		timer = new Timer(delay, this);
		timer.start();
	}

	public void paint(Graphics gr) {
		// title image border
		if (moves == 0) {
			X_length[2] = 50;
			X_length[1] = 75;
			X_length[0] = 100;
			Y_length[2] = 100;
			Y_length[1] = 100;
			Y_length[0] = 100;

		}
		gr.setColor(Color.WHITE);
		gr.drawRoundRect(24, 10, 851, 55, 5, 5);
		// title image
		titleImage = new ImageIcon("snaketitle.jpg");
		titleImage.paintIcon(this, gr, 25, 11);
		// border of window
		gr.setColor(Color.WHITE);
		gr.drawRect(24, 74, 851, 577);
		// background of window

		gr.setColor(Color.BLACK);
		gr.fillRect(25, 74, 850, 575);
		// draw scores
		gr.setColor(Color.white);
		gr.setFont(new Font("aerial", Font.PLAIN, 14));
		gr.drawString("scores : " + score, 790, 30);

		right_mouth = new ImageIcon("rightmouth.png");
		right_mouth.paintIcon(this, gr, X_length[0], Y_length[0]);
		for (int i = 0; i < len_of_snake; i++) {
			if (i == 0 && right) {
				right_mouth = new ImageIcon("rightmouth.png");
				right_mouth.paintIcon(this, gr, X_length[i], Y_length[i]);

			}
			if (i == 0 && left) {
				left_mouth = new ImageIcon("leftmouth.png");
				left_mouth.paintIcon(this, gr, X_length[i], Y_length[i]);

			}
			if (i == 0 && up) {
				up_mouth = new ImageIcon("upmouth.png");
				up_mouth.paintIcon(this, gr, X_length[i], Y_length[i]);

			}
			if (i == 0 && down) {
				down_mouth = new ImageIcon("downmouth.png");
				down_mouth.paintIcon(this, gr, X_length[i], Y_length[i]);

			}
			if (i != 0) {
				snake_image = new ImageIcon("snakeimage.png");
				snake_image.paintIcon(this, gr, X_length[i], Y_length[i]);
			}
		}
		// draw food
		foodimage = new ImageIcon("enemy.png");
		if (food_X[X_pos] == X_length[0] && food_Y[Y_pos] == Y_length[0]) {
			score++;
			len_of_snake++;
			X_pos = rand.nextInt(32);
			Y_pos = rand.nextInt(23);

		}
		foodimage.paintIcon(this, gr, food_X[X_pos], food_Y[Y_pos]);
		// terminating condition
		for (int a = 1; a < len_of_snake; a++) {
			if (X_length[a] == X_length[0] && Y_length[a] == Y_length[0]) {
				right = false;
				left = false;
				up = false;
				down = false;
				gr.setColor(Color.white);
				gr.setFont(new Font("aerial", Font.BOLD, 50));
				gr.drawString("Game Over", 300, 300);
				gr.setFont(new Font("aerial", Font.BOLD, 30));
				gr.drawString("Press SPACE to RESTART", 350, 340);
			}
		}
		gr.dispose();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		timer.start();
		if (right) {
			for (int pos = len_of_snake - 1; pos >= 0; pos--) {
				Y_length[pos + 1] = Y_length[pos];

			}
			for (int pos = len_of_snake; pos >= 0; pos--) {
				if (pos == 0) {
					X_length[pos] = X_length[pos] + 25;
				} else {
					X_length[pos] = X_length[pos - 1];
				}
				if (X_length[pos] > 850) {
					X_length[pos] = 25;
				}
			}
			repaint();
		}
		if (left) {
			for (int pos = len_of_snake - 1; pos >= 0; pos--) {
				Y_length[pos + 1] = Y_length[pos];

			}
			for (int pos = len_of_snake; pos >= 0; pos--) {
				if (pos == 0) {
					X_length[pos] = X_length[pos] - 25;
				} else {
					X_length[pos] = X_length[pos - 1];
				}
				if (X_length[pos] < 25) {
					X_length[pos] = 850;
				}
			}
			repaint();

		}
		if (up) {
			for (int pos = len_of_snake - 1; pos >= 0; pos--) {
				X_length[pos + 1] = X_length[pos];

			}
			for (int pos = len_of_snake; pos >= 0; pos--) {
				if (pos == 0) {
					Y_length[pos] = Y_length[pos] - 25;
				} else {
					Y_length[pos] = Y_length[pos - 1];
				}
				if (Y_length[pos] < 75) {
					Y_length[pos] = 625;
				}
			}
			repaint();

		}
		if (down) {
			for (int pos = len_of_snake - 1; pos >= 0; pos--) {
				X_length[pos + 1] = X_length[pos];

			}
			for (int pos = len_of_snake; pos >= 0; pos--) {
				if (pos == 0) {
					Y_length[pos] = Y_length[pos] + 25;
				} else {
					Y_length[pos] = Y_length[pos - 1];
				}
				if (Y_length[pos] > 625) {
					Y_length[pos] = 75;
				}
			}
			repaint();

		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			moves = 0;
			score = 0;
			len_of_snake = 3;
			repaint();
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			moves++;
			right = true;
			if (!left) {
				right = true;
			} else {
				right = false;
				left = true;
			}

			up = false;
			down = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			moves++;
			left = true;
			if (!right) {
				left = true;
			} else {
				left = false;
				right = true;
			}

			up = false;
			down = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			moves++;
			up = true;
			if (!down) {
				up = true;
			} else {
				up = false;
				down = true;
			}

			right = false;
			left = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			moves++;
			down = true;
			if (!up) {
				down = true;
			} else {
				up = true;
				down = false;

			}

			right = false;
			left = false;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
