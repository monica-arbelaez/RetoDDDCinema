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
        if(value.length() < 3){
            throw new IllegalReceiveException("El nombre debe de tener menos de 4 caracteres");
        }
        if(value.length() > 200){
            throw new IllegalReceiveException("El nombre debe de tener más de 200 caracteres");
        }
        if(value.matches("^[Aa-z\\s]+$")){
            throw new IllegalReceiveException("El nombre no puede tener caracteres ");
        }
        this.value = value;

    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nombre nombre = (Nombre) o;
        return Objects.equals(value, nombre.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
