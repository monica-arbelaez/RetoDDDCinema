package domain.sala.values;

import co.com.sofka.domain.generic.ValueObject;


import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FechaHoraFuncionPelicula implements ValueObject<String> {

    private final LocalDate date;
    private final String value;

    public FechaHoraFuncionPelicula(int day, int month, int year) {
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
}
