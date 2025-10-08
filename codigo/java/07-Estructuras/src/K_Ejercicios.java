import java.util.*;

public class K_Ejercicios {
    public static void main(String[] args) {
        System.out.println("____________________________________________________");
        System.out.println("                    EJERCICIOS                     ");
        System.out.println("====================================================");

        // 1. Crea un array de 5 enteros e imprime | ARRAYS
        System.out.println("===| Ejercicio 1: Enteros");
        int [] numeroEntero;
        numeroEntero = new int[5];
        numeroEntero[0] = 1;
        numeroEntero[1] = 2;
        numeroEntero[2] = 3;
        numeroEntero[3] = 4;
        numeroEntero[4] = 5;
        System.out.println("Imprime [0]: " + numeroEntero[0]);
        System.out.println("Imprime [1]: " + numeroEntero[1]);
        System.out.println("Imprime [2]: " + numeroEntero[2]);
        System.out.println("Imprime [3]: " + numeroEntero[3]);
        System.out.println("Imprime [4]: " + numeroEntero[4]);

        // 2. Crear una lista países e imprime su longitud | ARRAYS
        System.out.println("===| Ejercicio 2: String");
        String[] paises = {"Perú", "Bolivia", "Brazil"};
        System.out.println("Longitud: " + paises.length);


        // 3. Modifica un valor de paises e imprime el índice
        System.out.println("===| Ejercicio 3: Modificación");
        System.out.println("Valor actual: " + paises[2]);
        paises[2] = "Venezuela";
        System.out.println("Lista modificada: " + paises[2]);

        // 4. Crea un ArrayList vacío.
        System.out.println("===| Ejercicio 4: ArrayList");
        ArrayList<String> listaVacia = new ArrayList<>();
        System.out.println("ArrayList vacío: " + listaVacia);

        // 5. Añade 4 valores al ArrayList y elimina uno a continuación.
        System.out.println("===| Ejercicio 5: ArrayList, añadiendo valores");
        listaVacia.add("Julia");
        listaVacia.add("María");
        listaVacia.add("Andrea");
        System.out.println("Añadidos: " + listaVacia);
        listaVacia.remove("Andrea");
        System.out.println("Lista actual: " + listaVacia);

        // 6. Crea un HashSet con 2 valores diferentes. | HASHSET
        HashSet<String> colores = new HashSet<>();
        System.out.println("===| Ejercicio 6: HashSet, añadiendo valores");
        colores.add("Rojo");
        colores.add("Amarillo");
        System.out.println("Colores: " + colores);
        System.out.println();

        // 7. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        System.out.println("===| Ejercicio 7: HashSet, repetido");
        colores.add("Rojo"); // false (ya existe)
        System.out.println("Repetido: " + colores);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono
        System.out.println("===| Ejercicio 8: HashMap, añadiendo");
        HashMap<String, String> listaTelefonica = new HashMap<>();
        listaTelefonica.put("Julia", "92929292");
        listaTelefonica.put("Andrea", "92838382");
        listaTelefonica.put("Luisa", "938838271");
        System.out.println("lista: " + listaTelefonica);

        // 9. Modifica y elimina un contacto
        System.out.println("===| Ejercicio 9: HashMap, modifica y elimina");
        System.out.println("Lista: " + listaTelefonica);
        listaTelefonica.put("Luisa", "99000000");
        System.out.println("Lista actual: " + listaTelefonica);

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        System.out.println("===| Ejercicio 10: Array hasta Map");
        String[] nombres = {"Willian", "Luis", "Juan", "Miguel"}; // Array
        List<String> listaNombres = new ArrayList<>(Arrays.asList(nombres)); // Array -> ArrayList
        Set<String> setNombres = new HashSet<>(listaNombres); // ArrayList -> Set
        Map<String, String> mapa = new HashMap<>(); // Set a Map
        for (String clave: setNombres) {
            mapa.put(clave, clave);
        }
        System.out.println("Mapa: " + mapa);

    }
}
