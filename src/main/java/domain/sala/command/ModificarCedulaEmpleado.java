package domain.sala.command;

import co.com.sofka.domain.generic.Command;
import domain.sala.values.Cedula;
import domain.sala.values.EmpleadoId;
import domain.sala.values.SalaId;

public class ModificarCedulaEmpleado implements Command {
    private final EmpleadoId empleadoId;
    private  final Cedula cedula;
    private final SalaId salaId;

    public ModificarCedulaEmpleado(EmpleadoId empleadoId, Cedula cedula, SalaId salaId) {
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
