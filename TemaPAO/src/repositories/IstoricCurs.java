package repositories;

import models.IstoricCurs;

import java.io.IOException;
import java.util.Collections;
import java.util.Set;

public class IstoricCursRepo {

    private final Set<IstoricCurs> istoricuri;

    public IstoricCursRepo() throws IOException {
        istoricuri = IstoricCursServiceInOut.getInstance().loadIstoricCursuri();
    }

    public Set<IstoricCurs> getIstoricCursuri() {
        return Collections.unmodifiableSet(istoricuri);
    }

    public boolean add(final IstoricCurs doctor) {
        return istoricuri.add(doctor);
    }

    public boolean remove(final int variatiuneLeu) {
        final IstoricCurs doctor = getIstoricCursByvariatiuneLeu(variatiuneLeu);
        if (doctor == null)
            return false;
        return istoricuri.remove(doctor);
    }

    public IstoricCurs getIstoricCursByvariatiuneLeu(int variatiuneLeu) {
        for (final IstoricCurs doctor : istoricuri) {
            if (doctor.getVariatiuneLeu() == variatiuneLeu)
                return doctor;
        }
        return null;
    }



}    