package domain.cliente.command;

import co.com.sofka.domain.generic.Command;
import domain.cliente.values.FechaDeVencimiento;
import domain.cliente.values.MembresiaId;
import domain.cliente.values.TipoMembresia;

public class ModificarTipoMembresia implements Command {
    private final MembresiaId membresiaId;
    private final TipoMembresia tipoMembresia;
    private final FechaDeVencimiento fechaDeVencimiento;

    public ModificarTipoMembresia(MembresiaId membresiaId, TipoMembresia tipoMembresia, FechaDeVencimiento fechaDeVencimiento) {
        this.membresiaId = membresiaId;
        this.tipoMembresia = tipoMembresia;
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public MembresiaId getMembresiaId() {
        return membresiaId;
    }

    public TipoMembresia getTipoMembresia() {
        return tipoMembresia;
    }

    public FechaDeVencimiento getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }
}
