public class formatadorCepExemplo {
    public static void main(String[] args) {

        try {
            String cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);
        } catch (CepInvalido e) {
            // TODO Auto-generated catch block
            System.out.println("O cep não corresponde com as regras de negócio");
        }
        
    }

    static String formatarCep(String cep) throws CepInvalido{   //throw lança uma exceção
        if(cep.length() != 8)
            throw new CepInvalido();    //Cria uma nova exceção se a condição nao corresponder a regra

        //simualando cep formatado
        return "23.765-064"; 
    }
    
}
