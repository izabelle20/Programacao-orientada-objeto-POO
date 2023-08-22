/*
No seu repositório de atividades, crie uma pasta chamada atividade3 e implemente as classes necessárias para resolver o exercício 
proposto abaixo.
Sistema de Gerenciamento de Estoque.
Crie um sistema simples de gerenciamento de estoque usando objetos e classes. Cada objeto do estoque deve ter nome e quantidade.
O sistema deve permitir ao usuário adicionar, remover, listar e atualizar a quantidade de objetos cadastrados.
*/

package lista1.atividade3;

import java.util.ArrayList; 
import java.util.Scanner;

//--------------------------------------------------------PRODUTO-----------------------------------------------------------------//
class Produto {
    private String nome;
    private int quantidade;

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

//--------------------------------------------------------ESTOQUE-----------------------------------------------------------------//
public class Estoque {
    private ArrayList<Produto> produtos = new ArrayList<>(); 
    public void adicionarProduto(String nome, int quantidade) {
        Produto novoProduto = new Produto(nome, quantidade);
        produtos.add(novoProduto);
    }

    public void removerProduto(String nome) {
        Produto produtoRemover = null;
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produtoRemover = produto;
                break;
            }
        }
        if (produtoRemover != null) {
            produtos.remove(produtoRemover);
        }
    }

    public void listarProdutos() {
        System.out.println("Lista de Produtos:");
        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome() + ", Quantidade: " + produto.getQuantidade());
        }
    }

    public void atualizarQuantidade(String nome, int novaQuantidade) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produto.setQuantidade(novaQuantidade);
                break;
            }
        }
    }
}

//--------------------------------------------------------SISTEMA-----------------------------------------------------------------//
public class Gerenciamento {

    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSistema de Gerenciamento de Estoque de um Mercado");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Remover Produto");
            System.out.println("3. Listar Produtos");
            System.out.println("4. Atualizar Quantidade");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a quantidade: ");
                    int quantidade = scanner.nextInt();
                    estoque.adicionarProduto(nome, quantidade);
                    break;
                case 2:
                    System.out.print("Digite o nome do produto: ");
                    String nomeRemover = scanner.nextLine();
                    estoque.removerProduto(nomeRemover);
                    break;
                case 3:
                    estoque.listarProdutos();
                    break;
                case 4:
                    System.out.print("Digite o nome do produto: ");
                    String nomeAtualizar = scanner.nextLine();
                    System.out.print("Digite a nova quantidade: ");
                    int novaQuantidade = scanner.nextInt();
                    estoque.atualizarQuantidade(nomeAtualizar, novaQuantidade);
                    break;
                case 5:
                    System.out.println("Saindo do sistema.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
