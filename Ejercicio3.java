/**
 * @author Erick Abel Casamin Ramirez
 */
package matriz;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[15];
        int mayor, menor, posMayor = 0, posMenor = 0;
        
        System.out.println("Ingrese 15 números enteros:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        mayor = numeros[0];
        menor = numeros[0];
        
        for (int i = 0; i < 15; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
                posMayor = i;
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
                posMenor = i;
            }
        }
        
        System.out.println("\n--- Resultados ---");
        System.out.println("Número mayor: " + mayor + " (encontrado en la posición " + posMayor + ")");
        System.out.println("Número menor: " + menor + " (encontrado en la posición " + posMenor + ")");
    }
}