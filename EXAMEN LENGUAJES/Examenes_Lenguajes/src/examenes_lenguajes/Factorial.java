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
   
import java.math.BigInteger;
public class Factorial {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = sc.nextInt();

        BigInteger factorial = BigInteger.ONE;

        for (int i = 1; i <= numero; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println("El factorial de " + numero + " es:");
        System.out.println(factorial);
    }
}




