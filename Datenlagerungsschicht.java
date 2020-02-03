import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JTextField;

class Datenlagerungsschicht {

    private static FileWriter fw;
    private static FileReader fr;
    private static String output;

    public static void writeToFile(Person p) throws IOException {
        fw = new FileWriter("benutzerDaten.txt", false);
        output = "Name: " + p.getName() + "\nGröße: " + p.getGroesse() + "\nGewicht: " + p.getGewicht() + "\nBMI: " + BMIRechner.calcBMI(p);
        fw.write(output);
        fw.close();
    }

    public static void readFromFile(JTextField name, JTextField groesse, JTextField gewicht, JTextField bmi) throws IOException {
        fr = new FileReader("benutzerDaten.txt");
        int help = 6;
        String auchHelp = "";
        while (true) {
            
        }
    }

}