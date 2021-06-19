package usecase.Cliente;

import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.domain.generic.DomainEvent;
import domain.boleto.values.BoletoId;
import domain.cliente.command.ModificarNombre;
import domain.cliente.entity.Consumo;
import domain.cliente.entity.Membresia;
import domain.cliente.events.ClienteGenerado;
import domain.cliente.events.NombreModificado;
import domain.cliente.values.*;
import domain.genericvalues.Nombre;
import domain.genericvalues.Precio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;

class ModificarNombreUseCaseTest {
    private ModificarNombreUseCase modificarNombreUseCase;
    private DomainEventRepository repository;

    @BeforeEach
    public void setuo(){
        modificarNombreUseCase = new ModificarNombreUseCase();
        repository = mock(DomainEventRepository.class);
        modificarNombreUseCase.addRepository(repository);
    }
    @Test
    public void modificarNombreHappyPath(){
        var command = new ModificarNombre(
                ClienteId.of("4567"),
                new Nombre("Ana")
        );
        when(repository.getEventsBy((any()))).thenReturn(eventsList());
    }
    private List<DomainEvent>eventsList(){
        return List.of(
                new ClienteGenerado(ClienteId.of("5678"),
                        new Nombre("Jhon"),
                        new Membresia(MembresiaId.of("123"),
                                new TipoMembresia("Platino"),
                                new FechaDeVencimiento(1,5,2022),ClienteId.of("8765")),
                        BoletoId.of("345"),
                        new Consumo(ClienteId.of("6453"),ConsumoId.of("678"),new Precio(5256.0),new Descuento(2560.0))

                )
        );
    }

}