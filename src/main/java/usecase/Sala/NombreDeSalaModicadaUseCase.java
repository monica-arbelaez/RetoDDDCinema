package usecase.Sala;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.sala.command.ModificarNombreDeSala;
import domain.sala.entity.Sala;

public class NombreDeSalaModicadaUseCase extends UseCase <RequestCommand <ModificarNombreDeSala>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ModificarNombreDeSala> modificarNombreDeSalaRequestCommand) {
        var command = modificarNombreDeSalaRequestCommand.getCommand();
        var sala = Sala.from(command.getSalaId(), retrieveEvents(command.getSalaId().value()));

        sala.ModificarNombreDeSala(command.getSalaId(),command.getNombre());
        emit().onResponse(new ResponseEvents(sala.getUncommittedChanges()));
    }
}
