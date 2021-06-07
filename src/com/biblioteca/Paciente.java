import java.util.*;

public class Paciente {
    public String codigoPaciente;
    public String nomePaciente;
    
    public Paciente(){
        UUID idPaciente = UUID.randomUUID();
        
        this.codigoPaciente = idPaciente.toString().toUpperCase().substring(15,18);
    }
    
    public void cadastroPaciente(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("--CADASTRO DE PACIENTES--");
        System.out.print("Insira o nome do paciente: ");
        this.nomePaciente = entrada.nextLine();
        
        System.out.printf("Código identificador do Paciente: %1$s\n",this.codigoPaciente);
        System.out.println("Cadastro do paciente finalizado com sucesso!");
        entrada.nextLine();
    }
}