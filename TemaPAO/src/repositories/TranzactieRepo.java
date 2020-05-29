package repositories;

import models.Tranzactie;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TranzactieRepo {

    private final Set<Tranzactie> tranzactii;
    public TranzactieRepo() throws IOException {
        tranzactii = TranzactieServiceInOut.getInstance().loadTranzactii();
    }

    public Set<Tranzactie> getTranzactii(){
        return Collections.unmodifiableSet(tranzactii);
    }

    public boolean add(final Tranzactie tranzactie){
        return tranzactii.add(tranzactie);
    }

    public boolean remove(final int tranzactionId){
        final Tranzactie tranzactie = getTranzactieByItranzactionId(tranzactionId);
        if(tranzactie == null)
            return false;
        return tranzactii.remove(tranzactie);
    }

    public Tranzactie getTranzactieByItranzactionId(int tranzactionId) {
        for(final Tranzactie tranzactie:tranzactii){
            if(tranzactie.getTranzactionId() == tranzactionId)
                return tranzactie;
        }
        return null;
    }

    public Set<Tranzactie> getTranzactiesByComision(int comision){
        Set<Tranzactie> srcResult = null;
        for(final Tranzactie tranzactie:tranzactii){
            if(tranzactie.getComision() == comision) {
                if (srcResult == null)
                    srcResult = new HashSet<>();
                srcResult.add(tranzactie);
            }
        }
        return srcResult;
    }

    public Set<Tranzactie> getTranzactiesByIncasareValuta(int incasareValuta){
        Set<Tranzactie> srcResult = null;
        for(final Tranzactie tranzactie:tranzactii){
            if(tranzactie.getIncasareValuta()== incasareValuta) {
                if (srcResult == null)
                    srcResult = new HashSet<>();
                srcResult.add(tranzactie);
            }
        }
        return srcResult;
    }
    public Set<Tranzactie> getTranzactiesByPlataLeu(int plataLeu){
        Set<Tranzactie> srcResult = null;
        for(final Tranzactie tranzactie:tranzactii){
            if(tranzactie.getPlataLeu()== plataLeu) {
                if (srcResult == null)
                    srcResult = new HashSet<>();
                srcResult.add(tranzactie);
            }
        }
        return srcResult;
    }
}

