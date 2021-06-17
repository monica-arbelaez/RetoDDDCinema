package domain.sala.values;


import co.com.sofka.domain.generic.Identity;

public class SalaId extends Identity {
    private SalaId(String id) {
        super(id);
    }

    public SalaId(){}

    public static SalaId of(String id){
        return new SalaId(id);
    }
}
