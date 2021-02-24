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
public class MostrarNumeros {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        
        int num, invertir = 0, div;
        
        System.out.println("Ingrese un numero : ");
        num = sc.nextInt();
        
        while(num>0)
        {
            div = num %10;
            invertir = invertir*10+div;
            num/=10;
        }
        System.out.println("El numero invertido es : "+invertir);
    }
}
