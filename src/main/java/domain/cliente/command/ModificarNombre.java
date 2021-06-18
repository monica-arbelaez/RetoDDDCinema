package domain.cliente.command;

import co.com.sofka.domain.generic.Command;
import domain.cliente.values.ClienteId;
import domain.genericvalues.Nombre;

public class ModificarNombre implements Command {
    private final ClienteId clienteId;
    private final Nombre nombre;

    public ModificarNombre(ClienteId clienteId, Nombre nombre) {
        this.clienteId = clienteId;
        this.nombre = nombre;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
