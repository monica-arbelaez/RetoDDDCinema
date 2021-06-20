package usecase.Sala;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import domain.genericvalues.Nombre;
import domain.sala.command.ModificarNombreEmpleado;
import domain.sala.entity.Empleado;
import domain.sala.entity.Pelicula;
import domain.sala.events.NombreEmpleadoModificado;
import domain.sala.events.SalaGenerada;
import domain.sala.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ModificarNombreEmpleadoUseCaseTest {
    private ModificarNombreEmpleadoUseCase modificarNombreEmpleadoUseCase;
    private DomainEventRepository repository;

    @BeforeEach
    public void setup(){
        modificarNombreEmpleadoUseCase = new ModificarNombreEmpleadoUseCase();
        repository = mock(DomainEventRepository.class);
        modificarNombreEmpleadoUseCase.addRepository(repository);
    }
    @Test
    public void nombreEmpleadoHappyPath(){
        var command = new ModificarNombreEmpleado(EmpleadoId.of("5677"),new Nombre("Maria"),new SalaId("9876"));
        when(repository.getEventsBy((any()))).thenReturn(eventsList());

        var response = UseCaseHandler.getInstance().setIdentifyExecutor("Maria")
                .syncExecutor(modificarNombreEmpleadoUseCase,new RequestCommand<>(command))
                .orElseThrow();
        var events = response.getDomainEvents();
        NombreEmpleadoModificado nombreEmpleadoModificado = (NombreEmpleadoModificado) events.get(0);
        Assertions.assertEquals("Maria",nombreEmpleadoModificado.getNombre().value());

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