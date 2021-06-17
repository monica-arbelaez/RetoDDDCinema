package domain.boleto.values;

import co.com.sofka.domain.generic.Identity;

public class BoletoId extends Identity {
    private BoletoId(String id) {
        super(id);
    }

    public BoletoId() {
    }

    public static BoletoId of(String id){
        return new BoletoId(id);
    }
}
