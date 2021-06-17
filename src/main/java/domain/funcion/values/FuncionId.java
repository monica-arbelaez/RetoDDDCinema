package domain.funcion.values;


import co.com.sofka.domain.generic.Identity;

public class FuncionId extends Identity {
    private FuncionId(String uid) {
        super(uid);
    }

    public FuncionId(){}

    public static FuncionId of(String uid){
        return new FuncionId(uid);
    }
}
