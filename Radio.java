/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.Unidad1.Ejercicios_Parte1;
import java.util.Scanner;
/**
 *
 * @author Oscar
 */
public class Radio {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        
        double radio,area;
        
        System.out.println("Capture el radio del circulo: ");
        radio = scanner.nextDouble();
        
       area = Math.PI * (radio * radio);
       System.out.println("El area del circulo es : "+area);
    }
    
}
