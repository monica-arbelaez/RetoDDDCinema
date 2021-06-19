package usecase.Cliente;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.cliente.entity.Cliente;

public class ModificarPrecioConsumoUseCase extends UseCase<RequestCommand <domain.cliente.command.ModificarPrecioConsumo>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<domain.cliente.command.ModificarPrecioConsumo> modificarPrecioConsumoRequestCommand) {
        var command = modificarPrecioConsumoRequestCommand.getCommand();
        var cliente = Cliente.From(command.getClienteId(),retrieveEvents(command.getClienteId().value()));

        cliente.modificarPrecioConsumo(command.getClienteId(), command.getConsumoId(),command.getPrecio());
        emit().onResponse(new ResponseEvents(cliente.getUncommittedChanges()));
    }
}
