package ins_correlativas;

public class Main {
    public static void main(String[] args) {

        //Test alumno Valentin aprueba inscripcion a Matemática II
        Alumno alumno1 = new Alumno("Valentin");
        Materia mate1 = new Materia("Matemática 1");
        Materia mate2 = new Materia("Matemática 2");

        mate2.agregaCorrelativa(mate1); //Matemática 1 es correlativa de Matemática 2
        alumno1.agregaAprovada(mate1); //Tiene aprobada Matemática 1

        Inscripcion insMate2 = new Inscripcion(alumno1,mate2);
        insMate2.imprimeResultado();



        //Test alumno Agustina NO aprueba inscripcion a Programación II
        Alumno alumno2 = new Alumno("Agustina");
        Materia prog1 = new Materia("Programación 1");
        Materia prog2 = new Materia("Programación 2");

        prog2.agregaCorrelativa(prog1); //Programación 1 es correlativa de Programación 2
                                        //NO tiene aprobada Programación 1

        Inscripcion insProg2 = new Inscripcion(alumno2,prog2);
        insProg2.imprimeResultado();
    }
}