import ins_correlativas.Alumno;
import ins_correlativas.Inscripcion;
import ins_correlativas.Materia;
import ins_correlativas.RESULTADO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class InscripcionTest {

    @Test
    public void alumnoApruebaInscripcion(){
        Alumno alumno = new Alumno("Valentin");
        Materia mate1 = new Materia("Matemática 1");
        Materia mate2 = new Materia("Matemática 2");

        alumno.agregaAprovada(mate1);
        mate2.agregaCorrelativa(mate1);

        Inscripcion insMate2 = new Inscripcion(alumno,mate2);
        Assertions.assertEquals(RESULTADO.APROBADO,insMate2.aprobada());
    }

    @Test
    public void alumnoNoApruebaInscripcion(){
        Alumno alumno = new Alumno("Agustina");
        Materia prog1 = new Materia("Programación 1");
        Materia prog2 = new Materia("Programación 2");

        prog2.agregaCorrelativa(prog1);

        Inscripcion insProg2 = new Inscripcion(alumno,prog2);
        Assertions.assertEquals(RESULTADO.DESAPROBADO,insProg2.aprobada());
    }

}
