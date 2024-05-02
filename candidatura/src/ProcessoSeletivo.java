import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        analise(1900.0);
        analise(2200.0);
        analise(2000.0);
    }

    static void selecaoCandidatos() {

        String [] candidatos = {"Felipe","Julia","Marcia","Paulo","Jonas","Antonio","Carlos","Katarina","Nicolle","Kevin"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5) {
                String candidato = candidatos[candidatosAtual];
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
}