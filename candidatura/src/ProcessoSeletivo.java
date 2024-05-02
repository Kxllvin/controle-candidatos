import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"Felipe","Julia","Marcia","Paulo","Jonas","Antonio","Carlos","Katarina","Nicolle","Kevin"};
        
        imprimirCandidatos();
        selecaoCandidatos();
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }

    static void imprimirCandidatos() {
    
        String [] candidatos = {"Felipe","Julia","Marcia","Paulo","Jonas","Antonio","Carlos","Katarina","Nicolle","Kevin"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento:");
        
        for(int indc=0; indc < candidatos.length; indc++) {
            System.out.println("O candidato de número " + (indc+1) + "é o(a)" + candidatos[indc]);
        }
    }

    static void selecaoCandidatos() {

        String [] candidatos = {"Felipe","Julia","Marcia","Paulo","Jonas","Antonio","Carlos","Katarina","Nicolle","Kevin"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
                String candidato = candidatos[candidatosAtual];
                double salarioPretendido = valorPretendido();

            System.out.println("O " +(candidatosAtual+1) + " candidato " + candidato + " Solicitou este valor de salário: R$ " + salarioPretendido);
            if(salarioBase > salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            } else {
                System.out.println("O candidato " + candidato + " não foi selecionado para a vaga.");
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analise(double salarioPretendido){

        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("Ligar para o Candidato");
        }else if (salarioBase < salarioPretendido)
            System.out.println("Ligar para o Candidato com contra proposta");
        else{
            System.out.println("Aguardar o resultado dos outros Candidatos.");
        }
    }

    static void entrandoEmContato (String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso.");
        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa.");
        else
            System.out.println("Não conseguimos contato com " + candidato + ", numero de tentativas foram: " + tentativasRealizadas + "realizadas.");
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
}