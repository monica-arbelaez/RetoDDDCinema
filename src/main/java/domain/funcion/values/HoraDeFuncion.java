package domain.funcion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class HoraDeFuncion implements ValueObject<String> {

    private final String value;

    public HoraDeFuncion(String value){

        this.value = Objects.requireNonNull(dateandhours());
    }

    public String dateandhours() {
        Date dateandhours = new Date();
        SimpleDateFormat Format = new SimpleDateFormat("YYYY/MM/DD '-' HH:mm:ss");
        return Format.format(dateandhours);
    }

    public String value(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HoraDeFuncion that = (HoraDeFuncion) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
