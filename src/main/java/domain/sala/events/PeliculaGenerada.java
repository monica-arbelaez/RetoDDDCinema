package domain.sala.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.genericvalues.Nombre;
import domain.sala.values.Duracion;
import domain.sala.values.PeliculaId;

public class PeliculaGenerada extends DomainEvent {
    private final PeliculaId peliculaId;
    private final Duracion duracion;
    private final Nombre nombre;

    public PeliculaGenerada(PeliculaId peliculaId, Duracion duracion, Nombre nombre) {
        super("cine.sala.peliculagenerada");
        this.peliculaId = peliculaId;
        this.duracion = duracion;
        this.nombre = nombre;
    }

    public PeliculaId getPeliculaId() {
        return peliculaId;
    }

    public Duracion getDuracion() {
        return duracion;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
