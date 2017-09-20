import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String HowOld=JOptionPane.showInputDialog("How old are you");
	int old=Integer.parseInt(HowOld);
	
	if (old>=18) {
String president=	JOptionPane.showInputDialog( "Who should the next president be: Jessica or Jordan?");	
	if (president.equalsIgnoreCase("Jordan")) {
		JOptionPane.showMessageDialog(null, "You are the smartest person on Earth. Thank You");
	}
	else {
		JOptionPane.showMessageDialog(null, "You are wrong. Jordan would be the best President.");
	}
	}
	
	else {
		JOptionPane.showMessageDialog(null, "Nobody cares what you think.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
}
