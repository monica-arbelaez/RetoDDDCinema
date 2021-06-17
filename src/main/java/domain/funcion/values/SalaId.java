package domain.funcion.values;

import co.com.sofka.domain.generic.Identity;

public class SalaId extends Identity {
    private SalaId(String uid) {
        super(uid);
    }

    public SalaId(){}

    public static SalaId of(String uid){
        return new SalaId(uid);
    }
}
