package domain.cliente.command;

import co.com.sofka.domain.generic.Command;
import domain.cliente.values.ConsumoId;
import domain.cliente.values.Descuento;

public class ModificarDescuento implements Command {
    private final ConsumoId consumoId;
    private final Descuento descuento;

    public ModificarDescuento(ConsumoId consumoId, Descuento descuento) {
        this.consumoId = consumoId;
        this.descuento = descuento;
    }

    public ConsumoId getConsumoId() {
        return consumoId;
    }

    public Descuento getDescuento() {
        return descuento;
    }
}
