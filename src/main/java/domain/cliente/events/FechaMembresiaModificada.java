package domain.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.cliente.values.FechaDeVencimiento;
import domain.cliente.values.MembresiaId;

public class FechaMembresiaModificada extends DomainEvent {
    private final MembresiaId membresiaId;
    private final FechaDeVencimiento fechaDeVencimiento;

    public FechaMembresiaModificada(MembresiaId membresiaId, FechaDeVencimiento fechaDeVencimiento) {
        super("cine.cliente.fechamembresiamodificada");
        this.membresiaId = membresiaId;
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public MembresiaId getMembresiaId() {
        return membresiaId;
    }

    public FechaDeVencimiento getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }
}
