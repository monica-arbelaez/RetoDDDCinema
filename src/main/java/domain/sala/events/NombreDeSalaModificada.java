package domain.sala.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.genericvalues.Nombre;
import domain.sala.values.SalaId;

public class NombreDeSalaModificada extends DomainEvent {
    private SalaId salaId;
    private final Nombre nombre;

    public NombreDeSalaModificada(SalaId salaId, Nombre nombre) {
        super("cine.sala.nombredesalamodificada");
        this.nombre = nombre;
        this.salaId = salaId;
    }

    public SalaId getSalaId() {
        return salaId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
