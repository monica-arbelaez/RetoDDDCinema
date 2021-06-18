package domain.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.cliente.values.ClienteId;
import domain.genericvalues.Nombre;

public class NombreModificado extends DomainEvent {
    private final Nombre nombre;
    private final ClienteId clienteId;

    public NombreModificado(Nombre nombre, ClienteId clienteId) {
        super("cine.cliente.nombremodificado");
        this.nombre = nombre;
        this.clienteId = clienteId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }
}
