package services;

import models.*;
import org.w3c.dom.ls.LSOutput;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;
import java.sql.SQLOutput;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

public class Serviciu {
    protected float valoare;
    protected float valtranzactie;
    protected List<Client> clientVector;
    protected float variatieLeuEurozi;
    protected String tara;

    public void afisareCursValutar(Valuta v){          //afiseaza cursul valutar al unei monezi in raport cu leul
        this.valoare = v.getValoareLeu();
        System.out.println(valoare);

    }

    public void calculTranzactie(Valuta v, Tranzactie t){
        this.valtranzactie = v.getValoareLeu() * (t.getPlataLeu() * (100- t.getComision()));  //calculeaza cat ar trebui sa dea casa de schimb valutar daca primeste o anumita suma
        System.out.println(valtranzactie);
    }
    public float getCalculTranzactie(Valuta v, Tranzactie t){
        this.valtranzactie = v.getValoareLeu() * (t.getPlataLeu() * (100- t.getComision()));
        return valtranzactie;
    }

    public void inregistrareTranzactie(Tranzactie t, CasaMarcat cm, Locatie l, Client c, Valuta v){
        System.out.println(getCalculTranzactie(v, t));
        System.out.println("Aceasta este suma primita la locatia");
        System.out.println(l.getLocationName());
        System.out.println("La casa de marcat nr");
        System.out.println(cm.getCasaId());
        cm.setLeiInCasa(cm.getLeiInCasa()+getCalculTranzactie(v,t));  //arata o tranzactie noua si updateaza numerarul din casa
    }
    public void afisareClient(Client c){
        System.out.println("Nume");
        System.out.println(c.getNume());
        System.out.println("Cnp");
        System.out.println(c.getCnp());
        if (c.isVip()) {
            System.out.println("Client VIP");     //afiseaza datele unui client
        }
    }
    public void afisareClientSortati(List<Client> clienti){
        java.util.Collections.sort(clienti);                //sorteaza clientii si ii afiseaza dupa nume
        System.out.println(clienti);
    }

    public void updatareVariatieCV(IstoricCurs ic){
        ic.setVariatiuneLeu((int) variatieLeuEurozi);     //updateaza variatia istoricului cursului valutar(fata de ultima valoare)
    }
    public void valutaDigitalaInfo(ValutaDigitala vd, Valuta v){
        System.out.println(v.getName());
        System.out.println("Aceasta valuta are tipul:"+vd.getTipTehnologie());
        System.out.println("O unitate din aceasta valuta reprezinta:"+v.getValoareLeu()+"lei");
        System.out.println("Casa noastra de schimb valutar nu isi asuma responsabilitatea pentru Valuta dvs digitala dupa momentul tranzactionarii");
        System.out.println("Va informam ca valutele digitale reprezinta un risc considerabil mai mare decat o moneda a unui stat");
    }
    public void updateTaraOrigine(ValutaFizica vf){
        vf.setTaraOrigine(tara);
        System.out.println(vf.getTaraOrigine());
    }
    public void introducereClient(List<Client> clienti){
        Client dorian_popa = new Client(1992, "Dorian Popa", true); //introduce un nou client in lista de clienti
    }

    public CasaMarcat introducereCasaMarcat(CasaMarcat cm){
        CasaMarcat aa = new CasaMarcat(12, 200);
        return aa;
    }

    public void stergeCasaMarcat(CasaMarcat cm){
        cm = introducereCasaMarcat(cm);
        cm = new CasaMarcat();
    }


}
