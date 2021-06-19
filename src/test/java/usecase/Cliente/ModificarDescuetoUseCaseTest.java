package usecase.Cliente;


import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import domain.boleto.values.BoletoId;
import domain.cliente.command.ModificarDescuento;
import domain.cliente.entity.Consumo;
import domain.cliente.entity.Membresia;
import domain.cliente.events.ClienteGenerado;
import domain.cliente.events.DescuentoDelConsumoModificado;
import domain.cliente.values.*;
import domain.genericvalues.Nombre;
import domain.genericvalues.Precio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.any;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ModificarDescuetoUseCaseTest {
    private ModificarDescuentoUseCase modificarDescuentoUseCase;
    private DomainEventRepository repository;
    @BeforeEach
    public void setup(){
        modificarDescuentoUseCase = new ModificarDescuentoUseCase();
        repository = mock(DomainEventRepository.class);
        modificarDescuentoUseCase.addRepository(repository);
    }

    @Test
    public void modificarDescuentoHappyPath(){
        var command = new ModificarDescuento(
                ConsumoId.of("12345"),
                new Descuento(1000.0),
                ClienteId.of("6778")
        );
        when(repository.getEventsBy(any())).thenReturn(eventsList());
        var response = UseCaseHandler.getInstance().setIdentifyExecutor("xxxx")
                .syncExecutor(modificarDescuentoUseCase, new RequestCommand<>(command))
                .orElseThrow();

        var events= response.getDomainEvents();
        DescuentoDelConsumoModificado descuentoDelConsumoModificado = (DescuentoDelConsumoModificado) events.get(0);
        Assertions.assertEquals(1000.0,descuentoDelConsumoModificado.getDescuento().value());
    }
    private List<DomainEvent>eventsList(){
        return List.of(
                new ClienteGenerado(ClienteId.of("5678"),
                        new Nombre("Jhon"),
                        new Membresia(MembresiaId.of("123"),
                                new TipoMembresia("Platino"),
                                new FechaDeVencimiento(1,5,2022),ClienteId.of("8765")),
                        BoletoId.of("345"),
                        new Consumo(ClienteId.of("765"), ConsumoId.of("678"),new Precio(5256.0),new Descuento(2560.0))

                        )
        );
    }

}
