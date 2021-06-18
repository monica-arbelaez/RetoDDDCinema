package domain.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;

public class FechaDeVencimiento implements ValueObject<String> {

    private final LocalDate date;
    private final String value;

    public FechaDeVencimiento(int day, int month, int year) {
        try{
            date = LocalDate.of(year,month,day);
            if(date.isBefore(LocalDate.now())){
                throw new IllegalArgumentException("La membresia esat vencida");            }
        }catch (DateTimeException ex){
            throw  new IllegalArgumentException(ex.getMessage());
        }
        value = generarFormato();
    }

    private String generarFormato(){
        return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }


    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FechaDeVencimiento that = (FechaDeVencimiento) o;
        return Objects.equals(date, that.date) && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, value);
    }
}