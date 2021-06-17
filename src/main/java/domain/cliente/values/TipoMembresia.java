package domain.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoMembresia implements ValueObject<String> {
    private final String value;

    public TipoMembresia(String value){
        Objects.requireNonNull(value, "El correo no puede estar vacio");
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
        TipoMembresia tipo = (TipoMembresia) o;
        return Objects.equals(value, tipo.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
