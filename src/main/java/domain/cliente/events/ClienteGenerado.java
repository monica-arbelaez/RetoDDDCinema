package domain.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.boleto.values.BoletoId;
import domain.cliente.entity.Consumo;
import domain.cliente.entity.Membresia;
import domain.cliente.values.ClienteId;
import domain.genericvalues.Nombre;

public class ClienteGenerado  extends DomainEvent {
    private final ClienteId clienteId;
    private final Nombre nombre;
    private final Membresia membresia;
    private final BoletoId boletoId;
    private final Consumo consumo;

    public ClienteGenerado(ClienteId clienteId, Nombre nombre, Membresia membresia, BoletoId boletoId, Consumo consumo) {
        super("cine.cliente.clientegenerado");
        this.clienteId = clienteId;
        this.nombre = nombre;
        this.membresia = membresia;
        this.boletoId = boletoId;
        this.consumo = consumo;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public BoletoId getBoletoId() {
        return boletoId;
    }

    public Consumo getConsumo() {
        return consumo;
    }
}

