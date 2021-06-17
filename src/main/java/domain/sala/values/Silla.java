package domain.sala.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;
import java.util.Set;

public class Silla implements ValueObject<Set> {
    private  final Set value;

    public Silla( Set value){
        this.value = value;
        Objects.requireNonNull(value,  "Debes de tener una silla");

    }
    public Set value() {
        return value;
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
