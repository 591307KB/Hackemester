package innlevering1;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave5 {

	public static void main(String[] args) {

		int antall = 0;
		int poeng = 0;
		for (; antall < 2; antall++) {
			poeng = parseInt(showInputDialog("Poengsum"));
			if (poeng > 100 || poeng < 0) {
				showMessageDialog(null, "Poengsummen må være mellom 0 og 100");
				while (poeng > 100 || poeng < 0) {
					poeng = parseInt(showInputDialog("Poengsum"));
				}
			}
			if (poeng >= 0 && poeng < 40) {
				showMessageDialog(null, "F");
			}
			if (poeng >= 40 && poeng < 50) {
				showMessageDialog(null, "E");
			}
			if (poeng >= 50 && poeng < 60) {
				showMessageDialog(null, "D");
			}
			if (poeng >= 60 && poeng < 80) {
				showMessageDialog(null, "C");
			}
			if (poeng >= 80 && poeng < 90) {
				showMessageDialog(null, "B");
			}
			if (poeng >= 90 && poeng <= 100) {
				showMessageDialog(null, "A");
			}
		}
	}
}
