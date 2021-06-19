package domain.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.cliente.values.ClienteId;
import domain.cliente.values.ConsumoId;
import domain.cliente.values.Descuento;

public class DescuentoDelConsumoModificado extends DomainEvent {
   private final ConsumoId consumoId;
   private final Descuento descuento;
   private final ClienteId clienteId;

    public DescuentoDelConsumoModificado(ConsumoId consumoId, Descuento descuento, ClienteId clienteId) {
        super("cine.cliente.descuentodelconsumomodificado");
        this.consumoId = consumoId;
        this.descuento = descuento;
        this.clienteId = clienteId;
    }

    public ConsumoId getConsumoId() {
        return consumoId;
    }

    public Descuento getDescuento() {
        return descuento;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }
}
