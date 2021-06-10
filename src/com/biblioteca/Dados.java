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
            System.out.println("Autor: " + novoLivro.autorLivro);
            System.out.println("Editora: " + novoLivro.editoraLivro);
            System.out.println("Categoria: " + novoLivro.categoriaLivro);
            System.out.println("Preço: " + novoLivro.precoLivro + " R$");
            System.out.println("Código do livro: " + novoLivro.codigoLivro);
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
            if (consultaLivro.equals(novoLivroAux.codigoLivro)) {
                Livro novoLivro = (Livro) cadastroLivro.get(keycadastros);
                System.out.println("Livro: " + novoLivro.nomeLivro);
                System.out.println("Autor: " + novoLivro.autorLivro);
                System.out.println("Editora: " + novoLivro.editoraLivro);
                System.out.println("Categoria: " + novoLivro.categoriaLivro);
                System.out.println("Preço: " + novoLivro.precoLivro + " R$");
                System.out.println("Código do livro: " + novoLivro.codigoLivro);
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

    public void listarCategorias() {
        Set<String> cadastros = cadastroLivro.keySet();
        System.out.println("Todos as categorias cadastrados na plataforma");
        System.out.println("=========================================");
        for (String keycadastros : cadastros) {
            Livro novoLivro = (Livro) cadastroLivro.get(keycadastros);
            System.out.println(novoLivro.categoriaLivro);
            System.out.println("=========================================");
        }
        System.out.println("Pressione ENTER para continuar");
        System.out.println();
    }

    public void listaLivroCategoria() {
        Scanner entrada = new Scanner(System.in);
        Set<String> cadastros = cadastroLivro.keySet();
        System.out.println("CONSULTAR LIVRO POR CATEGORIA");
        System.out.print("Insira a categoria do livro: ");
        String consultaLivro = entrada.nextLine().toUpperCase();
        System.out.println("=========================================");
        int existe = 0;

        for (String keycadastros : cadastros) {
            Livro novoLivroAux = (Livro) cadastroLivro.get(keycadastros);
            if (consultaLivro.equals(novoLivroAux.categoriaLivro)) {
                Livro novoLivro = (Livro) cadastroLivro.get(keycadastros);
                System.out.println("Livro: " + novoLivro.nomeLivro);
                System.out.println("Autor: " + novoLivro.autorLivro);
                System.out.println("Editora: " + novoLivro.editoraLivro);
                System.out.println("Categoria: " + novoLivro.categoriaLivro);
                System.out.println("Preço: " + novoLivro.precoLivro + " R$");
                System.out.println("Código do livro: " + novoLivro.codigoLivro);
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