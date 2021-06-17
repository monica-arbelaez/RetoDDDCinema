package domain.funcion.entity;

import co.com.sofka.domain.generic.Entity;
import domain.funcion.values.FuncionId;

import java.util.List;
import java.util.Set;


public class Funcion extends Entity<FuncionId> {
   private Set<Sala> salas;
   private List<Pelicula> peliculas;
   private Set<Empleado> empleados;

    public Funcion(FuncionId entityId, Set<Sala> salas, List<Pelicula> peliculas, Set<Empleado> empleados) {
        super(entityId);
        this.salas = salas;
        this.peliculas = peliculas;
        this.empleados = empleados;
    }
 //**************************************** Mirar lo del forEach***********
    public Set<Sala> getSalas() {
        return salas;
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public Set<Empleado> getEmpleados() {
        return empleados;
    }
}
