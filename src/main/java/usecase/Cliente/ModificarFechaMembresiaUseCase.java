package usecase.Cliente;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.cliente.command.ModificarFechaMembresia;
import domain.cliente.entity.Cliente;

public class ModificarFechaMembresiaUseCase extends UseCase<RequestCommand <ModificarFechaMembresia>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ModificarFechaMembresia> modificarFechaMembresiaRequestCommand) {
       var command =modificarFechaMembresiaRequestCommand.getCommand();
       var cliente = Cliente.From(command.getClienteId(),retrieveEvents(command.getClienteId().value()));

       cliente.modificarFechaMembresia(command.getClienteId(),command.getMembresiaId(),command.getFechaDeVencimiento());
       emit().onResponse(new ResponseEvents(cliente.getUncommittedChanges()));
    }
}
