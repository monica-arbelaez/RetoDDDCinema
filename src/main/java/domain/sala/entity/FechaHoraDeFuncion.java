package domain.sala.entity;

import co.com.sofka.domain.generic.Entity;
import domain.sala.values.FechaHoraDeFuncionId;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class FechaHoraDeFuncion extends Entity<FechaHoraDeFuncionId> {
    private final LocalDate value;
    private final String format;

    public FechaHoraDeFuncion(FechaHoraDeFuncionId entityId, int day, int month, int year) {
        super(entityId);

        try {
            value = LocalDate.of(year, month, day);
            if (value.isBefore(LocalDate.now())) {
                throw new IllegalArgumentException("No es valida la fecha de la pelicula ");
            }
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
        format = generateFormat();
    }

    private String generateFormat() {
        return value.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public String value() {
        return format;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FechaHoraDeFuncion that = (FechaHoraDeFuncion) o;
        return Objects.equals(value, that.value) && Objects.equals(format, that.format);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), value, format);
    }
}
