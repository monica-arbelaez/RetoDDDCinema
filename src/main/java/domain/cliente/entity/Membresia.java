package domain.cliente.entity;

import co.com.sofka.domain.generic.Entity;
import domain.cliente.values.FechaDeVencimiento;
import domain.cliente.values.MembresiaId;
import domain.cliente.values.Tipo;

public class Membresia extends Entity<MembresiaId> {
    private final Tipo tipo;
    private  final FechaDeVencimiento fechaDeVencimiento;

    public Membresia(MembresiaId entityId, Tipo tipo, FechaDeVencimiento fechaDeVencimiento) {
        super(entityId);
        this.tipo = tipo;
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public FechaDeVencimiento getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }
}
