public class Matricula {
    private Aluno aluno;
    private Professor professor;
    private int anoLetivo;

    public Matricula(Aluno aluno, Professor professor, int anoLetivo) {
        this.aluno = aluno;
        this.professor = professor;
        this.anoLetivo = anoLetivo;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public int getAnoLetivo() {
        return anoLetivo;
    }
}
