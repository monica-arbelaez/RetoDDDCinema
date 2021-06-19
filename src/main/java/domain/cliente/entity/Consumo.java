package domain.cliente.entity;

import co.com.sofka.domain.generic.Entity;
import domain.cliente.values.ClienteId;
import domain.cliente.values.ConsumoId;
import domain.cliente.values.Descuento;
import domain.genericvalues.Precio;

public class Consumo extends Entity<ConsumoId> {
    private final Precio precio;
    private  final Descuento descuento;
    public ClienteId clienteId;

    public Consumo(ClienteId clienteId, ConsumoId consumoId, Precio precio, Descuento descuento) {
        super(consumoId);
        this.clienteId = clienteId;
        this.precio = precio;
        this.descuento =descuento;

    }

    public Precio getPrecio() {
        return precio;
    }

    public Descuento getDescuento() {
        return descuento;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }
}
