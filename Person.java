class Person {

    private String name;
    private double groesse, gewicht;

    Person() {
        this.name = "";
        this.groesse = Double.MIN_VALUE;
        this.gewicht = Double.MIN_VALUE;
    }

    Person(String name, double groesse, double gewicht) {
        this.name = name;
        this.groesse = groesse;
        this.gewicht = gewicht;
    }

    public double getGewicht() {
        return this.gewicht;
    }
    public double getGroesse() {
        return this.groesse;
    }
    public String getName() {
        return this.name;
    }
    
}