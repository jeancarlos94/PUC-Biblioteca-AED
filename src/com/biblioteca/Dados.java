import java.util.*;

public class Dados {
    public Hashtable cadastroPaciente;
    public Hashtable cadastroMedico;
    public Hashtable cadastroConsulta;
    
    public Dados() {
        this.cadastroPaciente = new Hashtable();
        this.cadastroMedico = new Hashtable();
        this.cadastroConsulta = new Hashtable();
    }
    
    public void inserirDados(Paciente paciente){
        this.cadastroPaciente.put(paciente.codigoPaciente, paciente);
    }
    
    public void inserirDados(Medico medico){
        this.cadastroMedico.put(medico.crmMedico, medico);
    }
    
    public void inserirDados(ConsultaMedica consulta){
        this.cadastroConsulta.put(consulta.numeroConsulta, consulta);
    }
    
    public void listarConsultas(){
        Set<String> consultas = cadastroConsulta.keySet();
        System.out.println("LISTAGEM TOTAL DAS CONSULTAS DA PLATAFORMA");
        for(String keyConsultas:consultas){
            ConsultaMedica novaConsulta = (ConsultaMedica)cadastroConsulta.get(keyConsultas);
            
            System.out.printf("ConsultaMedica: %1$s - Data: %2$s - Hora: %3$s\n",novaConsulta .numeroConsulta,novaConsulta.dataConsulta,novaConsulta.horaConsulta);
            
            Paciente novoPaciente = (Paciente)cadastroPaciente.get(novaConsulta.codPaciente);
            
            System.out.printf("Paciente: %1$s\n",novoPaciente.nomePaciente);
            
            Medico novoMedico = (Medico)cadastroMedico.get(novaConsulta.crmMedico);
            
            System.out.printf("Medico: %1$s - Especialidade: %2$s\n",novoMedico.nomeMedico,novoMedico.especialidade);
            System.out.println();
        }
    }

    public void listaConsultaFiltrada(){
        Scanner entrada = new Scanner(System.in);
        Set<String> consultas = cadastroConsulta.keySet();
        System.out.println("VISUALIZAR CONSULTA POR CÓDIGO");
        System.out.print("Insira o código da consulta: ");
        String consultaDesejada = entrada.nextLine();
        int existe = 0;
        
        for(String keyConsultas:consultas){
            ConsultaMedica novaConsulta = (ConsultaMedica)cadastroConsulta.get(keyConsultas);
        }


        for(String keyConsultas:consultas){
            ConsultaMedica novaConsulta = (ConsultaMedica)cadastroConsulta.get(keyConsultas);
            //Verifica Existência da consulta
            if(consultaDesejada.equals(novaConsulta.numeroConsulta)){
                System.out.printf("ConsultaMedica: %1$s - Data: %2$s - Hora: %3$s\n",novaConsulta .numeroConsulta,novaConsulta.dataConsulta,novaConsulta.horaConsulta);
            
                Paciente novoPaciente = (Paciente)cadastroPaciente.get(novaConsulta.codPaciente);
                
                System.out.printf("Paciente: %1$s\n",novoPaciente.nomePaciente);
                
                Medico novoMedico = (Medico)cadastroMedico.get(novaConsulta.crmMedico);
                
                System.out.printf("Medico: %1$s - Especialidade: %2$s\n",novoMedico.nomeMedico,novoMedico.especialidade);
                existe = 1;
                break;
            }else{
                existe = 0;
            }
        }
        if (existe == 0) {
            System.out.println("Consulta Não existente na base de dados!");
        }
    }
}
