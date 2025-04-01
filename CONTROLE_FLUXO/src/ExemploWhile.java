
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0; 
        double doce;
        int quantidadeDoces = 0; 
        
        while(mesada > 0){
            doce = valorAleatorio();
            quantidadeDoces +=1;

            if(doce > mesada){
                doce = mesada;
            }

            System.out.println("Valor do doce: " + doce);
            mesada -= doce;
        }
        
        System.err.println("Quantidade de doces : "+ quantidadeDoces);
        System.err.println("Mesada Atual: "+ mesada);
    
    }

    public static double valorAleatorio(){
        return  ThreadLocalRandom.current().nextDouble(2,8);
    }
}
