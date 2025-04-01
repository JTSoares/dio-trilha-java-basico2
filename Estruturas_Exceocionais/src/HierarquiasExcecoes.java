import java.text.NumberFormat;
import java.text.ParseException;

public class HierarquiasExcecoes {
    public static void main(String[] args) {
        Number valor;
        try {
            valor = NumberFormat.getInstance().parse("ai.75");
            System.out.println(valor);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
        
    }
    
}
