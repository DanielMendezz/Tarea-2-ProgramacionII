/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porcentaje_estudiantes;

/**
 *Calculo de cantidad de porcentajes de menores de edad 
 * @author DanielMendez
 */
public class Porcentaje_estudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("Calculo de menores de edad que hay en una clase");
        System.out.println("");
        
        //Declaracion de variables
        
        int estudiantes=240;
        int menores=35;
        float porcentaje;
        
        porcentaje=(menores*100)/estudiantes;
        
        System.out.println("El porcentaje de menores de edad en una clase es de:");
        System.out.println(porcentaje);
    }
    
}
