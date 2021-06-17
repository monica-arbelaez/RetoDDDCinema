package domain.funcion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class HoraDeFuncion implements ValueObject {

    private final String date;

    public HoraDeFuncion(){
        this.date = Objects.requireNonNull(dateandhours());
    }

    public String dateandhours() {
        Date dateandhours = new Date();
        SimpleDateFormat Format = new SimpleDateFormat("YYYY/MM/DD '-' HH:mm:ss");
        return Format.format(dateandhours);
    }

    public String value(){
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HoraDeFuncion that = (HoraDeFuncion) o;
        return Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date);
    }
}
