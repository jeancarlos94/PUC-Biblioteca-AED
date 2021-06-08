package com.biblioteca;

import java.util.*;

public class Dados {
    public Hashtable cadastroLivro;

    public Dados() {
        this.cadastroLivro = new Hashtable();
    }

    public void inserirDados(Livro livro) {
        this.cadastroLivro.put(livro.codigoLivro, livro);
    }

    public void listarLivros() {
        Set<String> cadastros = cadastroLivro.keySet();
        System.out.println("Todos os livros cadastrados na plataforma");
        System.out.println("=========================================");
        for (String keycadastros : cadastros) {
            Livro novoLivro = (Livro) cadastroLivro.get(keycadastros);
            System.out.println("Livro: " + novoLivro.nomeLivro);
            System.out.println("Autor: " + novoLivro.autor);
            System.out.println("Editora: " + novoLivro.editora);
            System.out.println("Preço: " + novoLivro.preço + " R$");
            System.out.println("Código do livro: " + novoLivro.codigoLivro);
            /* System.out.println("Categoria: " + novoLivro.categoria); */
            System.out.println("=========================================");
        }
        System.out.println("Pressione ENTER para continuar");
        System.out.println();
    }

    public void listaLivroID() {
        Scanner entrada = new Scanner(System.in);
        Set<String> cadastros = cadastroLivro.keySet();
        System.out.println("CONSULTAR LIVRO POR CÓDIGO");
        System.out.print("Insira o código do livro: ");
        String consultaLivro = entrada.nextLine();
        System.out.println("=========================================");
        int existe = 0;

        for (String keycadastros : cadastros) {
            Livro novoLivroAux = (Livro) cadastroLivro.get(keycadastros);
            // Verifica Existência do livro
            if (consultaLivro.equals(novoLivroAux.codigoLivro)) {
                Livro novoLivro = (Livro) cadastroLivro.get(keycadastros);
                System.out.println("Livro: " + novoLivro.nomeLivro);
                System.out.println("Autor: " + novoLivro.autor);
                System.out.println("Editora: " + novoLivro.editora);
                System.out.println("Preço: " + novoLivro.preço + " R$");
                System.out.println("Código do livro: " + novoLivro.codigoLivro);
                /* System.out.println("Categoria: " + novoLivro.categoria); */
                System.out.println("=========================================");
                existe = 1;
                break;
            } else {
                existe = 0;
            }
        }
        if (existe == 0) {
            System.out.println("Este livro não existe em nossa base de dados");
        }
    }
}