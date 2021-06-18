package domain.sala.command;

import co.com.sofka.domain.generic.Command;
import domain.sala.values.Cedula;
import domain.sala.values.EmpleadoId;

public class ModificarCedulaEmpleado implements Command {
    private final EmpleadoId empleadoId;
    private  final Cedula cedula;

    public ModificarCedulaEmpleado(EmpleadoId empleadoId, Cedula cedula) {
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
