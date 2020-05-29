package models;

public class ValutaDigitala extends Valuta {
    protected String tipTehnologie;

    public ValutaDigitala(String tipTehnologie) {
        super();
        this.tipTehnologie = tipTehnologie;
    }

    public String getTipTehnologie() {
        return tipTehnologie;
    }

    public void setTipTehnologie(String tipTehnologie) {
        this.tipTehnologie = tipTehnologie;
    }
}
