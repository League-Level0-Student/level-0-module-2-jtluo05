import javax.swing.JOptionPane;

public class SimpleNumberSorter {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Give me one number.");
		String b = JOptionPane.showInputDialog("Give me another number.");
		String c = JOptionPane.showInputDialog("Give me one last number.");

		int aa = Integer.parseInt(a);
		int bb = Integer.parseInt(b);
		int cc = Integer.parseInt(c);
		if (aa < bb && aa < cc) {
			System.out.println(aa);
			if (bb < cc) {
				System.out.println(bb);
				System.out.println(cc);
			} else {
				System.out.println(cc);
				System.out.println(bb);
			}
		} else if (bb < aa && bb < cc) {
			System.out.println(bb);
			if (aa < cc) {
				System.out.println(aa);
				System.out.println(cc);
			} else {
				System.out.println(cc);
				System.out.println(aa);
			}
		}

		else {
			System.out.println(cc);
			if (bb < aa) {
				System.out.println(bb);
				System.out.println(aa);
			} else {
				System.out.println(aa);
				System.out.println(bb);
			}
		}

	}
}
