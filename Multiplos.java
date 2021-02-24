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
public class Multiplos {
    public static void main(String[]args)
    {
      Scanner scanner = new Scanner(System.in);
      
      int numero1;
      int multiplo;
      
      System.out.print("Ingrese un numero : ");
      numero1 = scanner.nextInt();
      
      System.out.print("Ingrese un multiplo : ");
      
      multiplo = scanner.nextInt();
      if(numero1 % multiplo ==0)
      {
          System.out.println("Es multiplo");
      }
      else
      {
          System.out.println("No es multiplo");
      }
      
        
     
    }
    
}
