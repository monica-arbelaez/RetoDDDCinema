package usecase.Sala;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.sala.command.ModificarCedulaEmpleado;
import domain.sala.entity.Sala;

public class ModificarCedulaUseCase extends UseCase<RequestCommand <ModificarCedulaEmpleado>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ModificarCedulaEmpleado> modificarCedulaEmpleadoRequestCommand) {
        var command  = modificarCedulaEmpleadoRequestCommand.getCommand();
        var sala = Sala.from(command.getSalaId(),retrieveEvents(command.getSalaId().value()));

        sala.modificarCedulaEmpleado(command.getEmpleadoId(),command.getCedula(),command.getSalaId());
        emit().onResponse(new ResponseEvents(sala.getUncommittedChanges()));
    }
}
