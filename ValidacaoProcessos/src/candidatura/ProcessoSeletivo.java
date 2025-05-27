package candidatura;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        Scanner scanner = new Scanner(System.in);
        double salarioPretendido;

        selecaoCandidatos();

    }

    static void imprimirCandidatosSelecionados(){
     String [] selecionados = {"Maria", "Joao", "Lucas", "Johnny"};
     for (int indice = 0; indice < selecionados.length; indice++) {
         System.out.println("Candidato de nº" + (indice + 1) + " é o " + selecionados[indice]);
     }
     System.out.println("Forma abeviada de iteracao(for each):\n");

     for(String candidato: selecionados) {
         System.out.println(candidato);
     }

    }

    /**
     * Metodo utilizado para analisar o candidato
     * @param salarioPretendido Salario pretendido pelo candidato para a vaga
     *
     */
    static void analisarCandidato(double salarioPretendido){
        double  salarioBase = 2000.0;

        if(salarioBase  < salarioPretendido){
            System.out.println("Ligar para o candidato");
        }
        else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        }
        else {
            System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS");
        }
    }

    /**
     * Metodo utilizado para selecionar os candidatos atraves de algumas condições
     *
     */
    static void selecaoCandidatos(){
        String [] candidatos = {"João", "Maria", "Rubens", "Daniel", "Pedro"}; //Lista de candidatos
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        //Enquanto os  numero de candidatos for menor que 5
        while((candidatosSelecionados) < 5 && (candidatoAtual < candidatos.length)){ //Enquanto todos os candidatos possiveis nao foram selecionados e todos os candidatos foram visitados
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("Candidato: " + candidato + " Salario pretendido: " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("Candidato: " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados ++; //Atualiza a lista de candidatos selecionado
            }
            candidatoAtual ++;
        }
    }

    /**
     * Metodo utilizado para gerar o valor pretendido pelo candidato atraves de um random
     * @return numero random
     */
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }


}
