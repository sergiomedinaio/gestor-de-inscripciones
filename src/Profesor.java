import java.util.ArrayList;

public class Profesor extends Persona{
    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public void asignarCurso(Curso curso) {
        
    }

    private ArrayList<Curso> cursos;

    Profesor(int dni, String nombre) {
        super(dni, nombre);
        setCursos(new ArrayList<Curso>());
    }
}
