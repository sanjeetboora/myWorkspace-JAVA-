package SNAKE;

import java.awt.Color;

import javax.swing.JFrame;

public class Snake_client {

	public static void main(String[] args) {
		JFrame window = new JFrame();
		Snake snake_game = new Snake();
		window.setBounds(10, 10, 905, 700);
		window.setBackground(Color.LIGHT_GRAY);
		window.add(snake_game);
		window.setVisible(true);
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
