package domain.funcion.entity;

import co.com.sofka.domain.generic.Entity;
import domain.funcion.values.Cedula;
import domain.funcion.values.EmpleadoId;
import domain.genericvalues.Nombre;

public class Empleado extends Entity<EmpleadoId> {
    private Nombre nombre;
    private Cedula cedula;

    public Empleado(EmpleadoId entityId, Nombre nombre, Cedula cedula) {
        super(entityId);
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Cedula getCedula() {
        return cedula;
    }

}
