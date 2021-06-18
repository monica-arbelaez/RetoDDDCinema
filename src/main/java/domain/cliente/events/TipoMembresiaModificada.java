package domain.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.cliente.values.FechaDeVencimiento;
import domain.cliente.values.MembresiaId;
import domain.cliente.values.TipoMembresia;

public class TipoMembresiaModificada extends DomainEvent {
    private final MembresiaId membresiaId;
    private final TipoMembresia tipoMembresia;
    private  final FechaDeVencimiento fechaDeVencimiento;

    public TipoMembresiaModificada(MembresiaId membresiaId, TipoMembresia tipoMembresia, FechaDeVencimiento fechaDeVencimiento) {
        super("cine.cliente.tipomembresiamodificada");
        this.membresiaId = membresiaId;
        this.tipoMembresia = tipoMembresia;
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public MembresiaId getMembresiaId() {
        return membresiaId;
    }

    public TipoMembresia getTipoMembresia() {
        return tipoMembresia;
    }

    public FechaDeVencimiento getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }
}



