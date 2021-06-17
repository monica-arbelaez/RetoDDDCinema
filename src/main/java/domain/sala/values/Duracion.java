package domain.sala.values;

import co.com.sofka.domain.generic.ValueObject;
import com.sun.nio.sctp.IllegalReceiveException;

import java.util.Objects;

public class Duracion  implements ValueObject<String>{

    private  final String value;

    public Duracion(String value){
        Objects.requireNonNull(value, "Debe de tener la duracion");
        if(value.isBlank()){
            throw new IllegalReceiveException("la duracion es reuqerida");
        }
        this.value= value;
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Duracion duracion = (Duracion) o;
        return Objects.equals(value, duracion.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
