package usecase.Cliente;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import domain.boleto.values.BoletoId;
import domain.cliente.command.ModificarPrecioConsumo;
import domain.cliente.entity.Consumo;
import domain.cliente.entity.Membresia;
import domain.cliente.events.ClienteGenerado;
import domain.cliente.events.PrecioConsumoModificado;
import domain.cliente.values.*;
import domain.genericvalues.Nombre;
import domain.genericvalues.Precio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class ModificarPrecioConsumoUseCaseTest {
    private ModificarPrecioConsumoUseCase modificarPrecioConsumoUseCase;
    private DomainEventRepository repository;

    @BeforeEach
    public void setup(){
        modificarPrecioConsumoUseCase = new ModificarPrecioConsumoUseCase();
        repository = mock(DomainEventRepository.class);
        modificarPrecioConsumoUseCase.addRepository(repository);
    }
    @Test
    public void modificarPrecioConsumoHappyPath(){
        var command = new ModificarPrecioConsumo(
                ConsumoId.of("12345"),
                new Precio(5247.0),
                ClienteId.of("8765")

        );
        when(repository.getEventsBy((any()))).thenReturn(eventsList());

        var response = UseCaseHandler.getInstance().setIdentifyExecutor("xxxx")
                .syncExecutor(modificarPrecioConsumoUseCase, new RequestCommand<>(command))
                .orElseThrow();
        var events = response.getDomainEvents();
        PrecioConsumoModificado precioConsumoModificado = (PrecioConsumoModificado) events.get(0);
        Assertions.assertEquals(5247.0,precioConsumoModificado.getPrecio().value());
    }
    private List<DomainEvent> eventsList(){
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