package domain.cliente.command;

import co.com.sofka.domain.generic.Command;
import domain.cliente.values.FechaDeVencimiento;
import domain.cliente.values.MembresiaId;

public class ModificarFechaMembresia implements Command {
    private final MembresiaId membresiaId;
    private  final FechaDeVencimiento fechaDeVencimiento;

    public ModificarFechaMembresia(MembresiaId membresiaId, FechaDeVencimiento fechaDeVencimiento) {
        this.membresiaId = membresiaId;
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public MembresiaId getMembresiaId() {
        return membresiaId;
    }

    public FechaDeVencimiento getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }
}
