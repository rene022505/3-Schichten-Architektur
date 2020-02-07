import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

class Datenlagerungsschicht {

    private static FileWriter fw;
    private static BufferedReader br;
    private static String output;
    private static String[] data = new String[4];

    public static void writeToFile(Person p) throws IOException {
        fw = new FileWriter("benutzerDaten.txt", false);
        output = p.getName() + "\n" + p.getGroesse() + "\n" + p.getGewicht() + "\n" + BMIRechner.calcBMI(p);
        fw.write(output);
        fw.close();
    }

    public static String[] readFromFile() throws IOException {
        if (!new File("benutzerDaten.txt").exists()) {
            fw = new FileWriter("benutzerDaten.txt", false);
            fw.write("\n\n\n\n");
            fw.close();
        }
        br = new BufferedReader(new FileReader("benutzerDaten.txt"));
        for (int i = 0; i < 4; i++) {
            data[i] = br.readLine();
        }
        br.close();
        return data;
    }

}