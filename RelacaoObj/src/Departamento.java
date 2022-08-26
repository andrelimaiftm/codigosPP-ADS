import java.util.List;

public class Departamento {

    //Agregação entre a classe Departamento e Professor
    private List<Professor> professores;

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    
    
}
