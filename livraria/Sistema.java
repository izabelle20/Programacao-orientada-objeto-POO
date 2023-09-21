package livraria;

import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
        int opcao = 0;

        Livraria livraria = new Livraria();

        Scanner scanner = new Scanner(System.in);
        while (opcao != 4) {
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Detalhar livro");
            System.out.println("4 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            executarOpcao(opcao, scanner, livraria);
        }
        scanner.close();
        System.out.println("Sistema fechado");
    }

    public static void executarOpcao(int op, Scanner sc, Livraria livraria) {
        switch (op) {
            case 1:
                System.out.println("Adicionando livro");
                System.out.println("Digite o ID");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("Digite o Autor");
                String autor = sc.nextLine();
                System.out.println("Digite o Título");
                String titulo = sc.nextLine();
                System.out.println("Digite o Ano de Publicação");
                int ano_publicacao = sc.nextInt();
                sc.nextLine();

                Livro livro = new Livro(id, autor, titulo, ano_publicacao);

                livraria.adicionarLivro(livro); 
                break;

            case 2:
                System.out.println("Listando livros");
                System.out.println(livraria.listarLivros());
                break;

            case 3:
                System.out.println("Detalhar livro");
                System.out.println("Buscar livro por ID");
                int idBusca = sc.nextInt();
                System.out.println(livraria.buscarLivroPorId(idBusca));
                break;

            default:
                break;
        }
    }
}