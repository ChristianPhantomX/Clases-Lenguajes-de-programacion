/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenes_lenguajes;
public class Cronometro {
   



    public static void main(String[] args) {
        int horas = 0;
        int minutos = 0;
        int segundos = 0;

        try {
            while (true) {
                
                System.out.printf("%02d:%02d:%02d\r", horas, minutos, segundos);
                Thread.sleep(1000); 

                segundos++;
                if (segundos == 60) {
                    segundos = 0;
                    minutos++;
                }
                if (minutos == 60) {
                    minutos = 0;
                    horas++;
                }
            }
        } catch (InterruptedException e) {
            System.out.println("El cronómetro se detuvo.");
        }
    }
}


