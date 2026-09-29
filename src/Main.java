package org.upiiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Diego Daniel Becerra Tabuyo 3IM1 UPIIZ

public class Main {

    // Metodo principal - main
    public static void main(String[] args) {
        List<Integer> listadoNumeros = new ArrayList<>();
        int opcion = 0;

        while (opcion != 7) {
            opcion = menu();
            switch (opcion) {
                case 1:
                    leerDato(listadoNumeros);
                    break;

                case 2:
                    numerosPares(listadoNumeros);
                    break;

                case 3:
                    cuadradosValores(listadoNumeros);
                    break;

                case 4:
                    int suma = sumaNumeros(listadoNumeros);
                    System.out.println("La suma es: " + suma);
                    break;

                case 5:
                    buscarElemento(listadoNumeros);
                    break;

                case 6:
                    valorMaximo(listadoNumeros);
                    break;

                case 7:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        }
    }


    //Caso 1: Leer el dato
    public static void leerDato(List<Integer> listado) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digita un numero:");
        int numero = sc.nextInt();
        listado.add(numero);
        System.out.println("Número agregado correctamente.");
    }

    //Caso 2: Muestre los numeros pares
    public static void numerosPares(List<Integer> listado) {
        if (listado.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }
        System.out.println("Números pares:");
        for (int i = 0; i < listado.size(); i++) {
            if (listado.get(i) % 2 == 0) {
                int numeroPar = listado.get(i);
                System.out.println(numeroPar);
            }
        }
    }

    // Caso 3: Muestra los cuadrados de cada elemento
    public static void cuadradosValores(List<Integer> listado) {
        if (listado.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }
        System.out.println("Cuadrados de los valores:");
        for (int i = 0; i < listado.size(); i++) {
            int valor = listado.get(i);
            int cuadrado = valor * valor;
            System.out.println(valor + "^2 = " + cuadrado);
        }
    }

    //Caso 4: Suma de los elementos de la lista
    public static int sumaNumeros(List<Integer> listadoNumeros) {
        int suma = 0;
        for (int i = 0; i < listadoNumeros.size(); i++) {
            suma = suma + listadoNumeros.get(i);
        }
        return suma;
    }

    // Caso 5: Busca un valor e indica si existe y en qué posición/índice se encuentra
    public static void buscarElemento(List<Integer> listado) {
        if (listado.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Digita el número que deseas buscar:");
        int buscado = sc.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < listado.size(); i++) {
            if (listado.get(i) == buscado) {
                System.out.println("El número " + buscado + " se encuentra en el índice: " + i);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("El número " + buscado + " no está en la lista.");
        }
    }

    // Caso 6: Encuentra el valor máximo de la lista
    public static void valorMaximo(List<Integer> listado) {
        if (listado.isEmpty()) {
            System.out.println("La lista está vacía. No hay valor máximo.");
            return;
        }

        int maximo = listado.get(0);
        for (int i = 1; i < listado.size(); i++) {
            if (listado.get(i) > maximo) {
                maximo = listado.get(i);
            }
        }
        System.out.println("El valor máximo de la lista es: " + maximo);
    }

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- MENÚ ---");
        System.out.println("1.- Leer datos");
        System.out.println("2.- Muestre numeros pares");
        System.out.println("3.- Muestre los cuadrados de los valores");
        System.out.println("4.- Suma de los elementos de la lista");
        System.out.println("5.- Buscar un elemento de la lista");
        System.out.println("6.- Encontrar el valor maximo");
        System.out.println("7.- Salir");
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();
        return opcion;
    }
}