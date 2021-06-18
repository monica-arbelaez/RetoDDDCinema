package domain.sala.command;

import co.com.sofka.domain.generic.Command;
import domain.genericvalues.Nombre;
import domain.sala.values.Cedula;
import domain.sala.values.Correo;
import domain.sala.values.EmpleadoId;

public class GenerarEmpleado implements Command {
    private final EmpleadoId empleadoId;
    private final Nombre nombre;
    private final Correo correo;
    private final Cedula cedula;

    public GenerarEmpleado(EmpleadoId empleadoId, Nombre nombre, Correo correo, Cedula cedula) {
        this.empleadoId = empleadoId;
        this.nombre = nombre;
        this.correo = correo;
        this.cedula = cedula;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Correo getCorreo() {
        return correo;
    }

    public Cedula getCedula() {
        return cedula;
    }
}
