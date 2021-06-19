package domain.cliente.entity;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import domain.boleto.values.BoletoId;
import domain.cliente.events.*;
import domain.cliente.values.*;
import domain.genericvalues.Nombre;
import domain.genericvalues.Precio;

import java.util.List;
import java.util.Objects;


public class Cliente extends AggregateEvent<ClienteId> {
    protected Nombre nombre;
    protected Membresia membresia;
    protected BoletoId boletoId;
    protected Consumo consumo;

    public Cliente(ClienteId entityId, Nombre nombre, Membresia membresia, BoletoId boletoId, Consumo consumo) {
        super(entityId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(membresia);
        Objects.requireNonNull(boletoId);
       appendChange(new ClienteGenerado(entityId,nombre, membresia, boletoId, consumo));

    }
    private Cliente(ClienteId entityId){
        super(entityId);
        subscribe((new ClienteChange(this)));
    }
    public static Cliente From(ClienteId clienteId, List<DomainEvent> events){
        var cliente = new Cliente(clienteId);
        events.forEach(cliente::applyEvent);
        return cliente;
    }
    public void modificarDescuento(ClienteId clienteId, ConsumoId consumoId, Descuento descuento){
        Objects.requireNonNull(consumoId);
        Objects.requireNonNull(descuento);
        appendChange(new DescuentoDelConsumoModificado(consumoId, descuento, clienteId));
    }
    public void modificarFechaMembresia(ClienteId clienteId, MembresiaId membresiaId, FechaDeVencimiento fechaDeVencimiento){
        Objects.requireNonNull(membresiaId);
        Objects.requireNonNull(fechaDeVencimiento);
        Objects.requireNonNull(clienteId);
        appendChange(new FechaMembresiaModificada(membresiaId, fechaDeVencimiento, clienteId));
    }
    public  void generarMembresia( MembresiaId membresiaId, TipoMembresia tipoMembresia, FechaDeVencimiento fechaDeVencimiento ){
        Objects.requireNonNull(membresiaId);
        Objects.requireNonNull(tipoMembresia);
        Objects.requireNonNull(fechaDeVencimiento);
        appendChange(new MembresiaGenerada(membresiaId,tipoMembresia,fechaDeVencimiento));
    }
    public void modificarNombre(ClienteId clienteId, Nombre nombre){
        Objects.requireNonNull(clienteId);
        Objects.requireNonNull(nombre);
        appendChange(new NombreModificado(nombre, clienteId));
    }
    public void modificarPrecioConsumo(ClienteId clienteId, ConsumoId consumoId,Precio precio){
        Objects.requireNonNull(consumoId);
        Objects.requireNonNull(precio);
        Objects.requireNonNull(clienteId);
        appendChange(new PrecioConsumoModificado(clienteId, consumoId,precio));
    }
    public void modificarTipoMembresia(MembresiaId membresiaId, TipoMembresia tipoMembresia, FechaDeVencimiento fechaDeVencimiento ){
        Objects.requireNonNull(membresiaId);
        Objects.requireNonNull(tipoMembresia);
        Objects.requireNonNull(fechaDeVencimiento);
        appendChange(new TipoMembresiaModificada(membresiaId,tipoMembresia,fechaDeVencimiento));
    }

    public Nombre nombre() {
        return nombre;
    }

    public Membresia membresia() {
        return membresia;
    }

    public BoletoId boletoId() {
        return boletoId;
    }

    public Consumo consumo() {
        return consumo;
    }


    public void modificarFechaMembresia(MembresiaId membresiaId, FechaDeVencimiento fechaDeVencimiento) {
    }
}
