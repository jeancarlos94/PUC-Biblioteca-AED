import java.util.*;

public class Medico {
    public int crmMedico;
    public String nomeMedico;
    public String especialidade;
    
    public Medico(){

        this.crmMedico=0;
        this.nomeMedico="";
        this.especialidade="";
    }
    
    public void cadastraMedico(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("--CADASTRO DE MÉDICOS--");
        System.out.print("Insira o CRM do médico (SÓ SÃO ACEITOS NÚMEROS): ");
        this.crmMedico= Integer.parseInt(entrada.nextLine());

        System.out.print("Insira o nome do Médico: ");
        this.nomeMedico= entrada.nextLine();

        System.out.print("Insira a especialidade do Médico: ");
        this.especialidade= entrada.nextLine();
        System.out.println("CADASTRO DO MÉDICO FINALIZADO!");
        
    }
}