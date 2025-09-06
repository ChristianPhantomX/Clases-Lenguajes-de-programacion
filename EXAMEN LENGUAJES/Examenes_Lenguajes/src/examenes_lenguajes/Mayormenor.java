
package examenes_lenguajes;

import java.util.Scanner;

/**
 *
 * @author emmch
 */
public class Mayormenor {
    public static void main(String[] arg){
      Scanner sc= new Scanner(System.in);
        System.out.println("ingrese numeros");
        int N= sc.nextInt();
        int A= sc.nextInt();
        if (A<N)
            System.out.println("el numero mayor es"+N);
        else
            System.out.println("el numero mayor es"+A);
        

    }
}

   