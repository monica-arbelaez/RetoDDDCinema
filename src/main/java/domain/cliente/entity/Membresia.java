package domain.cliente.entity;

import co.com.sofka.domain.generic.Entity;
import domain.cliente.values.FechaDeVencimiento;
import domain.cliente.values.MembresiaId;
import domain.cliente.values.TipoMembresia;

public class Membresia extends Entity<MembresiaId> {
    private final TipoMembresia tipoMembresia;
    private  final FechaDeVencimiento fechaDeVencimiento;

    public Membresia(MembresiaId entityId, TipoMembresia tipoMembresia, FechaDeVencimiento fechaDeVencimiento) {
        super(entityId);
        this.tipoMembresia = tipoMembresia;
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public TipoMembresia getTipoMembresia() {
        return tipoMembresia;
    }

    public FechaDeVencimiento getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }
}
