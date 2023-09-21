package livraria;

public class Livro {
    int id;
    String autor;
    String titulo;
    String ano_publicacao;

    Livro(int id, String autor, String titulo, String ano_publicacao){
        this.id = id;
        this.autor = autor;
        this.titulo = titulo;
        this.ano_publicacao = ano_publicacao;
    }

    public Livro(int id2, String autor2, String titulo2, int ano_publicacao2) {
    }

    String imprimir(){
        String ret = "";
        ret = this.titulo + " - " + this.autor + " - " + this.ano_publicacao;
        return ret;
    }

    public int getId() {
        return 0;
    }
}
