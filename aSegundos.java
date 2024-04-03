import java.util.Scanner;

public class aSegundos {

    public static void main(String[] args) {
        
        Scanner e =  new Scanner(System.in);
        
        System.out.println("Vamos a totalizar días, horas y minutos, en segundos.");
        System.out.print("Días: ");
        int dias = e.nextInt();
        System.out.print("Horas: ");
        int horas = e.nextInt();
        System.out.print("Minutos: ");
        int minutos = e.nextInt();
        
        System.out.println(dias + " dias, " + horas + " horas y " + minutos + " minutos, equivalen a " + convertirASegundos(dias, horas, minutos) + " segundos.");
        
        e.close();

    }
    
    public static int convertirASegundos(int dias, int horas, int minutos) {
        
        int segundosEnDia = 24 * 60 * 60;
        int segundosEnHora = 60 * 60;
        int segundosEnMinuto = 60;
        
        int segundosDias = dias * segundosEnDia;
        int segundosHoras = horas * segundosEnHora;
        int segundosMinutos = minutos * segundosEnMinuto;
        
        int totalSegundos = segundosDias + segundosHoras + segundosMinutos;
        
        return totalSegundos;
        
    }
    
}
