package domain.cliente.values;

import co.com.sofka.domain.generic.Identity;

public class MembresiaId extends Identity {
    private MembresiaId(String uid) {
        super(uid);
    }

    public MembresiaId(){}

    public static MembresiaId of(String uid){
        return new MembresiaId(uid);
    }

}
