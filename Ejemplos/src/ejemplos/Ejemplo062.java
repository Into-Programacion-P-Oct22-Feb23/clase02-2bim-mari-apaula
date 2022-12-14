/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author SALA I
 */
public class Ejemplo062 {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
    
        double dato;
        // arreglo de tipo entero
        double[] arreglo1 = new double[5]; //  se guardaran nombres de personas
        
        // Se asigna valores al arreglo, pidiendo valores por teclado
        // se usa un ciclo repetitivo
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.println("Ingrese un valor para el arreglo");
            dato = entrada.nextDouble();
            // se asigna la variable dato a la posición del arreglo
            // de acuerdo al valor de i
            arreglo1[i] = dato;
        }
        
        // Se hace uso del ciclo repetitivo for para recorrer el arreglo
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.printf("Subíndice o Índice %d, con valor %.2f\n",
                    i, arreglo1[i]);
}
