package models;

public class Tranzactie {
    protected int tranzactionId;
    protected float comision;
    protected float incasareValuta;
    protected float plataLeu;

    public Tranzactie(int tranzactionId, float comision, float incasareValuta, float plataLeu) {
        this.tranzactionId = tranzactionId;
        this.comision = comision;
        this.incasareValuta = incasareValuta;
        this.plataLeu = plataLeu;
    }

    public int getTranzactionId() {
        return tranzactionId;
    }

    public void setTranzactionId(int tranzactionId) {
        this.tranzactionId = tranzactionId;
    }

    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }

    public float getIncasareValuta() {
        return incasareValuta;
    }

    public void setIncasareValuta(float incasareValuta) {
        this.incasareValuta = incasareValuta;
    }

    public float getPlataLeu() {
        return plataLeu;
    }

    public void setPlataLeu(float plataLeu) {
        this.plataLeu = plataLeu;
    }
}
