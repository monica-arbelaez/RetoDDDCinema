package domain.cliente.values;

import co.com.sofka.domain.generic.Identity;

public class MembresiaId extends Identity {
    private MembresiaId(String id) {
        super(id);
    }

    public MembresiaId(){}

    public static MembresiaId of(String id){
        return new MembresiaId(id);
    }

}
