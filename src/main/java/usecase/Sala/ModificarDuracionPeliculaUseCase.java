package usecase.Sala;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.sala.command.ModificarDuracionPelicula;
import domain.sala.entity.Sala;

public class ModificarDuracionPeliculaUseCase extends UseCase<RequestCommand <ModificarDuracionPelicula>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ModificarDuracionPelicula> modificarDuracionPeliculaRequestCommand) {
       var command = modificarDuracionPeliculaRequestCommand.getCommand();
       var sala = Sala.from(command.getSalaId(),retrieveEvents(command.getSalaId().value()));

       sala.modificarDuracionPelicula(command.getPeliculaId(),command.getDuracion(),command.getSalaId());
        emit().onResponse(new ResponseEvents(sala.getUncommittedChanges()));
    }
}
