package usecase.Sala;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import domain.genericvalues.Nombre;
import domain.sala.command.GenerarSala;
import domain.sala.entity.Empleado;
import domain.sala.entity.Pelicula;
import domain.sala.events.SalaGenerada;
import domain.sala.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.mockito.Mockito.*;

public class GenerarSalaUseCaseTest {

    private GenerarSalaUseCase generarSalaUseCase;
    private DomainEventRepository repository;

    @BeforeEach
    public void setup(){
        generarSalaUseCase = new GenerarSalaUseCase();
        repository = mock(DomainEventRepository.class);
        generarSalaUseCase.addRepository(repository);
    }

    @Test
    public void setGenerarClienteHappyPath(){
        Set<Silla> sillas = new HashSet<>();
        sillas.add(new Silla("D43"));
        sillas.add(new Silla("H32"));
        Set<FechaHoraDeFuncionId> fechaHoraDeFuncionIds = new HashSet<>();
        fechaHoraDeFuncionIds.add(new FechaHoraDeFuncionId("1"));
        fechaHoraDeFuncionIds.add(new FechaHoraDeFuncionId("2"));

        var command = new GenerarSala(
                    SalaId.of("6788"),
                    new Nombre("Sala3D"),
                    sillas,
                    fechaHoraDeFuncionIds,
                    new Pelicula(PeliculaId.of("2222"),new Duracion("90minutos"),new Nombre("La Llorona")),
                    new Empleado(EmpleadoId.of("0001"),new Nombre("Oscar"), new Cedula("1234567"),new Correo("Oscar123@gmail.com"))

        );

        var response = UseCaseHandler.getInstance()
                .setIdentifyExecutor("6788")
                .syncExecutor(generarSalaUseCase,new RequestCommand<>(command))
                .orElseThrow();

        var events = response.getDomainEvents();
        SalaGenerada salaGenerada = (SalaGenerada) events.get(0);

        Assertions.assertEquals("Sala3D",salaGenerada.getNombre().value());
    }




}
