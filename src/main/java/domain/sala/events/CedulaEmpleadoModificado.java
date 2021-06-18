package domain.sala.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.sala.values.Cedula;
import domain.sala.values.EmpleadoId;


public class CedulaEmpleadoModificado extends DomainEvent {
    private final EmpleadoId empleadoId;
    private  final Cedula cedula;

    public CedulaEmpleadoModificado(EmpleadoId empleadoId, Cedula cedula) {
        super("cine.sala.cedulaempleadomodifica");
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
