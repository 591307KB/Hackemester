package innlevering1;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave6 {

	public static void main(String[] args) {
		int fakultet = parseInt(showInputDialog("_!"));
		int sum = 1;
		for (; fakultet >= 1; fakultet--) {
			sum *= fakultet;
		}
		showMessageDialog(null, sum);
	}
	

}
