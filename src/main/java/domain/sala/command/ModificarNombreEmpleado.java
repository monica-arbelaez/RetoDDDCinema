package domain.sala.command;

import co.com.sofka.domain.generic.Command;
import domain.genericvalues.Nombre;
import domain.sala.values.EmpleadoId;
import domain.sala.values.SalaId;

public class ModificarNombreEmpleado implements Command {
    private final EmpleadoId empleadoId;
    private final Nombre nombre;
    private final SalaId salaId;

    public ModificarNombreEmpleado(EmpleadoId empleadoId, Nombre nombre, SalaId salaId) {
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
