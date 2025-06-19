
import java.util.Scanner;

public class CalculoIMC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double imc; 

        System.out.println("Digite a sua altura: \n");
        double altura = scanner.nextDouble();  

        System.out.println("Digite o seu peso: \n");
        double peso = scanner.nextDouble();
        scanner.close();

        System.out.println("Altura:" + altura);
        System.out.println("Peso:" + peso);

        //Calculo
        imc = (peso/ (Math.pow(altura,2)));
        if(imc < 18.5){
            System.out.println("Abaixo do peso");
        }
        else if (imc< 25) {
            System.out.println("IMC: " + imc + " Peso normal");
        }
        else if(imc<30){
            System.out.println("IMC: " + imc +"Excesso de peso" );
        }
        else if (imc<35){
            System.out.println("IMC: " + imc +"Obesidade classe 1" );
        }
        else if (imc<40){
            System.out.println("IMC: " + imc +"Obesidade classe 2" );
        }
        else {
            System.out.println("IMC: " + imc +"Obesidade classe 3" );
        }

    }
    
}
