package domain.sala.command;

import co.com.sofka.domain.generic.Command;
import domain.genericvalues.Nombre;
import domain.sala.values.Duracion;
import domain.sala.values.PeliculaId;

public class GenerarPelicula implements Command {
    private final PeliculaId peliculaId;
    private final Duracion duracion;
    private final Nombre nombre;

    public GenerarPelicula(PeliculaId peliculaId, Duracion duracion, Nombre nombre) {
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
