package domain.cliente.entity;

import co.com.sofka.domain.generic.Entity;
import domain.cliente.values.ClienteId;
import domain.cliente.values.FechaDeVencimiento;
import domain.cliente.values.MembresiaId;
import domain.cliente.values.TipoMembresia;

public class Membresia extends Entity<MembresiaId> {
    private final TipoMembresia tipoMembresia;
    private  final FechaDeVencimiento fechaDeVencimiento;
    private final ClienteId clienteId;

    public Membresia(MembresiaId entityId, TipoMembresia tipoMembresia, FechaDeVencimiento fechaDeVencimiento, ClienteId clienteId) {
        super(entityId);
        this.tipoMembresia = tipoMembresia;
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.clienteId = clienteId;
    }

    public TipoMembresia getTipoMembresia() {
        return tipoMembresia;
    }

    public FechaDeVencimiento getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }
}
