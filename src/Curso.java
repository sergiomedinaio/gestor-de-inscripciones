import java.util.ArrayList;
import java.util.Date;

public class Curso {
    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        this.estudiantes.add(estudiante);
    }

    public Curso(Date horario, Materia materia, Profesor profesor) {
        this.horario = horario;
        this.materia = materia;
        this.profesor = profesor;
    }

    private Date horario;
    private Materia materia;
    private Profesor profesor;
    private ArrayList<Estudiante> estudiantes;

}
