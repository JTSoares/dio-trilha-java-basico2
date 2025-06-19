import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Entradas
        int entrada1= scanner.nextInt();
        int entrada2= scanner.nextInt();
        scanner.close();

        try{
            contar(entrada1,entrada2);
        }catch(Excecao e){
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }


    }

    /**
     * Autor: Joao Victor Torres Soares
     * Data:  19/06/2025
     * Objetivo: Avaliar dois numeros inteiros e imprimir a quantidade de numeros de sua diferenca
     * @param numero1 numero inteiro, primeira entrada
     * @param numero2 numero inteiro, segunda entrada
     */
    static void contar(int numero1, int numero2) throws Excecao{
        if(numero1>numero2){
            throw new Excecao();

        }
        else{
            int diferenca = numero2 - numero1;

            for(int i=1; i<= diferenca; i++){
                System.out.println("Imprimindo o numero: " + i);
            }
        }


    }
}
