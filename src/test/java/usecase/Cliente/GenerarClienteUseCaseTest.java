package usecase.Cliente;


import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import domain.boleto.values.BoletoId;
import domain.cliente.command.GenerarCliente;
import domain.cliente.entity.Consumo;
import domain.cliente.entity.Membresia;
import domain.cliente.events.ClienteGenerado;
import domain.cliente.values.*;
import domain.genericvalues.Nombre;
import domain.genericvalues.Precio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GenerarClienteUseCaseTest {

    private GenerarClienteUseCase generarClienteUseCase;

    @BeforeEach
    public void setup(){
        generarClienteUseCase=new GenerarClienteUseCase();
    }
    @Test
    public void setGenerarClienteHAppyPath(){
        var command = new GenerarCliente(
                ClienteId.of("1234"),
                new Nombre("Monica"),
                new Membresia(MembresiaId.of("3456"),new TipoMembresia("Premium"), new FechaDeVencimiento(5,9,2022)),
                new BoletoId(),
                new Consumo(ConsumoId.of("123"),new Precio(12345.0),new Descuento(123.0))
        );
        var respose = UseCaseHandler.getInstance().syncExecutor(
                generarClienteUseCase, new RequestCommand<>(command)
        ).orElseThrow();
        var events = respose.getDomainEvents();

        ClienteGenerado clienteGenerado =(ClienteGenerado) events.get(0);
        Assertions.assertEquals("Monica", clienteGenerado.getNombre().value());
        Assertions.assertEquals("Premium",clienteGenerado.getMembresia().getTipoMembresia().value());
        Assertions.assertEquals(("05-09-2022"),clienteGenerado.getMembresia().getFechaDeVencimiento().value());
        Assertions.assertEquals(12345.0,clienteGenerado.getConsumo().getPrecio().value());
        Assertions.assertEquals("123",clienteGenerado.getConsumo().identity().value());


    }
}
