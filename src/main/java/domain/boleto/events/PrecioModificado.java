package domain.boleto.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.boleto.values.BoletoId;
import domain.genericvalues.Precio;

public class PrecioModificado  extends DomainEvent {
    private final BoletoId boletoId;
    private  final Precio precio;

    public PrecioModificado(BoletoId boletoId, Precio precio) {
        super("cine.boleto.preciomodificado");
        this.boletoId = boletoId;
        this.precio = precio;
    }



    public BoletoId getBoletoId() {
        return boletoId;
    }

    public Precio getPrecio() {
        return precio;
    }
}
