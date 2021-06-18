package domain.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.cliente.values.FechaDeVencimiento;
import domain.cliente.values.MembresiaId;
import domain.cliente.values.TipoMembresia;

public class MembresiaGenerada extends DomainEvent {
    private final MembresiaId membresiaId;
    private final TipoMembresia tipoMembresia;
    private  final FechaDeVencimiento fechaDeVencimiento;

    public MembresiaGenerada( MembresiaId membresiaId, TipoMembresia tipoMembresia, FechaDeVencimiento fechaDeVencimiento) {
        super("cine.cliente.membresiagenerada");
        this.tipoMembresia = tipoMembresia;
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.membresiaId = membresiaId;
    }

    public TipoMembresia getTipoMembresia() {
        return tipoMembresia;
    }

    public FechaDeVencimiento getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public MembresiaId getMembresiaId() {
        return membresiaId;
    }
}
