/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.javafundamentals.condicionales;

import java.util.Scanner;

public class VerificarNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escriba la nota del alumno:");
        // En Java declaramos e inicializamos en la misma línea
        int nota = sc.nextInt(); 
        
        // Estructura Condicional
        if (nota >= 61) {
            System.out.println("Aprobo");
        } else {
            System.out.println("Reprobo");
        }
        
        sc.close();
    }
}

