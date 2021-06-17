package domain.funcion.entity;

import co.com.sofka.domain.generic.Entity;
import domain.funcion.values.Duracion;
import domain.funcion.values.PeliculaId;
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
