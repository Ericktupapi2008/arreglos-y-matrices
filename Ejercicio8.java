/**
 * @author Erick Abel Casamin Ramirez
 */
package matriz;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int sumaDiagonal = 0;
        
        System.out.println("Ingrese los elementos para una matriz de 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("\n--- Elementos de la Diagonal Principal ---");
        for (int i = 0; i < 4; i++) {
            System.out.println("Posición [" + i + "][" + i + "]: " + matriz[i][i]);
            sumaDiagonal += matriz[i][i];
        }
        
        System.out.println("\nSuma de la diagonal principal: " + sumaDiagonal);
    }
}