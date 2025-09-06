/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenes_lenguajes;

import java.util.Scanner;

/**
 *
 * @author emmch
 */
public class Celsius_A_F {
    public static void main(String[] arg){
      Scanner sc= new Scanner(System.in);
      
        System.out.println("ingrese la temperatura celsius para fanhrenheit");
        int N= sc.nextInt();
        System.out.println("la temperatura es "+((N*(1.8))+32));
        
    
}
}
