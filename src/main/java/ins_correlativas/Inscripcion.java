package ins_correlativas;

public class Inscripcion {
    private Alumno alumno;
    private Materia materia;

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public RESULTADO aprobada(){
        if(this.alumno.getMateriasAprobadas().containsAll(this.materia.getCorrelativas())){
            return RESULTADO.APROBADO;
        } else{
            return RESULTADO.DESAPROBADO;
        }

    }

    public void imprimeResultado(){
        System.out.println("Resultado de la inscripción del alumno " + this.alumno.getNombre()
                + " a la materia " + this.materia.getNombre()
                + ": " + this.aprobada());
    }
}
