package repositories;

import models.Locatie;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LocatieRepo {

    private final Set<Locatie> Locatii;
    public LocatieRepo() throws IOException {
        Locatii = LocatieServiceInOut.getInstance().loadLocatii();
    }

    public Set<Locatie> getLocatii(){
        return Collections.unmodifiableSet(Locatii);
    }

    public boolean add(final Locatie locatie){
        return Locatii.add(locatie);
    }

    public boolean remove(final int locationId){
        final Locatie locatie = getLocatieByLocationId(locationId);
        if(locatie == null)
            return false;
        return Locatii.remove(locatie);
    }

    public Locatie getLocatieByLocationId(int locationId) {
        for(final Locatie locatie:Locatii){
            if(locatie.getLocationId() == locationId)
                return locatie;
        }
        return null;
    }

    public Set<Locatie> getLocatiiByNume(String locationName){
        Set<Locatie> srcResult = null;
        for(final Locatie locatie:Locatii){
            if(locatie.getLocationName().equals(locationName)) {
                if (srcResult == null)
                    srcResult = new HashSet<>();
                srcResult.add(locatie);
            }
        }
        return srcResult;
    }

    
}
    