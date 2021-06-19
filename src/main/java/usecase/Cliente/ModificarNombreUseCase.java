package usecase.Cliente;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.cliente.command.ModificarNombre;
import domain.cliente.entity.Cliente;

public class ModificarNombreUseCase extends UseCase<RequestCommand  <ModificarNombre>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ModificarNombre> modificarNombreRequestCommand) {
        var command = modificarNombreRequestCommand.getCommand();
        var cliente = Cliente.From(command.getClienteId(),retrieveEvents(command.getClienteId().value()));

        cliente.modificarNombre(command.getClienteId(),command.getNombre());
        emit().onResponse(new ResponseEvents(cliente.getUncommittedChanges()));
    }
}
