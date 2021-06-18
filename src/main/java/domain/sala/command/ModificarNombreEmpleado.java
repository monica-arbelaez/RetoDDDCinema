package domain.sala.command;

import co.com.sofka.domain.generic.Command;
import domain.genericvalues.Nombre;
import domain.sala.values.EmpleadoId;

public class ModificarNombreEmpleado implements Command {
    private final EmpleadoId empleadoId;
    private final Nombre nombre;

    public ModificarNombreEmpleado(EmpleadoId empleadoId, Nombre nombre) {
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
