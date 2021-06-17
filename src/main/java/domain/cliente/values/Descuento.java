package domain.cliente.values;

import com.sun.nio.sctp.IllegalReceiveException;

import java.util.Objects;

public class Descuento {
    private  final String value;

    public Descuento( String value) {
        this.value = value;
        Objects.requireNonNull(value, "Debe de poner un valor de descuento");
        if (value.isBlank()) {
            throw new IllegalReceiveException("El descuento es requerido");
        }
    }

}
