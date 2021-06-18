package domain.sala.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.sala.values.FechaHoraDeFuncionId;
import domain.sala.values.FechaHoraFuncionPelicula;

public class FechaDeFuncionAgregada extends DomainEvent {
    private final FechaHoraDeFuncionId fechaHoraDeFuncionId;
    private final FechaHoraFuncionPelicula fechaHoraFuncionPelicula;

    public FechaDeFuncionAgregada(FechaHoraDeFuncionId fechaHoraDeFuncionId, FechaHoraFuncionPelicula fechaHoraFuncionPelicula) {
        super("cine.sala.fechadefuncionagregada");
        this.fechaHoraDeFuncionId = fechaHoraDeFuncionId;
        this.fechaHoraFuncionPelicula = fechaHoraFuncionPelicula;
    }

    public FechaHoraDeFuncionId getFechaHoraDeFuncionId() {
        return fechaHoraDeFuncionId;
    }

    public FechaHoraFuncionPelicula getFechaHoraFuncionPelicula() {
        return fechaHoraFuncionPelicula;
    }
}
