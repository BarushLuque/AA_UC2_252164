/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ordenamiento.ordenamientos;

/**
 *
 * @author zBook
 */
public class Ordenamiento {
  /**
 * Método de ordenamiento por selección
 * Recorre el arreglo y encuentra el menor elemento en cada iteración,
 * intercambiándolo con el elemento en la posición actual
 *
 * @param arr Arreglo de enteros a ordenar
 * @return Arreglo ordenado de menor a mayor
 */
public static int[] seleccion(int[] arr) {
    // Recorre el arreglo hasta la penúltima posición
    for (int i = 0; i < arr.length - 1; i++) {
        // Suponemos que el primer elemento del subarreglo es el menor
        int menor = arr[i]; // Guarda el valor del menor elemento encontrado
        int cual = i; // Guarda la posición del menor elemento

        // Recorre la parte no ordenada del arreglo
        for (int j = i + 1; j < arr.length; j++) {
            // Si encontramos un número menor, actualizamos las variables
            if (arr[j] < menor) {
                menor = arr[j]; // Nuevo menor valor encontrado
                cual = j; // Guardamos su posicion
            }
        }

        // Intercambiamos el valor en la posición i con el menor encontrado
        int temp = arr[i]; // Guardamos temporalmente el valor en la posicion i
        arr[i] = menor; // Asignamos el menor valor a la posicion i
        arr[cual] = temp; // Asignamos el valor original de i a la posición donde estaba el menor
    }

    return arr; // Retornamos el arreglo ya ordenado
}
}
