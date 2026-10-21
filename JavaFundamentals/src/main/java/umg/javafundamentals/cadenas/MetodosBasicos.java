/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.javafundamentals.cadenas;

/**
 *
 * @author mrph0
 */
public class MetodosBasicos {
    public static void main(String[] args) {
        // Inicialización básica
        String umg = "UMG";
        String carrera = "Ingenieria en sistemas";
        String cadenaVacia = "";
        
        // Uso de length()
        System.out.println(umg + " tiene " + umg.length() + " caracteres");
        System.out.println(carrera + " tiene " + carrera.length() + " caracteres");
        
        // Uso de charAt()
        String nombre = "Pepito";
        char letra = nombre.charAt(0);
        System.out.println("La primera letra de Pepito es: " + letra);
        
        // Uso de isEmpty()
        System.out.println("¿La cadena está vacía?: " + cadenaVacia.isEmpty());
        
        // Uso de concat()
        String cadena1 = "Algo";
        String cadena2 = "ritmos";
        String union = cadena1.concat(cadena2);
        System.out.println("Palabra concatenada: " + union);
    }
}
