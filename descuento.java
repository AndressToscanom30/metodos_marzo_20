import java.util.Scanner;

public class descuento {

    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);

        System.out.print("Precio inicial: ");
        float precio = e.nextFloat();
        System.out.print("Descuento: ");
        float descuento = e.nextFloat();
        
        System.out.println("El precio con descuento es: " + hacerDescuento(precio, descuento));
     
        e.close();
        
    }

    public static float hacerDescuento(float precio, float descuento) {
        
        
        float descuentoAplicado = precio * (descuento / 100);
        float precioFinal = precio - descuentoAplicado;
        
        return precioFinal;
        
    }
}
