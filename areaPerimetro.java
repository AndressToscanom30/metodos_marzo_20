import java.util.Scanner;

public class areaPerimetro {

    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        
        System.out.print("Cual es la altura?: ");
        double altura = e.nextFloat();
        System.out.print("Cual es la base?: ");
        double base = e.nextFloat();
        
        System.out.println("El area es " + calcularArea(base, altura) + "m , y el perímetro es " + calcularPerimetro(base, altura) + "m.");
        
        e.close();

    }
    
    public static double calcularArea(double base, double altura){
        
        return base * altura;
        
    }
    
    public static double calcularPerimetro(double base, double altura){
        
        return (2 * base) + (2 * altura);
        
    }
    
}