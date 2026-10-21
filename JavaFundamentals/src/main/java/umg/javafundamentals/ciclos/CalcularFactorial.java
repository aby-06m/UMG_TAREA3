/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.javafundamentals.ciclos;

import java.util.Scanner;

/**
 *
 * @author mrph0
 */
public class CalcularFactorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int contador = 1;
        int factorial = 1;
        
        System.out.println("Escriba un numero del cual desea obtener el factorial:");
        int numFactorial = teclado.nextInt();
        
        // PSeInt: Repetir ... Hasta Que
        do {
            factorial = factorial * contador;
            contador = contador + 1;
        } while (contador <= numFactorial); // En Java, repetimos MIENTRAS sea menor o igual
        
        System.out.println("El factorial de " + numFactorial + " es: " + factorial);
        teclado.close();
    }
}
