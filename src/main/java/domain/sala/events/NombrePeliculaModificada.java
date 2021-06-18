package domain.sala.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.genericvalues.Nombre;
import domain.sala.values.PeliculaId;

public class NombrePeliculaModificada extends DomainEvent {
    private final PeliculaId peliculaId;
    private final Nombre nombre;

    public NombrePeliculaModificada(PeliculaId peliculaId, Nombre nombre) {
        super("cine.boleto.nombrepeliculamodificada");
        this.peliculaId = peliculaId;
        this.nombre = nombre;
    }

    public PeliculaId getPeliculaId() {
        return peliculaId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
