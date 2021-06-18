package domain.boleto.command;

import co.com.sofka.domain.generic.Command;
import domain.cliente.values.ClienteId;
import domain.genericvalues.Precio;
import domain.sala.values.FechaHoraDeFuncionId;
import domain.sala.values.SalaId;
import domain.sala.values.Silla;

public class ModificarBoleto implements Command {
    private final ClienteId clienteId;
    private final SalaId salaId;
    private final FechaHoraDeFuncionId fechaHoraDeFuncionId;
    private final Precio precio;
    private final Silla silla;

    public ModificarBoleto(ClienteId clienteId, SalaId salaId, FechaHoraDeFuncionId fechaHoraDeFuncionId, Precio precio, Silla silla) {
        this.clienteId = clienteId;
        this.salaId = salaId;
        this.fechaHoraDeFuncionId = fechaHoraDeFuncionId;
        this.precio = precio;
        this.silla = silla;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public SalaId getSalaId() {
        return salaId;
    }

    public FechaHoraDeFuncionId getFechaHoraDeFuncionId() {
        return fechaHoraDeFuncionId;
    }

    public Precio getPrecio() {
        return precio;
    }

    public Silla getSilla() {
        return silla;
    }
}
