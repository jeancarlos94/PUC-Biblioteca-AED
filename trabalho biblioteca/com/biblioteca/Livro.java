package com.biblioteca;

import java.util.*;

public class Livro {
    public String codigoLivro;
    public String nomeLivro;
    public String autor;
    public String editora;
    public Double preço;
    public int categoria;
    
    public Livro(){
        UUID idlivro = UUID.randomUUID();
        this.codigoLivro = idlivro.toString().toUpperCase().substring(15,18);
    }
    
    public void cadastroLivro(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("--CADASTRO DE LIVRO--");
        System.out.print("Insira o nome do livro: ");
        this.nomeLivro = entrada.nextLine();
        System.out.print("Insira o autor: ");
        this.autor = entrada.nextLine();
        System.out.print("Insira a editora: ");
        this.editora = entrada.nextLine();
        System.out.print("Insira o preço: ");
        this.preço = entrada.nextDouble(); //não deixar escrever letras
        listarCategorias();
        //mostrar aqui as categorias disponíveis
        System.out.print("Insira a categoria (Apenas números): ");
        this.categoria = entrada.nextInt();
        
        System.out.printf("Código identificador do livro: %1$s\n",this.codigoLivro);
        System.out.println("Cadastro do livro finalizado com sucesso!");
    }

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


}
