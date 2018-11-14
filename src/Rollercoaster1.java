import javax.swing.JOptionPane;

public class Rollercoaster1 {
public static void main(String[] args) {
	String heightstring;
	heightstring = JOptionPane.showInputDialog("What is your height in inches?");
	int heightint = Integer.parseInt(heightstring);
	if(heightint < 48) {
		JOptionPane.showMessageDialog(null, "You are to short to go on the rollercoaster.");
	}else {
		JOptionPane.showMessageDialog(null, "You can go on the rollercoaster.");
	}
}
}
