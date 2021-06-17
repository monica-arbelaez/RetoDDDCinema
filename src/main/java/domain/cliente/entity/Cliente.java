package domain.cliente.entity;

import co.com.sofka.domain.generic.Entity;
import domain.boleto.values.BoletoId;
import domain.cliente.values.ClienteId;
import domain.genericvalues.Nombre;

import java.util.Objects;


public class Cliente extends Entity<ClienteId> {
    protected Nombre nombre;
    protected Membresia membresia;
    protected BoletoId boletoId;
    protected Consumo consumo;

    public Cliente(ClienteId entityId, Nombre nombre, Membresia membresia, BoletoId boletoId, Consumo consumo) {
        super(entityId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(membresia);
        Objects.requireNonNull(boletoId);

    }



}
