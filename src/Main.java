import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Estudiante marcos = new Estudiante(12345678, "Marcos");
        Profesor sergio = new Profesor(123456, "Sergio");
        Materia poo = new Materia("POO");
        Curso pooJuevesTarde = new Curso(
                new Date(2020, 10, 17),
                poo,
                sergio
        );
        marcos.inscribirCurso(pooJuevesTarde);
        sergio.asignarCurso(pooJuevesTarde);
    }
}
