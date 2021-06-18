package domain.sala.entity;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.Entity;
import domain.genericvalues.Nombre;
import domain.sala.values.FechaHoraDeFuncionId;
import domain.sala.values.SalaId;
import domain.sala.values.Silla;

import java.util.Set;


public class Sala extends AggregateEvent<SalaId> {
    protected Nombre nombre;
    protected Set<Silla> sillas;
    protected Set<FechaHoraDeFuncionId> fechaHoraDeFuncionIds;
    protected Pelicula pelicula;
    protected Empleado empleado;



    public Sala(SalaId entityId, Nombre nombre, Set<Silla> sillas, Set<FechaHoraDeFuncionId> fechaHoraDeFuncionIds, Pelicula pelicula, Empleado empleado) {
        super(entityId);
        this.nombre = nombre;
        this.sillas = sillas;
        this.fechaHoraDeFuncionIds = fechaHoraDeFuncionIds;
        this.pelicula = pelicula;
        this.empleado = empleado;

    }

    public Nombre nombre() {
        return nombre;
    }

    public Set<Silla> sillas() {
        return sillas;
    }

    public Set<FechaHoraDeFuncionId> fechaHoraDeFuncionIds() {
        return fechaHoraDeFuncionIds;
    }

    public Pelicula pelicula() {
        return pelicula;
    }

    public Empleado empleado() {
        return empleado;
    }
}
