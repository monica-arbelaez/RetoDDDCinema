package domain.sala.command;

import co.com.sofka.domain.generic.Command;
import domain.genericvalues.Nombre;
import domain.sala.entity.Empleado;
import domain.sala.entity.Pelicula;
import domain.sala.values.FechaHoraDeFuncionId;
import domain.sala.values.Silla;

import java.util.Set;

public class GenerarSala implements Command {
    private final Nombre nombre;
    private final Set<Silla> sillas;
    private final Set<FechaHoraDeFuncionId> fechaHoraDeFuncionIds;
    private final Pelicula pelicula;
    private final Empleado empleado;

    public GenerarSala(Nombre nombre, Set<Silla> sillas, Set<FechaHoraDeFuncionId> fechaHoraDeFuncionIds, Pelicula pelicula, Empleado empleado) {
        this.nombre = nombre;
        this.sillas = sillas;
        this.fechaHoraDeFuncionIds = fechaHoraDeFuncionIds;
        this.pelicula = pelicula;
        this.empleado = empleado;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Set<Silla> getSillas() {
        return sillas;
    }

    public Set<FechaHoraDeFuncionId> getFechaHoraDeFuncionIds() {
        return fechaHoraDeFuncionIds;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public Empleado getEmpleado() {
        return empleado;
    }
}
