package com.biblioteca;

import java.io.IOException;
import java.util.*;

public class Main {

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
            System.out.println("\n                 =======================================");
            System.out.println("                  |     1 - Cadastrar Livro             |");
            System.out.println("                  |     2 - Categorias disponíveis      |");
            System.out.println("                  |     3 - Buscar Livro                |");
            System.out.println("                  |     4 - Listar livros por categoria |");
            System.out.println("                  |     5 - Listar livros por ID        |");
            System.out.println("                  |     6 - Mostrar todos os livros     |");
            System.out.println("                  |     0 - Sair                        |");
            System.out.println("                  =======================================\n");
            System.out.print("Para utilizar o sistema, insira a opção desejada: ");
            opcao = Integer.parseInt(entrada.nextLine());
            /* arquivo txt */
            switch (opcao) {

                case 1:
                    do {
                        novoLivro = new Livro();
                        novoLivro.cadastroLivro();
                        cadastrarDados.inserirDados(novoLivro);
                        System.out.print("\nDeseja cadastrar um novo livro? (S/N)");
                    } while (entrada.nextLine().toUpperCase().charAt(0) != 'N');
                    LimparConsole();
                    break;

                case 2:
                    cadastrarDados.listarCategorias();
                    entrada.nextLine();
                    break;

                case 3:
                    do {
                        cadastrarDados.listaLivroID();
                        System.out.print("\nDeseja buscar outro livro? (S/N)");
                    } while (entrada.nextLine().toUpperCase().charAt(0) != 'N');
                    LimparConsole();
                    break;

                case 4:
                    do {
                        cadastrarDados.listaLivroCategoria();
                        System.out.print("\nDeseja buscar outro livro? (S/N)");
                    } while (entrada.nextLine().toUpperCase().charAt(0) != 'N');
                    LimparConsole();

                case 5:
                do {
                    cadastrarDados.listaLivroID();
                    System.out.print("\nDeseja buscar outro livro? (S/N)");
                } while (entrada.nextLine().toUpperCase().charAt(0) != 'N');
                LimparConsole();

                case 6:
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
