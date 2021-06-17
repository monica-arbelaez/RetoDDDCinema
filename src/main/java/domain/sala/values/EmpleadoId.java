package domain.sala.values;

import co.com.sofka.domain.generic.Identity;

public class EmpleadoId extends Identity {
    private EmpleadoId(String id) {
        super(id);
    }

    public EmpleadoId(){}

    public static EmpleadoId of(String id){
        return new EmpleadoId(id);
    }
}
