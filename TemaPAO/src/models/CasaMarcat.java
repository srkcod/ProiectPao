package models;

public class CasaMarcat extends Locatie {
    protected int casaId;
    protected float leiInCasa;

    public CasaMarcat(int casaId, float leiInCasa) {
        super();
        this.casaId = casaId;
        this.leiInCasa = leiInCasa;
    }

    public CasaMarcat() {

    }

    public int getCasaId() {
        return casaId;
    }

    public void setCasaId(int casaId) {
        this.casaId = casaId;
    }

    public float getLeiInCasa() {
        return leiInCasa;
    }

    public void setLeiInCasa(float leiInCasa) {
        this.leiInCasa = leiInCasa;
    }
}
