/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenes_lenguajes;

/**
 *
 * @author emmch
 */

 import java.util.Scanner;
public class Matrices {
   


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Ingresa el numero de filas: ");
        int filas = sc.nextInt();
        System.out.print("Ingresa el numero de columnas: ");
        int columnas = sc.nextInt();

        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];
        int[][] suma = new int[filas][columnas];

       
        System.out.println("\nIngresa los valores de la primera matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Matriz1[" + i + "][" + j + "] = ");
                matriz1[i][j] = sc.nextInt();
            }
        }

       
        System.out.println("\nIngresa los valores de la segunda matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Matriz2[" + i + "][" + j + "] = ");
                matriz2[i][j] = sc.nextInt();
            }
        }

       
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

       
        System.out.println("\nLa matriz resultante (suma) es:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(suma[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

    

