import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private int numeroMatricula;
    private String turma;
    private List<Matricula> matriculas;  // Adicionando uma lista de matrículas

    public Aluno(String nome, int idade, int numeroMatricula, String turma) {
        super(nome, idade);
        this.numeroMatricula = numeroMatricula;
        this.turma = turma;
        this.matriculas = new ArrayList<>(); // Inicializando a lista de matrículas
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public String getTurma() {
        return turma;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void adicionarMatricula(Matricula matricula) {
        matriculas.add(matricula);
    }
}

