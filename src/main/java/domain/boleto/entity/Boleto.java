package domain.boleto.entity;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import domain.boleto.events.*;
import domain.boleto.values.BoletoId;
import domain.boleto.values.FechaFuncion;
import domain.boleto.values.Silla;
import domain.cliente.values.ClienteId;
import domain.genericvalues.Precio;
import domain.sala.values.FechaHoraDeFuncionId;
import domain.sala.values.SalaId;

import java.util.List;
import java.util.Objects;

public class Boleto extends AggregateEvent<BoletoId> {
    protected ClienteId clienteId;
    protected SalaId salaId;
    protected FechaHoraDeFuncionId fechaHoraDeFuncionId;
    protected Precio precio;
    protected Silla silla;

    public Boleto(BoletoId entityId, ClienteId clienteId, SalaId salaId, FechaHoraDeFuncionId fechaHoraDeFuncionId, Precio precio, Silla silla) {
        super(entityId);
        Objects.requireNonNull(clienteId);
        Objects.requireNonNull(salaId);
        Objects.requireNonNull(fechaHoraDeFuncionId);
        Objects.requireNonNull(precio);
        Objects.requireNonNull(silla);

        appendChange(new BoletoGenerado(clienteId, salaId, fechaHoraDeFuncionId, precio, silla));
    }

   private Boleto(BoletoId entityId) {
        super(entityId);
        // esta pendiente del evento para cambiar el estado
        subscribe((new BoletoChange(this)));
    }

    public static Boleto From(BoletoId boletoId, List<DomainEvent> events) {
        var boleto = new Boleto(boletoId);
        events.forEach(boleto::applyEvent);
        return boleto;
    }

    public void modificarBoleto(BoletoId entityId, ClienteId clienteId, SalaId salaId, FechaHoraDeFuncionId fechaHoraDeFuncionId, Precio precio, Silla silla){
        Objects.requireNonNull(clienteId);
        Objects.requireNonNull(salaId);
        Objects.requireNonNull(fechaHoraDeFuncionId);
        Objects.requireNonNull(precio);
        Objects.requireNonNull(silla);
        appendChange(new BoletoModificado(clienteId, salaId, fechaHoraDeFuncionId, precio, silla));

    }
    public void modificarPrecio(BoletoId entityId, Precio precio){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(precio);
        appendChange(new PrecioModificado(entityId, precio));
    }

    public void modificarSilla(BoletoId entityId, Silla silla){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(silla);
        appendChange(new SillaModificada(entityId, silla));
    }
    public  void modificarFechaFuncion(BoletoId entityId, FechaFuncion fechaFuncion){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(fechaFuncion);
        appendChange(new FechaDeFuncionModificada(entityId, fechaFuncion));
    }



}
