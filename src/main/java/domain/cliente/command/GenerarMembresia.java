package domain.cliente.command;

import co.com.sofka.domain.generic.Command;
import domain.cliente.values.FechaDeVencimiento;
import domain.cliente.values.MembresiaId;
import domain.cliente.values.TipoMembresia;

public class GenerarMembresia implements Command {
    private final MembresiaId membresiaId;
    private final FechaDeVencimiento fechaDeVencimiento;
    private final TipoMembresia tipoMembresia;

    public GenerarMembresia(MembresiaId membresiaId, FechaDeVencimiento fechaDeVencimiento, TipoMembresia tipoMembresia) {
        this.membresiaId = membresiaId;
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.tipoMembresia = tipoMembresia;
    }

    public MembresiaId getMembresiaId() {
        return membresiaId;
    }

    public FechaDeVencimiento getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public TipoMembresia getTipoMembresia() {
        return tipoMembresia;
    }
}
