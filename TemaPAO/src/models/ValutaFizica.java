package models;

public class ValutaFizica extends Valuta{
    protected String taraOrigine;

    public ValutaFizica(String taraOrigine) {
        this.taraOrigine = taraOrigine;
    }

    public String getTaraOrigine() {
        return taraOrigine;
    }

    public void setTaraOrigine(String taraOrigine) {
        this.taraOrigine = taraOrigine;
    }
}
