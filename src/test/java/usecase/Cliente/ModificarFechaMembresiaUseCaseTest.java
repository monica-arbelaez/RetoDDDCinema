package usecase.Cliente;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import domain.boleto.values.BoletoId;
import domain.cliente.command.ModificarFechaMembresia;
import domain.cliente.entity.Consumo;
import domain.cliente.entity.Membresia;
import domain.cliente.events.ClienteGenerado;
import domain.cliente.events.FechaMembresiaModificada;
import domain.cliente.values.*;
import domain.genericvalues.Nombre;
import domain.genericvalues.Precio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ModificarFechaMembresiaUseCaseTest {
    private ModificarFechaMembresiaUseCase modificarFechaMembresiaUseCase;
    private DomainEventRepository repository;
    @BeforeEach
    public void setup(){
        modificarFechaMembresiaUseCase = new ModificarFechaMembresiaUseCase();
        repository = mock(DomainEventRepository.class);
        modificarFechaMembresiaUseCase.addRepository(repository);
    }
    @Test
    public void modifircaFecheMembresiaHappyPath(){
        var command = new ModificarFechaMembresia(
                MembresiaId.of("1234"),
                new FechaDeVencimiento(1,2,2025),
                ClienteId.of("3457")
        );
        when(repository.getEventsBy((any()))).thenReturn(eventsList());

        var response = UseCaseHandler.getInstance().setIdentifyExecutor("xxxx")
                .syncExecutor(modificarFechaMembresiaUseCase, new RequestCommand<>(command))
                .orElseThrow();
        var events =response.getDomainEvents();
        FechaMembresiaModificada fechaMembresiaModificada = (FechaMembresiaModificada)events.get(0);
        Assertions.assertEquals("01-02-2025",fechaMembresiaModificada.getFechaDeVencimiento().value());
    }
    private List<DomainEvent>eventsList(){
        return List.of(
                new ClienteGenerado(ClienteId.of("5678"),
                        new Nombre("Jhon"),
                        new Membresia(MembresiaId.of("123"),
                                new TipoMembresia("Platino"),
                                new FechaDeVencimiento(1,5,2022),ClienteId.of("8765")),
                        BoletoId.of("345"),
                        new Consumo(ClienteId.of("780"), ConsumoId.of("678"),new Precio(5256.0),new Descuento(2560.0))

                )
        );
    }

}