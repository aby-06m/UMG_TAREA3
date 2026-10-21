/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.javafundamentals;

/**
 *
 * @author mrph0
 */
import java.util.Scanner;

public class Saludar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. Definir la variable (String en lugar de Caracter)
        String nombre;
        
        // 2. Escribir en pantalla
        System.out.println("Por favor ingrese su nombre");
        
        // 3. Leer el texto desde el teclado
        nombre = sc.nextLine();
        
        // 4. Imprimir concatenando con el símbolo +
        System.out.println("Bienvenido al sistema " + nombre);
        
        sc.close(); // Siempre es buena práctica apagar el escáner
    }
}
