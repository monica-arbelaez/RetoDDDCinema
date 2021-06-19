package usecase.Sala;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.sala.command.GenerarSala;
import domain.sala.entity.Sala;

public class GenerarSalaUseCase extends UseCase<RequestCommand<GenerarSala>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<GenerarSala> generarSalaRequestCommand) {
        var command = generarSalaRequestCommand.getCommand();
        var sala = new Sala(command.getSalaId(), command.getNombre(), command.getSillas(), command.getFechaHoraDeFuncionIds(), command.getPelicula(), command.getEmpleado());
        emit().onResponse(new ResponseEvents(sala.getUncommittedChanges()));
    }
}
