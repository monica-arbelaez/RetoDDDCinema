package domain.sala.entity;

import co.com.sofka.domain.generic.Entity;
import domain.genericvalues.Nombre;
import domain.sala.values.FechaHoraDeFuncionId;
import domain.sala.values.SalaId;
import domain.sala.values.Silla;

import java.util.Set;


public class Sala extends Entity<SalaId> {
    private Nombre nombre;
    private Set<Silla> sillas;
    private Set<FechaHoraDeFuncionId> fechaHoraDeFuncionIds;
    private Pelicula pelicula;
    private Empleado empleado;

//   public Funcion(FuncionId entityId){
//       super(entityId);
//       appenChange(new FuncionGenerada(horaDeFuncion, sala, pelicula, empleado))
//   }


    public Sala(SalaId entityId, Nombre nombre, Set<Silla> sillas, Set<FechaHoraDeFuncionId> fechaHoraDeFuncionIds, Pelicula pelicula, Empleado empleado) {
        super(entityId);
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
