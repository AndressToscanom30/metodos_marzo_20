import java.util.Scanner;

public class dolaresEuros {

    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        
        System.out.print("Cuantos dolares quieres cambiar?: ");
        double dolar = e.nextDouble();
        
        System.out.println(dolar + " dolares son " + cambio(dolar) + " euros.");
        
        e.close();

    }
    
    public static double cambio (double dolar){
        
        return dolar * 1.33250;
        
    }
    
}
