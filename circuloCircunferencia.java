import java.util.Scanner;

public class circuloCircunferencia {

    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        double radio = 1;
        
        System.out.println("Que va a calcular el día de hoy?");
        System.out.println("1. Perimetro de la circunferencia.");
        System.out.println("2. Área del circulo.");
        System.out.println("3. Volumen de la esfera.");
        System.out.print("Calculo escogido: ");
        byte opcion = e.nextByte();
        
        if (opcion < 1 || opcion > 3){
            
            System.out.println("X Opción incorrecta X");
            
        }
        else{
            
            System.out.print("Digite el radio: ");
            radio = e.nextDouble();
            
            System.out.println("El resultado del calculo es: " + calculoARealizar(radio, opcion));
            
        }
        
        e.close();

    }
    
    public static double calculoARealizar (double radio, byte opcion){
        
        double calculo = 1;
        
        switch (opcion) {
            
            case 1:
                calculo = 2 * 3.1416 * radio;
                break;
                
            case 2:
                calculo = 3.1416 * (radio * radio);
                break;
                
            case 3:
                calculo = (4 * 3.1416 * Math.pow(radio, 3)) / 3;
                break;
                
            default:
                break;
                
        }
        
        return calculo;
        
    }
    
}
