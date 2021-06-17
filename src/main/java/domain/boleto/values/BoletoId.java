package domain.boleto.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.generic.ValueObject;
import com.sun.nio.sctp.IllegalReceiveException;

import java.util.Objects;

public class BoletoId extends Identity {
    private BoletoId(String id) {
        super(id);
    }

    public BoletoId() {
    }

    public static BoletoId of(String id){
        return new BoletoId(id);
    }

    public static class Silla implements ValueObject<String> {
        private final String value;

        public Silla(String value){
            Objects.requireNonNull(value,  "La cedula es obligatoria");
            if(value.isBlank()){
                throw new IllegalReceiveException("el campo de la silla no puede estar vacio");
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
}
