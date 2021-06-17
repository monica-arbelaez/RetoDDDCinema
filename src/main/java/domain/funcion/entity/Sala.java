package domain.funcion.entity;

import co.com.sofka.domain.generic.Entity;
import domain.funcion.values.SalaId;
import domain.funcion.values.Silla;

import java.util.List;

public class Sala  extends Entity<SalaId> {
    private List<Silla> sillas;

    public Sala(SalaId entityId, List<Silla> sillas) {
        super(entityId);
        this.sillas = sillas;
    }

    public List<Silla> getSillas() {
        return sillas;
    }
}
