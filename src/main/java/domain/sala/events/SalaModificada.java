package domain.sala.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.sala.entity.Empleado;
import domain.sala.entity.Pelicula;
import domain.sala.values.FechaHoraDeFuncionId;
import domain.sala.values.SalaId;
import domain.sala.values.Silla;

import java.util.Set;

public class SalaModificada extends DomainEvent {
    private  final SalaId salaId;
    private final Set<Silla> sillas;
    private final Set<FechaHoraDeFuncionId> fechaHoraDeFuncionIds;
    private final Pelicula pelicula;
    private final Empleado empleado;

    public SalaModificada(SalaId salaId, Set<Silla> sillas, Set<FechaHoraDeFuncionId> fechaHoraDeFuncionIds, Pelicula pelicula, Empleado empleado) {
        super("cine.sala.salamodificada");
        this.salaId = salaId;
        this.sillas = sillas;
        this.fechaHoraDeFuncionIds = fechaHoraDeFuncionIds;
        this.pelicula = pelicula;
        this.empleado = empleado;
    }

    public SalaId getSalaId() {
        return salaId;
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
