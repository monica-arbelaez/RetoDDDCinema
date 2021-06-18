package domain.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Descuento implements ValueObject<Double> {

    private final Double value;

    public Descuento(Double value){
        Objects.requireNonNull(value);
        if (value < 1 ) {
            throw new IllegalArgumentException("El descuento no puede ser igual o menor a cero");
        }
        this.value = value;

    }

    @Override
    public Double value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Descuento descuento = (Descuento) o;
        return Objects.equals(value, descuento.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
