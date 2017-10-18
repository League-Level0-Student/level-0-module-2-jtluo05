import javax.swing.JOptionPane;

public class RelationalCheckpoint {
	public static void main(String[] args) {
		String cups = JOptionPane.showInputDialog("How many cups of" + " flour do you have?");
		int flour = Integer.parseInt(cups);
		if (flour < 2) {
			JOptionPane.showMessageDialog(null, "Go buy more at the store!!!!");
		}
		String people = JOptionPane.showInputDialog("How many people are you going " + "to bake cookies for?");
		int num = Integer.parseInt(people);
		if (num > 30) {
			JOptionPane.showMessageDialog(null, "You have to bake 2 batches of cookies!");
		}
		String batches = JOptionPane.showInputDialog("How many batches did you make?");
		int batches1 = Integer.parseInt(batches);
		if (batches1 > 1) {

			JOptionPane.showMessageDialog(null, "You are lucky to have that many freinds!!!");
		}

	}
}
