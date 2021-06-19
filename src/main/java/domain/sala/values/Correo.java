package domain.sala.values;

import co.com.sofka.domain.generic.ValueObject;
import com.sun.nio.sctp.IllegalReceiveException;

import java.util.Objects;

public class Correo implements ValueObject<String> {
    private final String value;

    public Correo(String value){
        Objects.requireNonNull(value, "El correo es obligatorio");
        if(value.isBlank()){
            throw new IllegalReceiveException("el campo  no puede estar vacio");
        }
        if(!value.matches("^([0-9a-zA-Z]+[-._+&])*[0-9a-zA-Z]+@([-0-9a-zA-Z]+[.])+[a-zA-Z]{2,6}$")){
            throw new IllegalReceiveException("El cedula no puede tener caracteres");
        }
        this.value=value;
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Correo correo = (Correo) o;
        return Objects.equals(value, correo.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
