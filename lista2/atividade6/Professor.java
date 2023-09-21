public class Professor extends Pessoa {
    private int numeroRegistro;
    private String disciplina;

    public Professor(String nome, int idade, int numeroRegistro, String disciplina) {
        super(nome, idade);
        this.numeroRegistro = numeroRegistro;
        this.disciplina = disciplina;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}