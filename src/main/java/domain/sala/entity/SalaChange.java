package domain.sala.entity;

import co.com.sofka.domain.generic.EventChange;
import domain.sala.events.CedulaEmpleadoModificado;
import domain.sala.events.SalaGenerada;
import domain.sala.values.Silla;

import java.util.HashSet;

public class SalaChange extends EventChange {



    public SalaChange(Sala sala) {
//       apply((SalaGenerada event)->{
//           sala.pelicula = event.getPelicula();
////           sala.sillas = new HashSet<>();
//
//       });
        apply((CedulaEmpleadoModificado event)->{

        });
    }
}
