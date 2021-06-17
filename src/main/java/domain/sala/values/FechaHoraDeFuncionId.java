package domain.sala.values;

import co.com.sofka.domain.generic.Identity;

public class FechaHoraDeFuncionId extends Identity {
    private FechaHoraDeFuncionId(String id) {
        super(id);
    }

    public FechaHoraDeFuncionId(){}

    public static FechaHoraDeFuncionId of(String id){
        return new FechaHoraDeFuncionId(id);
    }
}
