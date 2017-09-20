import javax.swing.JOptionPane;

public class RollerCoaster {
	public static void main(String[] args) {
		String HowTall = JOptionPane.showInputDialog("How tall are you (in inches)");
		int tall = Integer.parseInt(HowTall);
		if (tall >= 48) {
			JOptionPane.showMessageDialog(null, "You can ride on this RollerCoaster! Have a good time!");
		} else {

			JOptionPane.showMessageDialog(null, "You need to grow " + (48 - tall) + " inches more.");
		}

	}
}
