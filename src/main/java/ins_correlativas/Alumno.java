package ins_correlativas;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private List<Materia> materiasAprobadas = new ArrayList<>();


    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregaAprovada(Materia materia){
        this.materiasAprobadas.add(materia);
    }

    public boolean tieneAprovada(Materia materia){
        return this.materiasAprobadas.contains(materia);
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }
}
