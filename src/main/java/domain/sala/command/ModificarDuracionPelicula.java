package domain.sala.command;

import co.com.sofka.domain.generic.Command;
import domain.sala.values.Duracion;
import domain.sala.values.PeliculaId;
import domain.sala.values.SalaId;

public class ModificarDuracionPelicula implements Command {
    private final PeliculaId peliculaId;
    private final Duracion duracion;
    private final SalaId salaId;

    public ModificarDuracionPelicula(PeliculaId peliculaId, Duracion duracion,SalaId salaId) {
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
