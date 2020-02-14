import java.io.IOException;

class BMIRechner {

    static Person per = new Person();

    public static Person createPerson(Person p) {
        per = new Person(p.getName(), p.getGroesse(), p.getGewicht());
        return per;
    }

    public static Person createPerson(String name, double groesse, double gewicht) {
        per = new Person(name, groesse, gewicht);
        return per;
    }

    public static String calcBMI(Person p) {
        return Double.toString(Math.round(p.getGewicht() / Math.pow(p.getGroesse(), 2)) * 100 / 100.0);
    }

    public static boolean exists(String name, double groesse, double gewicht) {
        return name.equals(per.getName()) && groesse == per.getGroesse() && gewicht == per.getGewicht();
    }

    public static void writter() throws IOException {
        Datenlagerungsschicht.writeToFile(per);
    }

    public static void writter(Person p) throws IOException {
        Datenlagerungsschicht.writeToFile(p);
        createPerson(p);
    }

    public static String[] getDataFromFile() throws IOException {
        return Datenlagerungsschicht.readFromFile();
    }

    public static String setTextBmi(Person p) {
        if (Double.parseDouble(calcBMI(p)) < 19.0) {
            return "Untergewicht";
        } else if (Double.parseDouble(calcBMI(p)) > 25.0) {
            return "Uebergewicht";
        } else {
            return "Normalgewicht";
        }
    }
}