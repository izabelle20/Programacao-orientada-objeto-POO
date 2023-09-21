
public class Main {
    public static void main(String[] args) {
        // Criando disciplinas
        Disciplina matematica = new Disciplina("MAT101", "Matemática");
        Disciplina historia = new Disciplina("HIS201", "História");
        Disciplina ciencias = new Disciplina("CIE301", "Ciências");

        // Criando cursos
        Curso ensinoMedio = new Curso("EM", "Ensino Médio");
        Curso ensinoFundamental = new Curso("EF", "Ensino Fundamental");

        // Associando disciplinas aos cursos
        ensinoMedio.adicionarDisciplina(matematica);
        ensinoMedio.adicionarDisciplina(historia);
        ensinoMedio.adicionarDisciplina(ciencias);
        ensinoFundamental.adicionarDisciplina(matematica);
        ensinoFundamental.adicionarDisciplina(historia);

        // Criando alunos e professores
        Aluno aluno1 = new Aluno("Alice", 16, 1001, "Turma A");
        Aluno aluno2 = new Aluno("Bob", 15, 1002, "Turma B");
        Professor professor1 = new Professor("Prof. Carol", 35, 2001, "Matemática");
        Professor professor2 = new Professor("Prof. Dave", 40, 2002, "História");

        // Criando matrículas
        Matricula matricula1 = new Matricula(aluno1, professor1, 2023);
        Matricula matricula2 = new Matricula(aluno2, professor2, 2023);

        // Associando matrículas aos alunos
        aluno1.adicionarMatricula(matricula1);
        aluno2.adicionarMatricula(matricula2);

        // Exibindo informações EF
        System.out.println("Aluno: " + aluno2.getNome());
        System.out.println("Turma: " + aluno2.getTurma());
        System.out.println("Disciplinas do curso Ensino Fundamental:");
        for (Disciplina disciplina : ensinoFundamental.getDisciplinas()) {
            System.out.println("- " + disciplina.getNome());
        }

        System.out.println("\nMatrícula: " + matricula1.getAluno().getNome() + " em " + matricula1.getAnoLetivo());
        System.out.println("Professor: " + matricula1.getProfessor().getNome());   

        // Exibindo informações EM
        System.out.println("Aluno: " + aluno1.getNome());
        System.out.println("Turma: " + aluno1.getTurma());
        System.out.println("Disciplinas do curso Ensino Médio:");
        for (Disciplina disciplina : ensinoMedio.getDisciplinas()) {
            System.out.println("- " + disciplina.getNome());
        }

        System.out.println("\nMatrícula: " + matricula1.getAluno().getNome() + " em " + matricula1.getAnoLetivo());
        System.out.println("Professor: " + matricula1.getProfessor().getNome());
    }
}
