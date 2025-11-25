/*
Capturar excepciones específicas (RuntimeException)
 */

package Ejercicio_1;

public class Ejercicio {
    public static void imprimirElemento(int[] arreglo, int indice) {
        try {
            System.out.println(arreglo[indice]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice fuera del rango del arreglo.");
        } catch (NullPointerException e) {
            System.out.println("El arreglo es null.");
        }
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};

        imprimirElemento(numeros, 5); // índice inválido
        imprimirElemento(null, 1); // arreglo null
    }
}
