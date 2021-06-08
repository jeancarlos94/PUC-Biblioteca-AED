package com.biblioteca;
import java.io.IOException;
import java.util.*;



public class Main {

    public static void listarCategorias(){

        List<Integer> listaCategorias = new ArrayList<Integer>();

        for (int i = 1; i < 11; i++) {
            listaCategorias.add(i);
        }

        System.out.println("\n\n                     Categorias disponíveis");
        System.out.println("\n                  ===========================");
        System.out.println("                  |     1 - Aventura         |");
        System.out.println("                  |     2 - Romance          |");
        System.out.println("                  |     3 - Ficção           |");
        System.out.println("                  |     4 - Biografia        |");
        System.out.println("                  |     5 - Conto            |");
        System.out.println("                  |     6 - Drama            |");
        System.out.println("                  |     7 - Horror           |");
        System.out.println("                  |     8 - Drama            |");
        System.out.println("                  |     9 - Suspense         |");
        System.out.println("                  |     10 - Poesia          |");
        System.out.println("                  ===========================\n");
    }

    public static void LimparConsole() throws InterruptedException, IOException {
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner entrada = new Scanner(System.in);
        Dados cadastrarDados = new Dados();
        Livro novoLivro;
        int opcao;

        do {
            System.out.println("\n\n### SISCOM - Sistema Comercial de Controle de Compras e Vendas ###");
        System.out.println("\n                  =========================");
        System.out.println("                  |     1 - Cadastrar Livro        |");
        System.out.println("                  |     2 - Listar Categorias      |");
        System.out.println("                  |     3 - Buscar Livro        |");
        System.out.println("                  |     4 - Listar livros por categoria    |");
        System.out.println("                  |     5 - Listar todos livros      |");
        System.out.println("                  |     0 - Sair          |");
        System.out.println("                  =========================\n");
        System.out.print("Para utilizar o sistema insira a opção desejada: ");
        opcao = Integer.parseInt(entrada.nextLine());

        switch (opcao) {

            case 1:
            do {
                novoLivro = new Livro();
                novoLivro.cadastroLivro();
                cadastrarDados.inserirDados(novoLivro);
                System.out.print("\nDeseja cadastrar um novo livro? (S/N)");
            }while (entrada.nextLine().toUpperCase().charAt(0) != 'N');
            LimparConsole();
            break;

            case 2:
                listarCategorias();
                entrada.nextLine();
                break;

            case 3:
            do{
                cadastrarDados.listaLivroID();
                System.out.print("\nDeseja buscar outro livro? (S/N)");
            }while (entrada.nextLine().toUpperCase().charAt(0) != 'N');
            LimparConsole();
            break;

            // case 4:
            //     BD.RelatorioConsultas();
            //     S.nextLine();
            //     break;

            case 5:
                cadastrarDados.listarLivros();
                entrada.nextLine();
                break;

            case 0:
                System.out.printf("\n Saindo...\n\n");
                break;

            default:
                System.out.printf("\n Opção invalida!!\n");
                break;
        }
        } while (opcao != 0);
    }
}
