import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame {
	private JLabel nameLabel = new JLabel();
	private JLabel gewichtLabel = new JLabel();
	private JLabel groesseLabel = new JLabel();
	private JTextField nameTextFeld = new JTextField();
	private JTextField gewichtTextFeld = new JTextField();
	private JTextField groesseTextFeld = new JTextField();
	private JButton datenErfassenButton = new JButton();
	private JButton anzeigeAktuallisierenButton = new JButton();
	private JLabel bmiLabel = new JLabel();
	private JTextField bmiTextFeld = new JTextField();
	private JTextField bmiTextTextFeld = new JTextField();
	private JButton loeschenButton = new JButton();
	private JButton beendenButton = new JButton();

	public GUI() {
		super();
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		int frameWidth = 302;
		int frameHeight = 300;
		setSize(frameWidth, frameHeight);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (d.width - getSize().width) / 2;
		int y = (d.height - getSize().height) / 2;
		setLocation(x, y);
		setTitle("BMI-Rechner");
		setResizable(false);
		Container cp = getContentPane();
		cp.setLayout(null);

		nameLabel.setBounds(10, 20, 110, 20);
		nameLabel.setText("Name");
		cp.add(nameLabel);
		gewichtLabel.setBounds(10, 50, 110, 20);
		gewichtLabel.setText("Gewicht in m");
		cp.add(gewichtLabel);
		groesseLabel.setBounds(10, 80, 110, 20);
		groesseLabel.setText("Groesse in kg");
		cp.add(groesseLabel);
		nameTextFeld.setBounds(140, 20, 150, 20);
		cp.add(nameTextFeld);
		gewichtTextFeld.setBounds(140, 50, 150, 20);
		cp.add(gewichtTextFeld);
		groesseTextFeld.setBounds(140, 80, 150, 20);
		cp.add(groesseTextFeld);
		datenErfassenButton.setBounds(10, 110, 280, 25);
		datenErfassenButton.setText("Daten erfassen");
		datenErfassenButton.setMargin(new Insets(2, 2, 2, 2));
		datenErfassenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				JOptionPane.showMessageDialog(null, "Not yet implemented", "Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		cp.add(datenErfassenButton);
		anzeigeAktuallisierenButton.setBounds(10, 140, 280, 25);
		anzeigeAktuallisierenButton.setText("Anzeige aktualisieren");
		anzeigeAktuallisierenButton.setMargin(new Insets(2, 2, 2, 2));
		anzeigeAktuallisierenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				
			}
		});
		cp.add(anzeigeAktuallisierenButton);
		bmiLabel.setBounds(10, 170, 110, 20);
		bmiLabel.setText("BMI:");
		cp.add(bmiLabel);
		bmiTextFeld.setBounds(140, 170, 150, 20);
		bmiTextFeld.setEditable(false);
		cp.add(bmiTextFeld);
		bmiTextTextFeld.setBounds(50, 200, 200, 20);
		bmiTextTextFeld.setEditable(false);
		cp.add(bmiTextTextFeld);
		loeschenButton.setBounds(10, 230, 130, 25);
		loeschenButton.setText("Loeschen");
		loeschenButton.setMargin(new Insets(2, 2, 2, 2));
		loeschenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				nameTextFeld.setText("");
				gewichtTextFeld.setText("");
				groesseTextFeld.setText("");
				bmiTextFeld.setText("");
				bmiTextTextFeld.setText("");
			}
		});
		cp.add(loeschenButton);
		beendenButton.setBounds(160, 230, 130, 25);
		beendenButton.setText("Beenden");
		beendenButton.setMargin(new Insets(2, 2, 2, 2));
		beendenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				System.exit(0);
			}
		});
		cp.add(beendenButton);

		setVisible(true);
	}

	public static void main(String[] args) {
		new GUI();
	}

	public void jButton1_ActionPerformed(ActionEvent evt) {
		// TODO hier Quelltext einfügen

	}

	public void jButton2_ActionPerformed(ActionEvent evt) {
		// TODO hier Quelltext einfügen

	}

	public void jButton3_ActionPerformed(ActionEvent evt) {
		// TODO hier Quelltext einfügen

	}

	public void jButton4_ActionPerformed(ActionEvent evt) {
		// TODO hier Quelltext einfügen

	}
}
