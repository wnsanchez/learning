public class B_Ejercicios {
    public static void main(String[] args) {
        // Variables
        String textoA = "Python";
        String textoB = "Java";
        String saludo = "Hola ";
        String frase = "    Hello, World    ";
        String primer = "Willian";
        String segundo = "Willian"; // Apunta al mismo objeto de primer
        var otroPrimer = new String("Willian"); // Crea un nuevo objeto con el mismo valor


        System.out.println("____________________________________________________");
        System.out.println("                    EJERCICIOS                     ");
        System.out.println("====================================================");

        // 1. Concatena dos cadenas de texto
        System.out.println("===| Ejercicio 1: Concatenación");
        System.out.println("Concatenación: " + saludo + " " + textoB);

        // 2. Muestra la longitud de una cadena de texto
        System.out.println("===| Ejercicio 2: Longitud de " + textoA);
        System.out.println("Longitud: " + textoA.length());

        // 3. Muestra el primer y último carácter de un String
        System.out.println("===| Ejercicio 3: Caracteres");
        System.out.println("Primer carácter: " + textoA.charAt(0));
        System.out.println("Último carácter: " + textoA.charAt(textoA.length() - 1));

        // 4. Elimina espacios alrededor
        System.out.println("===| Ejercicio 4: Elimina espacios");
        System.out.println("Eliminando: " + frase.trim());

        // 5. Convierte a Mayúscula y minúscula
        System.out.println("===| Ejercicio 5: Formateo");
        System.out.println("Mayúscula: " + frase.toUpperCase().trim()); // Puede usar varios métodos
        System.out.println("Mayúscula: " + frase.toLowerCase().trim());

        // 6. Sustituye todos los espacios en blanco de un string por "-"
        System.out.println("===| Ejercicio 6: Reemplazar");
        System.out.println("Sustitución: " + frase.replace(" ", "-"));

        // 7. Comprobar si dos String son iguales
        System.out.println("===| Ejercicio 7: Comparación");
        System.out.println("Con ==: " + (primer == segundo)); // Apuntan al mismo objeto
        System.out.println("Con ==: " + (primer == otroPrimer)); // Son distintos objetos
        System.out.println("Con equals: " + (primer.equals(otroPrimer))); // Compara contenido

        // 8. Realizar un rebanado
        System.out.println("===| Ejercicio 7: Rebanado");
        System.out.println("Subcadena: " + frase.trim().substring(0, 5));

        System.out.println("____________________________________________________");
    }
}
