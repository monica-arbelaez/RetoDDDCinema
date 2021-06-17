package domain.boleto.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.boleto.values.BoletoId;
import domain.boleto.values.FechaFuncion;

public class FechaDeFuncionModificada extends DomainEvent {
    private final BoletoId boletoId;
    private final FechaFuncion fechaFuncion;

    public FechaDeFuncionModificada( BoletoId boletoId, FechaFuncion fechaFuncion) {
        super("cine.boleto.fechafuncionmodificada");
        this.boletoId = boletoId;
        this.fechaFuncion = fechaFuncion;
    }

    public BoletoId getBoletoId() {
        return boletoId;
    }

    public FechaFuncion getFechaFuncion() {
        return fechaFuncion;
    }
}
