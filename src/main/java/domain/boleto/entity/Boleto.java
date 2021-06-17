package domain.boleto.entity;

import co.com.sofka.domain.generic.Entity;
import domain.boleto.values.BoletoId;
import domain.boleto.values.FechaFuncion;
import domain.genericvalues.Precio;
import domain.boleto.values.Silla;

public class Boleto extends Entity<BoletoId> {
    private final FechaFuncion fechaFuncion;
    private final Precio precio;
    private  final Silla silla;

    public Boleto (BoletoId entityId, FechaFuncion fechaFuncion, Precio precio, Silla silla ){
        super(entityId);
        this.fechaFuncion = fechaFuncion;
        this.precio = precio;
        this.silla = silla;
    }

    public FechaFuncion getFechaFuncion() {
        return fechaFuncion;
    }

    public Precio getPrecio() {
        return precio;
    }

    public Silla getSilla() {
        return silla;
    }
}
