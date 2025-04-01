package candidatura;

public class Processo_Seletivo {
	public static void main(String[] args) {
		analisarCandidato(1900.0);
		analisarCandidato(2200.0);
		analisarCandidato(2000.0);
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
	

}
