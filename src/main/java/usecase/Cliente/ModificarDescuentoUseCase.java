package usecase.Cliente;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.cliente.command.ModificarDescuento;
import domain.cliente.entity.Cliente;

public class ModificarDescuentoUseCase extends UseCase<RequestCommand <ModificarDescuento>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ModificarDescuento> modificarDescuentoRequestCommand) {
        var command = modificarDescuentoRequestCommand.getCommand();
        var cliente = Cliente.From(command.getClienteId(),retrieveEvents(command.getClienteId().value()));

        cliente.modificarDescuento(command.getClienteId(),command.getConsumoId(),command.getDescuento());
        emit().onResponse(new ResponseEvents(cliente.getUncommittedChanges()));

    }
}
