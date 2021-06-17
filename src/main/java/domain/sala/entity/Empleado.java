package domain.sala.entity;

import co.com.sofka.domain.generic.Entity;
import domain.sala.values.Cedula;
import domain.sala.values.Correo;
import domain.sala.values.EmpleadoId;
import domain.genericvalues.Nombre;

public class Empleado extends Entity<EmpleadoId> {
    private Nombre nombre;
    private Cedula cedula;
    private Correo correo;

    public Empleado(EmpleadoId entityId, Nombre nombre, Cedula cedula, Correo correo) {
        super(entityId);
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Cedula getCedula() {
        return cedula;
    }

    public Correo getCorreo() {
        return correo;
    }
}
