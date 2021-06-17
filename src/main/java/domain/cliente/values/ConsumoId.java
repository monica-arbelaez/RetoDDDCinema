package domain.cliente.values;

import co.com.sofka.domain.generic.Identity;

public class ConsumoId extends Identity {
    private ConsumoId(String uid) {
        super(uid);
    }

    public ConsumoId(){}

    public static ConsumoId of(String uid){
        return new ConsumoId(uid);
    }

}
