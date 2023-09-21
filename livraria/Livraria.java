package livraria;

import java.util.ArrayList;

public class Livraria {
    ArrayList<Livro> livros;

    Livraria() {
        this.livros = new ArrayList<Livro>();
    }

    public void adicionarLivro(Livro livro) { 
        this.livros.add(livro); 
    }

    public String listarLivros() {
        String listaLivros = ""; 

        for (Livro livro : this.livros) { 
            listaLivros += livro.imprimir() + "\n"; 
        }

        return listaLivros;
    }

    public String buscarLivroPorId(int id) {
        for (Livro livro : this.livros) { 
            if (livro.getId() == id) { 
                return livro.imprimir(); 
            }
        }
        
        return "Livro não encontrado.";
    }
}
