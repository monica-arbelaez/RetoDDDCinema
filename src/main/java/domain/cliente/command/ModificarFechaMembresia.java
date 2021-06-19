package domain.cliente.command;

import co.com.sofka.domain.generic.Command;
import domain.cliente.values.ClienteId;
import domain.cliente.values.FechaDeVencimiento;
import domain.cliente.values.MembresiaId;

public class ModificarFechaMembresia implements Command {
    private final MembresiaId membresiaId;
    private  final FechaDeVencimiento fechaDeVencimiento;
    private final ClienteId clienteId;

    public ModificarFechaMembresia(MembresiaId membresiaId, FechaDeVencimiento fechaDeVencimiento, ClienteId clienteId) {
        this.membresiaId = membresiaId;
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.clienteId = clienteId;
    }

    public MembresiaId getMembresiaId() {
        return membresiaId;
    }

    public FechaDeVencimiento getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }
}
