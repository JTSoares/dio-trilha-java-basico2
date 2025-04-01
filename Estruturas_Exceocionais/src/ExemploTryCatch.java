import java.util.InputMismatchException;
import  java.util.Locale;
import java.util.Scanner;

public class ExemploTryCatch {
    
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in).useLocale(Locale.US);
        
        //Tratamento de exceções
        try{
            System.err.println("Digite seu nome: ");
            String nome = scanner.next();

            
            System.err.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

            
            System.err.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            
            System.err.println("Digite sua altura: ");
            Double altura = scanner.nextDouble();

            System.out.println("Nome: " + nome + " Sobrenome: "+ sobrenome+ " Altura: "+ altura+ " Idade: " + idade);
        }

        catch(InputMismatchException e){
            System.err.println("Campo nome e sobrenome devem ser numéricos!");
            scanner.close();
        }
        
    }   

    
}
