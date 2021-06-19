package domain.cliente.entity;

import co.com.sofka.domain.generic.EventChange;
import domain.cliente.events.*;

public class ClienteChange extends EventChange {

    public ClienteChange(Cliente cliente) {
        apply((ClienteGenerado event)->{
           cliente.nombre = event.getNombre();
           cliente.membresia = event.getMembresia();
           cliente.boletoId = event.getBoletoId();
           cliente.consumo = event.getConsumo();
        });
        apply((DescuentoDelConsumoModificado event)->{
            cliente.modificarDescuento(event.getClienteId(),event.getConsumoId(),event.getDescuento());

        });
        apply((FechaMembresiaModificada event)->{
           cliente.modificarFechaMembresia(event.getMembresiaId(),event.getFechaDeVencimiento());
        });
        apply((MembresiaGenerada event)->{
            cliente.generarMembresia(event.getMembresiaId(),event.getTipoMembresia(),event.getFechaDeVencimiento());
        });
        apply((NombreModificado event)->{
           cliente.modificarNombre(event.getClienteId(),event.getNombre());
        });
        apply((PrecioConsumoModificado event)->{
            cliente.modificarPrecioConsumo(event.getClienteId(),event.getConsumoId(), event.getPrecio());
        });
        apply((TipoMembresiaModificada event)->{
            cliente.modificarTipoMembresia(event.getMembresiaId(),event.getTipoMembresia(),event.getFechaDeVencimiento());
        });
    }
}
