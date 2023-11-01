package ins_correlativas;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas = new ArrayList<>();


    public Materia(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregaCorrelativa(Materia materia){
        this.correlativas.add(materia);
    }

    public boolean sosCorrelativaDe(Materia materia){
        return this.correlativas.contains(materia);
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }
}
