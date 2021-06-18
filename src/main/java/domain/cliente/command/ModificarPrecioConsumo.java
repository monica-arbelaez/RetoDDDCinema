package domain.cliente.command;

import co.com.sofka.domain.generic.Command;
import domain.cliente.values.ConsumoId;
import domain.genericvalues.Precio;

public class ModificarPrecioConsumo implements Command {
    private final ConsumoId consumoId;
    private final Precio precio;

    public ModificarPrecioConsumo(ConsumoId consumoId, Precio precio) {
        this.consumoId = consumoId;
        this.precio = precio;
    }

    public ConsumoId getConsumoId() {
        return consumoId;
    }

    public Precio getPrecio() {
        return precio;
    }
}
