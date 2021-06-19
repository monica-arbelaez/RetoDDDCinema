package domain.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.cliente.values.ClienteId;
import domain.cliente.values.ConsumoId;
import domain.genericvalues.Precio;

public class PrecioConsumoModificado extends DomainEvent {
    private final ConsumoId consumoId;
    private final Precio precio;
    private final ClienteId clienteId;

    public PrecioConsumoModificado(ClienteId clienteId,ConsumoId consumoId, Precio precio) {
        super("cine.cliente.precioconsumomodificado");
        this.consumoId = consumoId;
        this.precio = precio;
        this.clienteId = clienteId;
    }

    public ConsumoId getConsumoId() {
        return consumoId;
    }

    public Precio getPrecio() {
        return precio;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }
}
