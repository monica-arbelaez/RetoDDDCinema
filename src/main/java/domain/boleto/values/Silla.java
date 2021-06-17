package domain.boleto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Silla implements ValueObject<String> {

    private final String value;

    public Silla(String value){
        Objects.requireNonNull(value, "Debe de tener una membresia");
        if(value.isBlank()){
            throw new IllegalArgumentException("tipo de membresia no puede estar vacia");
        }
        this.value = value;
    }

    @Override
    public String value() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Silla silla = (Silla) o;
        return Objects.equals(value, silla.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
