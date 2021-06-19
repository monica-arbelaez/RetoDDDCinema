package domain.sala.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;
import java.util.Set;

public class Silla implements ValueObject<String > {
    private  final String value;

    public Silla( String value){
        this.value = value;
        Objects.requireNonNull(value,  "Debes de tener una silla");

    }
    public String value() {
        return value;
    }

    public String getValue() {
        return value;
    }
}
