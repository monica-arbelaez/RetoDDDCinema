package domain.sala.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.sala.values.Duracion;
import domain.sala.values.PeliculaId;
import domain.sala.values.SalaId;

public class DuracionPeliculaModificada  extends DomainEvent {
    private final PeliculaId peliculaId;
    private final Duracion duracion;
    private final SalaId salaId;

    public DuracionPeliculaModificada(PeliculaId peliculaId, Duracion duracion,SalaId salaId) {
        super("cine.sala.duracionpeliculamodificada");
        this.peliculaId = peliculaId;
        this.duracion = duracion;
        this.salaId = salaId;
    }

    public PeliculaId getPeliculaId() {
        return peliculaId;
    }

    public Duracion getDuracion() {
        return duracion;
    }

    public SalaId getSalaId() {
        return salaId;
    }
}
