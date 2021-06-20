package usecase.Sala;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.sala.command.ModificarNombreEmpleado;
import domain.sala.entity.Sala;

public class ModificarNombreEmpleadoUseCase extends UseCase<RequestCommand <ModificarNombreEmpleado>, ResponseEvents >{
    @Override
    public void executeUseCase(RequestCommand<ModificarNombreEmpleado> modificarNombreEmpleadoRequestCommand) {
        var command = modificarNombreEmpleadoRequestCommand.getCommand();
        var sala = Sala.from(command.getSalaId(),retrieveEvents(command.getSalaId().value()));

        sala.ModificarNombreEmplado(command.getEmpleadoId(), command.getNombre(), command.getSalaId());
        emit().onResponse(new ResponseEvents(sala.getUncommittedChanges()));
    }
}
