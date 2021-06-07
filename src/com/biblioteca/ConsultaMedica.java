package com.biblioteca;
import java.util.*;

public class ConsultaMedica {

    public String numeroConsulta;
    public String dataConsulta;
    public String horaConsulta;
    public String codPaciente;
    public int crmMedico;

    public ConsultaMedica(){
        UUID identificador =UUID.randomUUID();
        
        this.numeroConsulta=identificador.toString().toUpperCase().substring(15,18);
    }
    
    public void realizarConsulta(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("--CADASTRAMENTO DE CONSULTAS--");
        System.out.printf("Código da consulta: %1$s\n",this.numeroConsulta);

        System.out.print("Insira o código do paciente requisitante: ");
        this.codPaciente = entrada.nextLine();

        System.out.print("Insira o código CRM do médico desejado: ");
        this.crmMedico = Integer.parseInt(entrada.nextLine());

        System.out.print("Insira uma data para a consulta\n");
        System.out.print("Formato : Dia/Mês/Ano\n");
        this.dataConsulta = entrada.nextLine();

        System.out.print("Insira a hora da consulta\n");
        System.out.print("Formato : XX:XX\n");
        this.horaConsulta = entrada.nextLine();
        System.out.println("Consulta marcada com sucesso!");
        entrada.nextLine();
    }
}
