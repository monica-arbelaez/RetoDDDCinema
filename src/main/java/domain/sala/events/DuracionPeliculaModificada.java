package domain.sala.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.sala.values.Duracion;
import domain.sala.values.PeliculaId;

public class DuracionPeliculaModificada  extends DomainEvent {
    private final PeliculaId peliculaId;
    private final Duracion duracion;

    public DuracionPeliculaModificada(PeliculaId peliculaId, Duracion duracion) {
        super("cine.sala.duracionpeliculamodificada");
        this.peliculaId = peliculaId;
        this.duracion = duracion;
    }

    public PeliculaId getPeliculaId() {
        return peliculaId;
    }

    public Duracion getDuracion() {
        return duracion;
    }
}
