//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package methods;

import javax.swing.JOptionPane;

public class RocketShip {
	public static void main(String[] args) {

		// 2. ask the user when to start (JOptionPane.showInputDialog)
		// 3. convert the user's answer to an int (Integer.parseInt)
		String starting = JOptionPane.showInputDialog("What number do I start to count down with?");
		int start = Integer.parseInt(starting);
		// 4. count down from user's starting point
		// 1. count down from 10 to 0 (print each number)
		for (int i = start; i > -1; i--) {
		String blastoff=Integer.toString(i);
			speak(blastoff);

		}
		speak("Blast off");

		// 5. when the counting is done, print "blastoff!"
		// 6. replace the print commands with calls to the speak() method

	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
