package com.biblioteca;

import java.util.*;

public class Dados {
    public Hashtable cadastroLivro;
    
    public Dados() {
        this.cadastroLivro = new Hashtable();
    }
    
    public void inserirDados(Livro livro){
        this.cadastroLivro.put(livro.codigoLivro, livro);
    }
    
    public void listarLivros(){
        Set<String> cadastros = cadastroLivro.keySet();
        System.out.println("LISTAGEM TOTAL DOS LIVROS DA PLATAFORMA");
        for(String keycadastros:cadastros){         
            Livro novoLivro = (Livro)cadastroLivro.get(keycadastros);
            System.out.printf("Livro: %1$s\n",novoLivro.nomeLivro);
            System.out.println();
        }
    }

    public void listaLivroID(){
        Scanner entrada = new Scanner(System.in);
        Set<String> cadastros = cadastroLivro.keySet();
        System.out.println("CONSULTAR LIVRO POR CÓDIGO");
        System.out.print("Insira o código do livro: ");
        String consultaLivro = entrada.nextLine();
        int existe = 0;

        for(String keycadastros:cadastros){
            Livro novoLivroAux = (Livro)cadastroLivro.get(keycadastros);
            //Verifica Existência do livro
            if(consultaLivro.equals(novoLivroAux.codigoLivro)){
                Livro novoLivro = (Livro)cadastroLivro.get(keycadastros);
                System.out.printf("Livro: %1$s\n",novoLivro.nomeLivro);
                System.out.println();
                existe = 1;
                break;
            }else{
                existe = 0;
            }
        }
        if (existe == 0) {
            System.out.println("livro não existente na base de dados!");
        }
    }
}
