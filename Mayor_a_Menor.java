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
public class Mayor_a_Menor {
    public static void main(String[]args)
    {
        
        Scanner sc = new Scanner(System.in); 
        
        
       System.out.println("Ingrese un numero : ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese un numero : ");
        int num2 = sc.nextInt();
        System.out.println("Ingrese un numero : ");
         int num3 = sc.nextInt();
         
         if(num1>num2 && num2>num3)
         {
             System.out.println("Mayor a Menor : "+num1 + ","+num2+","+num3);
         }
         else if(num1>num3 && num3>num2)
         {
             System.out.println("Mayor a Menor : "+num1+","+num3+","+num2);
         }
         else if(num2>num1 && num1>num3)
         {
             System.out.println("Mayor a Menor : "+num2+","+num1+","+num3);
         }
         else if(num2>num3 && num3>num1)
         {
             System.out.println("Mayor a Menor : "+num2+","+num3+","+num1);
         }
         else if(num3>num1 && num1>num2)
         {
             System.out.println("Mayor a Menor: "+num3+","+num1+","+num2);
         }
         else if(num3>num2 && num2>num1)
         {
             System.out.println("Mayor a Menor : "+num3+","+num2+","+num1);
         }
        
    }
}
    

