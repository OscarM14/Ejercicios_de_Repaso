/*
 Pedir el radio de una circuferencia y calcular su magnitud

 */
package libro.Unidad1.Ejercicios_Parte1;
import java.util.Scanner;
/**
 *
 * @author Oscar
 */
public class Circunferencia {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        
        double c,r;
        
        System.out.println("Capture el radio del circulo: ");
        r = scanner.nextDouble();
        
        c = 2 * Math.PI * r;
        System.out.println("La circuferencia es : "+c);
    }
    
    
}
