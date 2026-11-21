/**
 * @author Erick Abel Casamin Ramirez
 */
package matriz;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[12];
        
        System.out.println("Ingrese 12 números positivos:");
        for (int i = 0; i < 12; i++) {
            System.out.print("Número para la posición " + i + ": ");
            int ingreso = scanner.nextInt();
            numeros[i] = ingreso + i; // Suma el índice al valor ingresado
        }
        
        System.out.println("\n--- Arreglo Modificado ---");
        for (int i = 0; i < 12; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
    }
}