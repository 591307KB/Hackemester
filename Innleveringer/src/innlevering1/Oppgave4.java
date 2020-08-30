package innlevering1;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave4 {

	public static void main(String[] args) {

		int inntekt = parseInt(showInputDialog("Inntekt"));

		if (inntekt <= 180800) {
			showMessageDialog(null, "grattis, null trinnskatt");
		}
		if (inntekt > 180800 && inntekt <= 254500) {
			double skatt = inntekt * .019;
			showMessageDialog(null, "Din trinnskatt: " + skatt);
		}
		if (inntekt > 254500 && inntekt <= 639750) {
			double skatt = inntekt * .042;
			showMessageDialog(null, "Din trinnskatt: " + skatt);
		}
		if (inntekt > 639750 && inntekt <= 999550) {
			double skatt = inntekt * .132;
			showMessageDialog(null, "Din trinnskatt: " + skatt);
		}
		if (inntekt > 999550) {
			double skatt = inntekt * .162;
			showMessageDialog(null, "Din trinnskatt: " + skatt);
		}
	}

}
