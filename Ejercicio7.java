/**
 * @author Erick Abel Casamin Ramirez
 */
package matriz;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int sumaTotal = 0;
        
        System.out.println("Ingrese los elementos para una matriz de 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                sumaTotal += matriz[i][j];
            }
        }
        
        System.out.println("\n--- Resultado ---");
        System.out.println("Suma total de todos los elementos: " + sumaTotal);
    }
}