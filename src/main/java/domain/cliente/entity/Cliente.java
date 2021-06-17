package domain.cliente.entity;

import co.com.sofka.domain.generic.Entity;
import domain.boleto.entity.Boleto;
import domain.cliente.Consumo;
import domain.cliente.Membresia;
import domain.cliente.values.ClienteId;
import domain.genericvalues.Nombre;


public class Cliente extends Entity<ClienteId> {
    private final Nombre nombre;
    private final domain.cliente.Membresia membresia;
    private final Boleto boleto;
    private final domain.cliente.Consumo consumo;

    public Cliente(ClienteId entityId, Nombre nombre, domain.cliente.Membresia membresia, Boleto boleto, domain.cliente.Consumo consumo) {
        super(entityId);
        this.nombre = nombre;
        this.membresia = membresia;
        this.boleto = boleto;
        this.consumo = consumo;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public Boleto getBoleto() {
        return boleto;
    }

    public Consumo getConsumo() {
        return consumo;
    }
}
