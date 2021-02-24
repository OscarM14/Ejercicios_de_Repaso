/*
 Pedir los coeficientes de una ecuacion de 2Grado, y muestre susu reales. si no existen
debe indicarlo
ax^2+bx+c
 */
package libro.Unidad1.Ejercicios_Parte1;
import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class Cuadratica {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        
        double a,b,c;
        double d,x1,x2;
        
        System.out.println("Introduzca el primer coeficiente: ");
        a = scanner.nextDouble();
        
        System.out.println("Introduzca el segundo coeficiente: ");
        b = scanner.nextDouble();
        
        System.out.println("Introduzca el tercer coeficiente: ");
        c = scanner.nextDouble();
        
        d = (b*b)-(4*a*c);
        if(d<0)
        {
            System.out.println("No existen soluciones reales");
        }
        else
        {
            x1 = (-b + Math.sqrt(d)) / 2 * a;
            x2 = (-b + Math.sqrt(d)) / 2 * a;
            System.out.println("Solucion: "+ x1);
            System.out.println("Solucion: "+ x2);
        }
        
    }
    
}
