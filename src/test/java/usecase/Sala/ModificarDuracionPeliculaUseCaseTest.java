package usecase.Sala;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import domain.sala.command.ModificarDuracionPelicula;
import domain.sala.events.DuracionPeliculaModificada;
import domain.sala.values.Duracion;
import domain.sala.values.PeliculaId;
import domain.sala.values.SalaId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class ModificarDuracionPeliculaUseCaseTest {
    private ModificarDuracionPeliculaUseCase modificarDuracionPeliculaUseCase;
    private DomainEventRepository repository;

    @BeforeEach
    public void setup(){
        modificarDuracionPeliculaUseCase = new ModificarDuracionPeliculaUseCase();
        repository = mock(DomainEventRepository.class);
        modificarDuracionPeliculaUseCase.addRepository((repository));
    }
    @Test
    public void modificarDuracionPeliculaHappyPath(){
        var command = new ModificarDuracionPelicula(
                PeliculaId.of("3456"),
                new Duracion("60min"),
                SalaId.of("3455")

        );
        when(repository.getEventsBy((any()))).thenReturn(eventsList());
        var response = UseCaseHandler.getInstance().setIdentifyExecutor("xxxx")
                .syncExecutor(modificarDuracionPeliculaUseCase, new RequestCommand<>(command))
                .orElseThrow();
        var events = response.getDomainEvents();
        DuracionPeliculaModificada duracionPeliculaModificada = (DuracionPeliculaModificada) events.get(0);
        Assertions.assertEquals("50min",duracionPeliculaModificada.getDuracion().value());
    }
    private List<DomainEvent> eventsList() {
        return List.of(
                new DuracionPeliculaModificada(PeliculaId.of("7665"),
                        new Duracion("50min"),
                        SalaId.of("6543")
                        )
        );
    }
}