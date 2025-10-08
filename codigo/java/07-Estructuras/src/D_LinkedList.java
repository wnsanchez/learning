/*
LINKEDLIST
- LinkedList es una estructura de datos que almacena elementos en una lista doblemente enlazada.
- Forma parte del paquete java.util, y implementa las interfaces List, Deque y Queue.
 */

import java.util.LinkedList;

public class D_LinkedList {
    public static void main(String[] args) {
        System.out.println("____________________________________________________");
        System.out.println(" **** LinkedList ****");
        String datoLinkedList = """
                - Acceso por índice (Lento) -> Recorre por nodo.
                - Rápido en extremos
                - Uso de memoria menos eficiente
                - Nodos:
                    * El valor (dato)
                    * Una referencia al nodo anterior (prev)
                    * Una referencia al nodo posterior (next)
                """;
        System.out.println(datoLinkedList);

        //  Interface List | Igual a ArrayList
        System.out.println("=========| CADENA |=========");
        LinkedList<String> nombres = new LinkedList<>();

        nombres.add("Willian"); // Añadiendo con .add
        nombres.add("Luis");
        nombres.add("Juan");
        nombres.add("Andrea");
        System.out.println("Añadidos: " + nombres);
        nombres.add(1, "David"); // Especificando índice

        System.out.println("Añadido en posición 2: " + nombres); // Lista actual

        System.out.println("Primer elemento: " + nombres.getFirst()); // Accede a elementos
        System.out.println("Primer elemento: " + nombres.getLast()); // Accede a elementos
        System.out.println("Primer elemento: " + nombres.get(3)); // Accede por índice

        nombres.set(2, "Laura"); // Modificación de elemento
        System.out.println("Lista modificada: " + nombres); // Lista actual

        System.out.println("Eliminar elemento: " + nombres.remove(1)); // Eliminando por índice
        System.out.println("Eliminar elemento Andrea: " + nombres.remove("Andrea")); // Eliminando por elemento
        System.out.println("Lista modificada: " + nombres); // Lista actual

        System.out.println("Contiene Laura: " + nombres.contains("Laura")); // Revisar existencia

        System.out.println("Posición de elemento Juan: " + nombres.indexOf("Juan")); // Posición

        System.out.println("Longitud: " + nombres.size()); // Longitud

        nombres.clear(); // Limpiar el LinkedList
        System.out.print("Limpiando: ...");
        System.out.println("Lista actual: " + nombres);

        System.out.println("¿Está vacía?: " + nombres.isEmpty()); // Ver si esta vacía

        // Interface Queue (Cola) | Permite comportarse como una estructura FIFO
        System.out.println("\n=========| ENTEROS |=========");
        LinkedList<Integer> numeros = new LinkedList<>(); // Nuevo LinkedList
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        System.out.println("Añadidos: " + numeros);

        numeros.offer(4); // Agregar al final
        System.out.println("Agregando 4: " + numeros);
        numeros.poll(); // Mira y elimina el primero
        System.out.println("Quitando el primer elemento: " + numeros);
        System.out.println("Ver el primero: " + numeros.peek()); //ver el primero sin quitarlo

        // Interface Deque
        System.out.println("Lista actual: " + numeros);
        numeros.addFirst(1);
        System.out.println("Agregar al principio 1: " + numeros);
        numeros.addLast(5);
        System.out.println("Agregar al fin 5: " + numeros);
        numeros.removeFirst();
        System.out.println("Eliminar el primer: " + numeros);
        numeros.removeLast();
        System.out.println("Eliminar el último: " + numeros);

        /*
        element()	Como peek(), pero lanza excepción si la cola está vacía
        remove()	Como poll(), pero lanza excepción si está vacía
        */

    }
}
