package domain.sala.entity;

import co.com.sofka.domain.generic.Entity;
import domain.sala.values.Duracion;
import domain.sala.values.PeliculaId;
import domain.genericvalues.Nombre;

public class Pelicula extends Entity<PeliculaId>{
    private Duracion duracion;
    private Nombre nombre;

    public Pelicula(PeliculaId entityId, Duracion duracion, Nombre nombre) {
        super(entityId);
        this.duracion = duracion;
        this.nombre = nombre;
    }

    public Duracion getDuracion() {
        return duracion;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
