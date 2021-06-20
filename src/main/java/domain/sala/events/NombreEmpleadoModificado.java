package domain.sala.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.genericvalues.Nombre;
import domain.sala.values.EmpleadoId;
import domain.sala.values.SalaId;

public class NombreEmpleadoModificado extends DomainEvent {
    private final EmpleadoId empleadoId;
    private  final Nombre nombre;
    private final SalaId salaId;

    public NombreEmpleadoModificado(EmpleadoId empleadoId, Nombre nombre, SalaId salaId) {
        super("cine.sala.nombreempleadomodificado");
        this.empleadoId = empleadoId;
        this.nombre = nombre;
        this.salaId = salaId;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public SalaId getSalaId() {
        return salaId;
    }
}
