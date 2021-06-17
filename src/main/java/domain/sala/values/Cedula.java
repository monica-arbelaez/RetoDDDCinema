package domain.sala.values;

import co.com.sofka.domain.generic.ValueObject;
import com.sun.nio.sctp.IllegalReceiveException;

import java.util.Objects;

public class Cedula implements ValueObject<String> {

    private final String value;

    public Cedula(String value){
        Objects.requireNonNull(value,  "La cedula es obligatoria");
        if(value.isBlank()){
            throw new IllegalReceiveException("el campo de la cedula no puede estar vacio");
        }
        if(value.matches("/[VE]-[0-9]{1,8}/")){
            throw new IllegalReceiveException("El cedula no puede tener caracteres");
        }
        this.value = value;

    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cedula cedula = (Cedula) o;
        return Objects.equals(value, cedula.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
