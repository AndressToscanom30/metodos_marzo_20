import java.util.Scanner;

public class hhmmss {

    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        
        System.out.println("Vamos a pasar de horas, minutos y segundos, a solo segundos.");
        System.out.print("Horas: ");
        int horas = e.nextInt();
        System.out.print("Minutos: ");
        int minutos = e.nextInt();
        System.out.print("Segundos: ");
        int segundos = e.nextInt();
        
        System.out.println(horas + " horas, " + minutos + " minutos y " + segundos + " segundos, equivalen a " + aSegundos(horas, minutos, segundos) + " segundos.");
        
        e.close();

    }
    
    public static int aSegundos (int horas, int minutos, int segundos){
        
        int horasASegundos = horas * 3600;
        int minutosASegundos = minutos * 60;
        
        int segundosTotal = horasASegundos + minutosASegundos + segundos;
        
        return segundosTotal;
        
    }
    
}
