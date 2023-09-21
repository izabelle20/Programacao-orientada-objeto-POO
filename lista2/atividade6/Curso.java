import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String codigo;
    private String nome;
    private List<Disciplina> disciplinas;  // Lista de disciplinas

    public Curso(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.disciplinas = new ArrayList<>(); // Inicializando a lista de disciplinas
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para adicionar disciplina ao curso
    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    // Método para obter a lista de disciplinas do curso
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
}

