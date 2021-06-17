package domain.funcion.values;

import com.sun.nio.sctp.IllegalReceiveException;

import java.awt.*;
import java.util.Objects;

public class Silla {
    private  final List value;

    public Silla( List value){
        this.value = value;
        Objects.requireNonNull(value,  "Debes de poder una silla");

    }
    public List value() {
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
