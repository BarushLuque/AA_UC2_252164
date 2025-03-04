/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ordenamiento.ordenamientos;

import static com.ordenamiento.ordenamientos.Burbuja.burbuja;

/**
 *
 * @author BarushCamargo
 */
public class Ordenamientos {
    // Método de impresión del arreglo
    public static void imprimirArreglo(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] datos = {64, 25, 12, 22, 11};
        
        System.out.println("Arreglo original:");
        imprimirArreglo(datos);
        
        // Ordenamiento Burbuja
        int[] datosOrdenados = datos.clone();
        burbuja(datosOrdenados);
        System.out.println("Ordenado por Burbuja:");
        imprimirArreglo(datosOrdenados);
    }
}
