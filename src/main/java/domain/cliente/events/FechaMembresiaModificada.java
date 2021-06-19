package domain.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.cliente.values.ClienteId;
import domain.cliente.values.FechaDeVencimiento;
import domain.cliente.values.MembresiaId;

public class FechaMembresiaModificada extends DomainEvent {
    private final MembresiaId membresiaId;
    private final FechaDeVencimiento fechaDeVencimiento;
    private final ClienteId clienteId;

    public FechaMembresiaModificada(MembresiaId membresiaId, FechaDeVencimiento fechaDeVencimiento, ClienteId clienteId) {
        super("cine.cliente.fechamembresiamodificada");
        this.membresiaId = membresiaId;
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.clienteId = clienteId;
    }

    public MembresiaId getMembresiaId() {
        return membresiaId;
    }

    public FechaDeVencimiento getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }
}
