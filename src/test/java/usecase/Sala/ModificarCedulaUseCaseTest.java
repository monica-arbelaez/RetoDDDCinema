package usecase.Sala;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import domain.sala.command.ModificarCedulaEmpleado;
import domain.sala.events.CedulaEmpleadoModificado;
import domain.sala.values.Cedula;
import domain.sala.values.EmpleadoId;
import domain.sala.values.SalaId;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ModificarCedulaUseCaseTest {
    private ModificarCedulaUseCase  modificarCedulaUseCase;
    private DomainEventRepository repository;

    @BeforeEach
    public void setup(){
        modificarCedulaUseCase = new ModificarCedulaUseCase();
        repository = mock(DomainEventRepository.class);
        modificarCedulaUseCase.addRepository(repository);
    }
    @Test
    public void modificarCedulaHappyPath(){
        var command = new ModificarCedulaEmpleado(
                EmpleadoId.of("1234"),
                new Cedula("34678887"),
                SalaId.of("7478")
        );
        when(repository.getEventsBy((any()))).thenReturn(eventsList());
        var response = UseCaseHandler.getInstance().setIdentifyExecutor("xxxx")
                .syncExecutor(modificarCedulaUseCase, new RequestCommand<>(command))
                .orElseThrow();
        var events = response.getDomainEvents();
        CedulaEmpleadoModificado cedulaEmpleadoModificado = (CedulaEmpleadoModificado) events.get(0);
    }
    private List<DomainEvent> eventsList() {
        return List.of(
                new CedulaEmpleadoModificado(EmpleadoId.of("5678"),
                                        new Cedula("3456788"),

                        SalaId.of("78655")

                )
        );
    }
}