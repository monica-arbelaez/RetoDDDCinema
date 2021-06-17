package domain.cliente.entity;

import co.com.sofka.domain.generic.Entity;
import domain.cliente.values.ConsumoId;
import domain.cliente.values.Descuento;
import domain.genericvalues.Precio;

public class Consumo extends Entity<ConsumoId> {
    private final Precio precio;
    private  final Descuento descuento;

    public Consumo(ConsumoId entityId, Precio precio, Descuento descuento) {
        super(entityId);
        this.precio = precio;
        this.descuento =descuento;

    }

    public Precio getPrecio() {
        return precio;
    }

    public Descuento getDescuento() {
        return descuento;
    }
}
