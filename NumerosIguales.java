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
public class NumerosIguales {
    public static void main(String[]args)
    {
      Scanner sc = new Scanner(System.in);
      
      int n1,n2;
      
      System.out.print("Ingrese un numero : ");
      n1 = sc.nextInt();
      
      System.out.print("Ingrese un numero : ");
      n2 = sc.nextInt();
      
      if(n1==n2)
      {
          System.out.println("Son Iguales");
      }
      else
      {
          System.out.println("Sin diferentes");
      }
    }
    
}
