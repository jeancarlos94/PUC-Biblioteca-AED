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
        Paciente novoPaciente;
        Medico novoMedico;
        ConsultaMedica novaConsulta;
        int opcao;

        do {
            System.out.println("BEM VINDO AO CADASTRA CONSULTAS 1.0");
            System.out.println("MENU DE FUNCIONALIDADES");
            System.out.println("1 - Cadastrar Paciente");
            System.out.println("2 - Cadastrar Médico");
            System.out.println("3 - Agendar Consulta");
            System.out.println("4 - Visualizar Consulta por código");
            System.out.println("5 - Visualizar Todas as Consultas");
            System.out.println("6 - Sair");
            System.out.print("Para utilizar o sistema insira a opção desejada: ");

            try {
                opcao = Integer.parseInt(entrada.nextLine());
                LimparConsole();
            } catch (Exception erro) {
                System.out.println("Insira apenas números");
                opcao = 0;
            } finally {
                opcao = Integer.parseInt(entrada.nextLine());
                LimparConsole();
            }

            // Cadastra Paciente
            if (opcao == 1) {
                do {
                    // Cadastramento de novo paciente
                    novoPaciente = new Paciente();
                    novoPaciente.cadastroPaciente();
                    cadastrarDados.inserirDados(novoPaciente);
                    System.out.print("\nDeseja cadastrar um novo Paciente? (S/N)");

                } while (entrada.nextLine().toUpperCase().charAt(0) != 'N');
            }
            LimparConsole();
            // Cadastra Médico
            if (opcao == 2) {
                do {
                    // Cadastramento novo médico
                    novoMedico = new Medico();
                    novoMedico.cadastraMedico();
                    cadastrarDados.inserirDados(novoMedico);
                    System.out.print("\nDeseja cadastrar outro Médico? (S/N)");

                } while (entrada.nextLine().toUpperCase().charAt(0) != 'N');
            }
            LimparConsole();
            // Agenda Consulta
            if (opcao == 3) {

                do {
                    // Agendamento de Consultas
                    novaConsulta = new ConsultaMedica();
                    novaConsulta.realizarConsulta();
                    cadastrarDados.inserirDados(novaConsulta);
                    System.out.print("\nDeseja marcar outra consulta? (S/N)");

                } while (entrada.nextLine().toUpperCase().charAt(0) != 'N');
            }
            LimparConsole();
            // Listar uma consulta em específico
            if (opcao == 4) {
                do {
                    cadastrarDados.listaConsultaFiltrada();
                    // cadastrarDados.listarConsultas();
                    System.out.print("\nDeseja exibir outra consulta? (S/N)");
                } while (entrada.nextLine().toUpperCase().charAt(0) != 'N');
            }
            LimparConsole();
            if (opcao == 5) {
                cadastrarDados.listarConsultas();
                entrada.nextLine();
            }
            // "Sair" da aplicação
        } while (opcao != 6);
    }
}
