package domain.sala.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.genericvalues.Nombre;
import domain.sala.values.EmpleadoId;

public class NombreEmpleadoModificado extends DomainEvent {
    private final EmpleadoId empleadoId;
    private  final Nombre nombre;

    public NombreEmpleadoModificado(EmpleadoId empleadoId, Nombre nombre) {
        super("cine.sala.nombreempleadomodificado");
        this.empleadoId = empleadoId;
        this.nombre = nombre;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
