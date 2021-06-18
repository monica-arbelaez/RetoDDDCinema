package domain.boleto.command;

import co.com.sofka.domain.generic.Command;
import domain.boleto.values.BoletoId;
import domain.genericvalues.Precio;

public class ModificarPrecio implements Command {
    private final BoletoId boletoId;
    private final Precio precio;

    public ModificarPrecio(BoletoId boletoId, Precio precio) {
        this.boletoId = boletoId;
        this.precio = precio;
    }

    public BoletoId getBoletoId() {
        return boletoId;
    }

    public Precio getPrecio() {
        return precio;
    }
}
