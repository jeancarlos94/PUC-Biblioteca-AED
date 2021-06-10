package com.biblioteca;

import java.util.*;

public class Livro {
    public String codigoLivro;
    public String nomeLivro;
    public String autorLivro;
    public String editoraLivro;
    public Double precoLivro;
    public String categoriaLivro;

    public Livro(){
        UUID idlivro = UUID.randomUUID();
        this.codigoLivro = idlivro.toString().toUpperCase().substring(15,18);
    }

    public void cadastroLivro(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("--CADASTRO DE LIVRO--");
        System.out.print("Insira o nome do livro: ");
        this.nomeLivro = entrada.nextLine();
        System.out.print("Insira o autorLivro: ");
        this.autorLivro = entrada.nextLine();
        System.out.print("Insira a editoraLivro: ");
        this.editoraLivro = entrada.nextLine();
        System.out.print("Insira o preço: ");
        this.precoLivro = Double.parseDouble(entrada.nextLine()); //não deixar escrever letras
        //mostrar aqui as categorias disponíveis
        System.out.print("Insira a categoriaLivro: ");
        this.categoriaLivro = entrada.nextLine();

        System.out.printf("Código identificador do livro: %1$s\n",this.codigoLivro);
        System.out.println("Cadastro do livro finalizado com sucesso!");
    }
}
