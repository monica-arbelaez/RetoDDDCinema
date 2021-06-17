package domain.funcion.values;

import co.com.sofka.domain.generic.Identity;

public class PeliculaId extends Identity {
    private PeliculaId(String uid) {
        super(uid);
    }

    public PeliculaId(){}

    public static PeliculaId of(String uid){
        return new PeliculaId(uid);
    }
}
