package domain.sala.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.sala.values.Cedula;
import domain.sala.values.EmpleadoId;
import domain.sala.values.SalaId;


public class CedulaEmpleadoModificado extends DomainEvent {
    private final EmpleadoId empleadoId;
    private final Cedula cedula;
    private final SalaId salaId;

    public CedulaEmpleadoModificado(EmpleadoId empleadoId, Cedula cedula,SalaId salaId) {
        super("cine.sala.cedulaempleadomodifica");
        this.empleadoId = empleadoId;
        this.cedula = cedula;
        this.salaId = salaId;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public Cedula getCedula() {
        return cedula;
    }

    public SalaId getSalaId() {
        return salaId;
    }
}
