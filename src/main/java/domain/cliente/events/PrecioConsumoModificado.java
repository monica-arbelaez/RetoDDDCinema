package domain.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.cliente.values.ConsumoId;
import domain.genericvalues.Precio;

public class PrecioConsumoModificado extends DomainEvent {
    private ConsumoId consumoId;
    private Precio precio;

    public PrecioConsumoModificado(ConsumoId consumoId, Precio precio) {
        super("cine.cliente.precioconsumomodificado");
        this.consumoId = consumoId;
        this.precio = precio;
    }

    public ConsumoId getConsumoId() {
        return consumoId;
    }

    public Precio getPrecio() {
        return precio;
    }
}
