package domain.cliente.values;

import co.com.sofka.domain.generic.Identity;

public class ConsumoId extends Identity {
    private ConsumoId(String id) {
        super(id);
    }

    public ConsumoId(){}

    public static ConsumoId of(String id){
        return new ConsumoId(id);
    }

}
