package models;

public class Client implements Comparable<Client>{
    protected int cnp;
    protected String nume;
    protected boolean vip;

    public Client(int cnp, String nume, boolean vip) {
        this.cnp = cnp;
        this.nume = nume;
        this.vip = vip;
    }

    public int getCnp() {
        return cnp;
    }

    public void setCnp(int cnp) {
        this.cnp = cnp;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return super.toString();
    }                                                                 //folosit pentru a sorta alfabetic in functie de nume
    @Override
    public int compareTo(Client o) {
        return this.getNume().compareTo(o.getNume());
    }
}
