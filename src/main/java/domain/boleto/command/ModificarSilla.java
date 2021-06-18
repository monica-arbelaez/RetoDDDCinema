package domain.boleto.command;

import co.com.sofka.domain.generic.Command;
import domain.boleto.values.BoletoId;
import domain.boleto.values.Silla;

public class ModificarSilla implements Command {
    private final BoletoId boletoId;
    private final Silla silla;

    public ModificarSilla(BoletoId boletoId, Silla silla) {
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
