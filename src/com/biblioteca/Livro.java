package com.biblioteca;

import java.util.*;

public class Livro {
    public String codigoLivro;
    public String nomeLivro;
    
    public Livro(){
        UUID idlivro = UUID.randomUUID();
        
        this.codigoLivro = idlivro.toString().toUpperCase().substring(15,18);
    }
    
    public void cadastroLivro(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("--CADASTRO DE LIVRO--");
        System.out.print("Insira o nome do livro: ");
        this.nomeLivro = entrada.nextLine();
        
        System.out.printf("Código identificador do livro: %1$s\n",this.codigoLivro);
        System.out.println("Cadastro do livro finalizado com sucesso!");
    }
}