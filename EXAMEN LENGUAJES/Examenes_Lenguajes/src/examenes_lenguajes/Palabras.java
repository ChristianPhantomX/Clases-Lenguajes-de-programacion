/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenes_lenguajes;

/**
 *
 * @author emmch
 */import java.text.Normalizer;
import java.util.Scanner;

public class Palabras {
    


    private static String normalizar(String texto) {
        String n = Normalizer.normalize(texto, Normalizer.Form.NFD);
        n = n.replaceAll("\\p{M}+", "");         
        n = n.toLowerCase();
        n = n.replaceAll("[^\\p{Alnum}]", "");    
        return n;
    }


    public static boolean alreves(String texto) {
        String s = normalizar(texto);
        if (s.isEmpty()) return false;
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una palabra o numero: ");
        String entrada = sc.nextLine();

        if (alreves(entrada)) {
            System.out.println(" Se lee alrevez.");
        } else {
            System.out.println(" No se lee alrevez.");
        }

       
    }
}
