package domain.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.cliente.values.ConsumoId;
import domain.cliente.values.Descuento;

public class DescuentoDelConsumoModificado extends DomainEvent {
   private final ConsumoId consumoId;
   private final Descuento descuento;

    public DescuentoDelConsumoModificado(ConsumoId consumoId, Descuento descuento) {
        super("cine.cliente.descuentodeldonsumomodificado");
        this.consumoId = consumoId;
        this.descuento = descuento;
    }

    public ConsumoId getConsumoId() {
        return consumoId;
    }

    public Descuento getDescuento() {
        return descuento;
    }
}
