package domain.sala.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.sala.entity.Empleado;
import domain.sala.values.Cedula;
import domain.sala.values.EmpleadoId;


import java.util.Set;

public class CedulaEmpleadoModificado extends DomainEvent {
    private final EmpleadoId empleadoId;
    private  final Cedula cedula;

    public CedulaEmpleadoModificado(EmpleadoId empleadoId, Cedula cedula) {
        super("cine.cliente.cedulaempleadomodifica");
        this.empleadoId = empleadoId;
        this.cedula = cedula;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public Cedula getCedula() {
        return cedula;
    }
}
