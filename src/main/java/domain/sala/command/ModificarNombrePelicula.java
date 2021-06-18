package domain.sala.command;

import co.com.sofka.domain.generic.Command;
import domain.genericvalues.Nombre;
import domain.sala.values.PeliculaId;

public class ModificarNombrePelicula implements Command {
    private final PeliculaId peliculaId;
    private final Nombre nombre;

    public ModificarNombrePelicula(PeliculaId peliculaId, Nombre nombre) {
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
