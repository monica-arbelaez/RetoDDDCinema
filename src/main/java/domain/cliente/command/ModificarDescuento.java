package domain.cliente.command;

import co.com.sofka.domain.generic.Command;
import domain.cliente.entity.Cliente;
import domain.cliente.values.ClienteId;
import domain.cliente.values.ConsumoId;
import domain.cliente.values.Descuento;

public class ModificarDescuento implements Command {
    private final ConsumoId consumoId;
    private final Descuento descuento;
    private final ClienteId clienteId;

    public ModificarDescuento(ConsumoId consumoId, Descuento descuento, ClienteId clienteId) {
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
