@SuppressWarnings("all")
public class Professor {

    //associação entre a classe Professor e Aluno
    private Aluno aluno;
    private Departamento departamento;

    public Professor(){
        //dependencia com a classe aluno;
        this.aluno = new Aluno();
    }

    //metodo com dependencia com a classe Curso
    public void ensinar(Curso c){
        aluno.lembrar(c.obterConhecimento());
    }
    
    
}
