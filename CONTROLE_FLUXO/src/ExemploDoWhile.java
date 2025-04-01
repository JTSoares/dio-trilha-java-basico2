public class ExemploDoWhile {
    public static void main(String[] args) {
        //Do While -> Faça Enquanto
        //Testa a condição após executar o código, será executado pelo menos uma vez

        System.err.println("Discando...");
        int contador = 10;

        do { 
            contador -= 1; 
            System.err.println("Contador atual: "+ contador);    
        } while (contador > 5);

    }
    
}
