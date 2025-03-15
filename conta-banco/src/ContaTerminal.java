import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Declaracao de variaveis
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //Criando o objeto para permitir a entrada de dados

        //Entrada de dados
        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome da agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();
        
        //Saida dos dados
        System.out.println("Olá "+ nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é  " + agencia + " conta " +numeroConta+ "e seu saldo "+ saldo + " já está disponível para saque");
    }
}
