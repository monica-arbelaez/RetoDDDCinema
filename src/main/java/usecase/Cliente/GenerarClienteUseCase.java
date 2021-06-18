package usecase.Cliente;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.cliente.command.GenerarCliente;
import domain.cliente.entity.Cliente;


public class GenerarClienteUseCase  extends UseCase<RequestCommand<GenerarCliente>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<GenerarCliente> generarClienteRequestCommand) {
        var command = generarClienteRequestCommand.getCommand();
        var cliente = new Cliente(command.getClienteId(), command.getNombre(), command.getMembresia(),command.getBoletoId(),command.getConsumo());
        emit().onResponse(new ResponseEvents(cliente.getUncommittedChanges()));
    }


}
