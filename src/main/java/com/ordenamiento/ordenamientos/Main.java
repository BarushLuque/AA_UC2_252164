/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ordenamiento.ordenamientos;

//import static com.ordenamiento.ordenamientos.Busqueda.burbuja;
import static com.ordenamiento.ordenamientos.Ordenamiento.seleccion;

/**
 *
 * @author BarushCamargo
 */
public class Main {
    // Método de impresión del arreglo
    
    public static void main(String[] args) {
        int[] datos = {64, 25, 12, 22, 11};

        System.out.println("Arreglo original:");
        for (int num : datos) {
            System.out.print(num + " ");
        }
        System.out.println();

        seleccion(datos);

        System.out.println("Ordenado por Ordenamiento de seleccion:");
        for (int num : datos) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
