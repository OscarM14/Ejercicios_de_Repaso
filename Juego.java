/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.Unidad1.Ejercicios_Parte1;
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar
 */
public class Juego {
    public static void main (String[]args)
    {
         int numero,aleatorio,contador = 0;
        
        aleatorio = (int)(Math.random()*10);//generamos numeros aleatorios del 0-100
    
    do{
    numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
    if(aleatorio>numero)
    {
        System.out.println("Digitr un numero mayor");
    }
    else
    {
        System.out.println("Digite un numero menor");
    }
    contador ++;
    }while(numero != aleatorio);
    System.out.println("/nGenial! Adivinaste el numero en: "+contador+"Intentos");
       
    }
}
