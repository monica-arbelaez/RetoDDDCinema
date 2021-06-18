package domain.sala.events;

import domain.sala.entity.Empleado;
import domain.sala.entity.Pelicula;
import domain.sala.values.FechaHoraDeFuncionId;
import domain.sala.values.SalaId;
import domain.sala.values.Silla;

import java.util.Set;

public class SalaGenerada {

    private final Set<Silla> sillas;
    private final Set<FechaHoraDeFuncionId> fechaHoraDeFuncionIds;
    private final Pelicula pelicula;
    private final Empleado empleado;

    public SalaGenerada(SalaId salaId, Set<Silla> sillas, Set<FechaHoraDeFuncionId> fechaHoraDeFuncionIds, Pelicula pelicula, Empleado empleado) {

        this.sillas = sillas;
        this.fechaHoraDeFuncionIds = fechaHoraDeFuncionIds;
        this.pelicula = pelicula;
        this.empleado = empleado;
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

