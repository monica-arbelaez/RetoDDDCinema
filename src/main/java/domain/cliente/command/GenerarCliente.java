package domain.cliente.command;

import co.com.sofka.domain.generic.Command;
import domain.boleto.values.BoletoId;
import domain.cliente.entity.Consumo;
import domain.cliente.entity.Membresia;
import domain.cliente.values.ClienteId;
import domain.genericvalues.Nombre;

public class GenerarCliente implements Command {
    private final ClienteId clienteId;
    private  final Nombre nombre;
    private final Membresia membresia;
    private final BoletoId boletoId;
    private  final Consumo consumo;

    public GenerarCliente(ClienteId clienteId, Nombre nombre, Membresia membresia, BoletoId boletoId, Consumo consumo) {
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
