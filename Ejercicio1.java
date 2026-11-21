/**
 * @author Erick Abel Casamin Ramirez
 */
package matriz;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número para la posición " + i + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        System.out.println("\n--- Valores Almacenados ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Posición " + i + ":" + numeros[i]);
        }
    }
}