package domain.sala.command;

import co.com.sofka.domain.generic.Command;
import domain.genericvalues.Nombre;
import domain.sala.values.SalaId;

public class ModificarNombreDeSala implements Command {
    private final SalaId salaId;
    private final Nombre nombre;

    public ModificarNombreDeSala(SalaId salaId, Nombre nombre) {
        this.salaId = salaId;
        this.nombre = nombre;
    }

    public SalaId getSalaId() {
        return salaId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
