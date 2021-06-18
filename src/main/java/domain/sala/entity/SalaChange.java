package domain.sala.entity;

import co.com.sofka.domain.generic.EventChange;
import domain.sala.events.*;

import java.util.HashSet;

public class SalaChange extends EventChange {



    public SalaChange(Sala sala) {
        apply((SalaGenerada event)->{
          sala.sillas = new HashSet<>();
          sala.fechaHoraDeFuncionIds =new HashSet<>();
          sala.pelicula = event.getPelicula();
          sala.empleado = event.getEmpleado();
       });
        apply((CedulaEmpleadoModificado event)->{
            sala.modificarCedulaEmplaedo(event.getEmpleadoId(),event.getCedula());

        });
        apply((DuracionPeliculaModificada event)->{
            sala.modificarDuracionPelicula(event.getPeliculaId(),event.getDuracion());
        });
        apply((EmpleadoGenerado event)->{
            sala.GenerarEmpleado(event.getEmpleadoId(),event.getNombre(),event.getCorreo(),event.getCedula());
        });
        apply((FechaDeFuncionAgregada event)->{
            sala.AgregarFechaDeFuncion(event.getFechaHoraDeFuncionId(),event.getFechaHoraFuncionPelicula());
        });
        apply((NombreDeSalaModificada event)->{
            sala.ModificarNombreDeSala(event.getSalaId(),event.getNombre());
        });
        apply((NombreEmpleadoModificado event)->{
            sala.ModificarNombreEmplado(event.getEmpleadoId(),event.getNombre());
        });
        apply((NombrePeliculaModificada event)->{
            sala.ModificarNombrePelicula(event.getPeliculaId(),event.getNombre());
        });
        apply((PeliculaGenerada event)->{
            sala.GenerarPelicula(event.getPeliculaId(),event.getDuracion(), event.getNombre());
        });
        apply((SalaModificada event)->{
            sala.ModificarSala(event.getSalaId(),event.getSillas(),event.getFechaHoraDeFuncionIds(),event.getPelicula(), event.getEmpleado());
        });

    }
}
