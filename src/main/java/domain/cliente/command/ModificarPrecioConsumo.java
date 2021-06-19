package domain.cliente.command;

import co.com.sofka.domain.generic.Command;
import domain.cliente.values.ClienteId;
import domain.cliente.values.ConsumoId;
import domain.genericvalues.Precio;

public class ModificarPrecioConsumo implements Command {
    private final ConsumoId consumoId;
    private final Precio precio;
    private final ClienteId clienteId;

    public ModificarPrecioConsumo(ConsumoId consumoId, Precio precio, ClienteId clienteId) {
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
