package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class Processo_Seletivo {
	public static void main(String[] args) {
		
		//selecaoCandidatos();
		imprimirSelecionados();
	}
	
	public static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		
		//CONDIÇÕES
		if (salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato");
		}
		else if(salarioBase == salarioPretendido){
			System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
		}
		else {
			System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS");
		}
	}
	
	public static void selecaoCandidatos() {
		String [] candidatos = {"João", "Maria", "Rubens", "Daniel", "Pedro"};
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		
		//Enquanto todos os candidatos disponíveis nao foram selecionados e todos os candidatos foram visitados
		while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato: " + candidato + " solicitou: "+ salarioPretendido);
			if (salarioBase >= salarioPretendido) {
				System.out.println("O candidato: " + candidato + " foi selecionado");
				candidatosSelecionados ++;
			}
			candidatoAtual ++;	
		}
	
	}
	
	public static void imprimirSelecionados() {
		String [] selecionados = {"João", "Maria", "Rubens", "Daniel", "Pedro"};
		System.out.println("Imprimindo candidatos selecionados:\n");
		
		for (int indice = 0; indice < selecionados.length; indice++) {
			System.out.println("Candidato de nº" + (indice + 1) + "é o " + selecionados[indice]);
			
		}
		
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800,2200);
	}
	

}
