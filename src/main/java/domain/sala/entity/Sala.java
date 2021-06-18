package domain.sala.entity;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.Entity;
import domain.genericvalues.Nombre;
import domain.sala.events.*;
import domain.sala.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Set;


public class Sala extends AggregateEvent<SalaId> {
    protected Nombre nombre;
    protected Set<Silla> sillas;
    protected Set<FechaHoraDeFuncionId> fechaHoraDeFuncionIds;
    protected Pelicula pelicula;
    protected Empleado empleado;



    public Sala(SalaId entityId, Nombre nombre, Set<Silla> sillas, Set<FechaHoraDeFuncionId> fechaHoraDeFuncionIds, Pelicula pelicula, Empleado empleado) {
        super(entityId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(sillas);
        Objects.requireNonNull(fechaHoraDeFuncionIds);
        Objects.requireNonNull(pelicula);
        Objects.requireNonNull(empleado);
       appendChange(new SalaGenerada(entityId,nombre, sillas,fechaHoraDeFuncionIds,pelicula,empleado));

    }

    private Sala(SalaId entituId){
        super(entituId);
        subscribe((new SalaChange(this)));
    }
    public static  Sala From(SalaId salaId, List<DomainEvent> events){
        var sala = new Sala(salaId);
        events.forEach((sala::applyEvent));
        return sala;
    }
    public void modificarCedulaEmplaedo(EmpleadoId entityId, Cedula cedula){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(cedula);
        appendChange(new CedulaEmpleadoModificado(entityId,cedula));
    }
    public void modificarDuracionPelicula(PeliculaId peliculaId, Duracion duracion){
        Objects.requireNonNull(peliculaId);
        Objects.requireNonNull(duracion);
        appendChange(new DuracionPeliculaModificada(peliculaId,duracion));
    }
    public void GenerarEmpleado(EmpleadoId empleadoId, Nombre nombre, Correo correo, Cedula cedula){
        Objects.requireNonNull(empleadoId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(correo);
        Objects.requireNonNull(cedula);
        appendChange(new EmpleadoGenerado(empleadoId,nombre,correo,cedula));
    }
    public void AgregarFechaDeFuncion(FechaHoraDeFuncionId fechaHoraDeFuncionId,FechaHoraFuncionPelicula fechaHoraFuncionPelicula){
        Objects.requireNonNull(fechaHoraDeFuncionId);
        Objects.requireNonNull(fechaHoraFuncionPelicula);
        appendChange(new FechaDeFuncionAgregada(fechaHoraDeFuncionId,fechaHoraFuncionPelicula));
    }
    public void ModificarNombreDeSala(SalaId salaId, Nombre nombre){
        Objects.requireNonNull(salaId);
        Objects.requireNonNull(nombre);
        appendChange(new NombreDeSalaModificada(salaId,nombre));
    }
    public void ModificarNombreEmplado(EmpleadoId empleadoId, Nombre nombre){
        Objects.requireNonNull(empleadoId);
        Objects.requireNonNull(nombre);
        appendChange(new NombreEmpleadoModificado(empleadoId,nombre));
    }
    public void ModificarNombrePelicula(PeliculaId peliculaId, Nombre nombre){
        Objects.requireNonNull(peliculaId);
        Objects.requireNonNull(nombre);
        appendChange(new NombrePeliculaModificada(peliculaId,nombre));
    }
    public void GenerarPelicula(PeliculaId peliculaId, Duracion duracion, Nombre nombre){
        Objects.requireNonNull(peliculaId);
        Objects.requireNonNull(duracion);
        Objects.requireNonNull(nombre);
        appendChange(new PeliculaGenerada(peliculaId,duracion,nombre));
    }
    public void ModificarSala(SalaId salaId, Set<Silla> sillas, Set<FechaHoraDeFuncionId> fechaHoraDeFuncionIds, Pelicula pelicula, Empleado empleado ){
        Objects.requireNonNull(salaId);
        Objects.requireNonNull(sillas);
        Objects.requireNonNull(fechaHoraDeFuncionIds);
        Objects.requireNonNull(pelicula);
        Objects.requireNonNull(empleado);
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
