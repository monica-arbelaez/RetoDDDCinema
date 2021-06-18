package domain.sala.command;

import co.com.sofka.domain.generic.Command;
import domain.sala.values.Duracion;
import domain.sala.values.PeliculaId;

public class ModificarDuracionPelicula implements Command {
    private final PeliculaId peliculaId;
    private final Duracion duracion;

    public ModificarDuracionPelicula(PeliculaId peliculaId, Duracion duracion) {
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
