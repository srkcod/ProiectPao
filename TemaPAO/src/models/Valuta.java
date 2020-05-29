package models;

public class Valuta {
    protected float valoareLeu;
    protected String name;
    protected String abreviation;

    public Valuta(float valoareLeu, String name, String abreviation) {
        this.valoareLeu = valoareLeu;
        this.name = name;
        this.abreviation = abreviation;
    }

    public Valuta() {

    }

    public float getValoareLeu() {
        return valoareLeu;
    }

    public void setValoareLeu(float valoareLeu) {
        this.valoareLeu = valoareLeu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbreviation() {
        return abreviation;
    }

    public void setAbreviation(String abreviation) {
        this.abreviation = abreviation;
    }
}
