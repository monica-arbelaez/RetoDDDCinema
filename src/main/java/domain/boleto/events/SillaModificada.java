package domain.boleto.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.boleto.values.BoletoId;
import domain.boleto.values.Silla;

public class SillaModificada  extends DomainEvent {
    private BoletoId boletoId;
    private Silla silla;

    public SillaModificada(BoletoId boletoId, Silla silla) {
        super("cine.boleto.sillamodificado");
        this.boletoId = boletoId;
        this.silla = silla;
    }

    public BoletoId getBoletoId() {
        return boletoId;
    }

    public Silla getSilla() {
        return silla;
    }
}
