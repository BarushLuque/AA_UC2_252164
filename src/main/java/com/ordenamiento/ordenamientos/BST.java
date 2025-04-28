/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ordenamiento.ordenamientos;

// Clase que representa un Nodo en el árbol BST
class Nodo {
    int valor;
    Nodo izquierdo, derecho;

    public Nodo(int item) {
        valor = item;
        izquierdo = derecho = null;
    }
}

// Clase que implementa el Árbol de Búsqueda Binaria (BST)
public class BST {
    Nodo raiz;

    // Constructor
    public BST() {
        raiz = null;
    }

    // Método público para insertar un valor
    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    // Inserta un valor de manera recursiva
    private Nodo insertarRecursivo(Nodo raiz, int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }
        if (valor < raiz.valor) {
            raiz.izquierdo = insertarRecursivo(raiz.izquierdo, valor);
        } else if (valor > raiz.valor) {
            raiz.derecho = insertarRecursivo(raiz.derecho, valor);
        }
        return raiz;
    }

    // Método público para realizar una búsqueda
    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    // Busca un valor de manera recursiva
    private boolean buscarRecursivo(Nodo raiz, int valor) {
        if (raiz == null) {
            return false;
        }
        if (valor == raiz.valor) {
            return true;
        }
        return valor < raiz.valor
            ? buscarRecursivo(raiz.izquierdo, valor)
            : buscarRecursivo(raiz.derecho, valor);
    }

    // Método público para eliminar un valor
    public void eliminar(int valor) {
        raiz = eliminarRecursivo(raiz, valor);
    }

    // Elimina un valor de manera recursiva
    private Nodo eliminarRecursivo(Nodo raiz, int valor) {
        if (raiz == null) {
            return raiz;
        }
        if (valor < raiz.valor) {
            raiz.izquierdo = eliminarRecursivo(raiz.izquierdo, valor);
        } else if (valor > raiz.valor) {
            raiz.derecho = eliminarRecursivo(raiz.derecho, valor);
        } else {
            // Nodo con un solo hijo o sin hijos
            if (raiz.izquierdo == null)
                return raiz.derecho;
            else if (raiz.derecho == null)
                return raiz.izquierdo;

            // Nodo con dos hijos:
            // Tomamos el sucesor (el menor en el subárbol derecho)
            raiz.valor = valorMinimo(raiz.derecho);

            // Eliminamos el sucesor
            raiz.derecho = eliminarRecursivo(raiz.derecho, raiz.valor);
        }
        return raiz;
    }

    // Método auxiliar para encontrar el valor mínimo de un subárbol
    private int valorMinimo(Nodo raiz) {
        int minimo = raiz.valor;
        while (raiz.izquierdo != null) {
            minimo = raiz.izquierdo.valor;
            raiz = raiz.izquierdo;
        }
        return minimo;
    }

    // Método público para realizar el recorrido inorden
    public void recorridoInorden() {
        recorridoInordenRecursivo(raiz);
    }

    // Imprime los valores en orden ascendente
    private void recorridoInordenRecursivo(Nodo raiz) {
        if (raiz != null) {
            recorridoInordenRecursivo(raiz.izquierdo);
            System.out.print(raiz.valor + " ");
            recorridoInordenRecursivo(raiz.derecho);
        }
    }

    // Método principal main
    public static void main(String[] args) {
        BST arbol = new BST();

        // Insertar valores
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(70);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(60);
        arbol.insertar(80);

        // Imprimir recorrido inorden antes de eliminar
        System.out.println("Recorrido Inorden antes de eliminar:");
        arbol.recorridoInorden();
        System.out.println();

        // Eliminar el nodo con valor 50
        arbol.eliminar(50);
        // Explicación: usamos el SUCESOR (menor del subárbol derecho) para reemplazar al 50.

        // Imprimir recorrido inorden después de eliminar
        System.out.println("Recorrido Inorden despues de eliminar:");
        arbol.recorridoInorden();
        System.out.println();

        // Búsqueda de valores
        System.out.println("Búsqueda de 30: " + (arbol.buscar(30) ? "Encontrado" : "No encontrado"));
        System.out.println("Búsqueda de 50: " + (arbol.buscar(50) ? "Encontrado" : "No encontrado"));
        System.out.println("Búsqueda de 60: " + (arbol.buscar(60) ? "Encontrado" : "No encontrado"));
    }
}
