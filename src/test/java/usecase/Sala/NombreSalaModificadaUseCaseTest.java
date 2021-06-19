package usecase.Sala;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import domain.genericvalues.Nombre;
import domain.sala.command.GenerarSala;
import domain.sala.command.ModificarNombreDeSala;
import domain.sala.entity.Empleado;
import domain.sala.entity.Pelicula;
import domain.sala.entity.Sala;
import domain.sala.events.NombreDeSalaModificada;
import domain.sala.events.SalaGenerada;
import domain.sala.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class NombreSalaModificadaUseCaseTest {

    private NombreDeSalaModicadaUseCase nombreDeSalaModicadaUseCase;
    private DomainEventRepository repository;


    @BeforeEach
    public void setup(){
        nombreDeSalaModicadaUseCase = new NombreDeSalaModicadaUseCase();
        repository= mock(DomainEventRepository.class);
        nombreDeSalaModicadaUseCase.addRepository(repository);
    }

    @Test
    public void nombreSalaHappyPath(){
        var command = new ModificarNombreDeSala(SalaId.of("4567"),new Nombre("Maria"));
        when(repository.getEventsBy((any()))).thenReturn(eventsList());

        var response = UseCaseHandler.getInstance().setIdentifyExecutor("xxxx")
                .syncExecutor(nombreDeSalaModicadaUseCase, new RequestCommand<>(command))
                .orElseThrow();

        var events = response.getDomainEvents();
        NombreDeSalaModificada nombreDeSalaModificada = (NombreDeSalaModificada) events.get(0);
        Assertions.assertEquals("Maria",nombreDeSalaModificada.getNombre().value());

    }

    private List<DomainEvent> eventsList() {
        return List.of(
              new SalaGenerada(
                        SalaId.of("6788"),
                        new Nombre("Sala3D"),
                        new HashSet<>(),
                        new HashSet<>(),
                        new Pelicula(PeliculaId.of("2222"),new Duracion("90minutos"),new Nombre("La Llorona")),
                        new Empleado(EmpleadoId.of("0001"),new Nombre("Oscar"), new Cedula("1234567"),new Correo("Oscar123@gmail.com"))


                ));
    }

}
