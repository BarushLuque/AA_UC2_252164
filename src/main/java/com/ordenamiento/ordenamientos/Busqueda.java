/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ordenamiento.ordenamientos;

/**
 *
 * @author zBook
 */
public class Busqueda {
    // Branch branch
    //Metodo burbuja
    public static void burbuja(int[] arr) {
        int n = arr.length; // obtiene longitud en n
        for (int i = 0; i < n - 1; i++) {
            // n-1 sirve para no hacer iteraciones innecesarias, es decir, romper el bucle
            for (int j = 0; j < n - i - 1; j++) {
                //se encarga de comparar e intercambiar los elementos del arreglo.
                if (arr[j] > arr[j + 1]) {
                    // Intercambiar elementos
                    int temp = arr[j]; // guarda el valor para que no se pierda en el intercambio
                    arr[j] = arr[j + 1]; //sobrescribe el valor original de arr[j]
                    arr[j + 1] = temp; //Coloca el valor original en la posición j + 1
                }
            }
        }
    }
}
