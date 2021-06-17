package domain.genericvalues;

import co.com.sofka.domain.generic.ValueObject;
import com.sun.nio.sctp.IllegalReceiveException;

import java.util.Objects;

public class Nombre implements ValueObject<String> {

    private final String value;

    public Nombre(String value){
        Objects.requireNonNull(value,  "El nombre es obligatorio");
        if(value.isBlank()){
            throw new IllegalReceiveException("El nombre no puede estar vacio");
        }
        if(value.length() < 4){
            throw new IllegalReceiveException("El nombre debe de tener mas de 4 caracteres");
        }
        if(value.length() > 200){
            throw new IllegalReceiveException("El nombre debe de tener menos de 200 caracteres");
        }
        if(value.matches("^[Aa-z\\s]+$")){
            throw new IllegalReceiveException("El nombre no puede tener caracteres ");
        }
        this.value = value;

    }

    @Override
    public String value() {
        return null;
    }

}
