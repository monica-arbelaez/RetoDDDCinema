package domain.funcion.values;

import co.com.sofka.domain.generic.Identity;

public class EmpleadoId extends Identity {
    private EmpleadoId(String uid) {
        super(uid);
    }

    public EmpleadoId(){}

    public static EmpleadoId of(String uid){
        return new EmpleadoId(uid);
    }
}
