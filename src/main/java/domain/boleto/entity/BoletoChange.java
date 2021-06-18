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
            boleto.precio = event.getPrecio();
            boleto.clienteId = event.getClienteId();
            boleto.salaId = event.getSalaId();
            boleto.silla = event.getSilla();
            boleto.fechaHoraDeFuncionId = event.getFechaHoraDeFuncionId();
        });
        apply((PrecioModificado event)->{
            boleto.precio = event.getPrecio();
        });
        apply((SillaModificada event)->{
            boleto.silla = event.getSilla();
        });



    }
}