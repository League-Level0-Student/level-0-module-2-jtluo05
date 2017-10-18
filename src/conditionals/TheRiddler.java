//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package conditionals;

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String monopoly = JOptionPane.showInputDialog(
				"A man is pushing his car along the road when he comes to a hotel. He shouts, 'I'm bankrupt!' Why (one word answer)?");

		// 4. If they got the answer right, pop up "correct!" and increase the
		// score by one
		if (monopoly.equalsIgnoreCase("Monopoly")) {
			JOptionPane.showMessageDialog(null, "CORRECT! YOU ARE A GENUIS!");
			score++;
		}

		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "WRONG!!!!!!!!!!!!!!");
		}
		JOptionPane.showMessageDialog(null, "Your score= " + score + " .");
		// 6. Add some more riddles
		String Imagine = JOptionPane
				.showInputDialog("Imagine you are in a dark room. How do you get out (two word answer)?");
		if (Imagine.equalsIgnoreCase("Stop imagining")) {
			JOptionPane.showMessageDialog(null, "CORRECT! YOU ARE A GENUIS!");
			score++;
		}

		else {
			JOptionPane.showMessageDialog(null, "WRONG!!!!!!!!!!!!!!");
		}
		JOptionPane.showMessageDialog(null, "Your score= " + score + " .");
		String window = JOptionPane.showInputDialog("What invention lets you look through a wall (one word answer)?");
		if (window.equalsIgnoreCase("Windows")) {
			JOptionPane.showMessageDialog(null, "CORRECT! YOU ARE A GENUIS!");
			score++;
		}

		else {
			JOptionPane.showMessageDialog(null, "WRONG!!!!!!!!!!!!!!");
		}
		JOptionPane.showMessageDialog(null, "Your score= " + score + " .");

		// 2. Make a pop up to show the score.

	}
}
