package domain.boleto.entity;

import co.com.sofka.domain.generic.EventChange;
import domain.boleto.events.*;

public class BoletoChange extends EventChange {

    public BoletoChange(Boleto boleto){
        apply((BoletoGenerado event)->{
            boleto.precio = event.getPrecio();
            boleto.clienteId = event.getClienteId();
            boleto.salaId = event.getSalaId();
            boleto.silla = event.getSilla();
            boleto.fechaHoraDeFuncionId = event.getFechaHoraDeFuncionId();

        });
        apply((BoletoModificado event)->{
            boleto.modificarBoleto(event.getBoletoId(),event.getClienteId(),event.getSalaId(),event.getFechaHoraDeFuncionId(), event.getPrecio(),event.getSilla());

        });
        apply((PrecioModificado event)->{
            boleto.modificarPrecio(event.getBoletoId(),event.getPrecio());
        });
        apply((SillaModificada event)->{
            boleto.modificarSilla(event.getBoletoId(),event.getSilla());
        });



    }
}
