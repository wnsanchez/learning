import java.util.*;

/*
FOREACH
- Útil en colecciones y arreglos de forma simple y legible
*/
public class B_ForEach {
    public static void main(String[] args) {
        System.out.println("____________________________________________________");
        System.out.println(" **** FOREACH ****");
        String datoForEach = """
                - Se llama enhanced for loop (bucle for mejorado)
                """;
        System.out.println(datoForEach);
        System.out.println("=========| NOMBRES | ARRAYS |=========");
        String[] nombres = {"Will", "Marcos", "Luis"};
        for (String nombre: nombres) {
            System.out.println("Nombre: " + nombre);
        }

        System.out.println("=========| PAÍSES | MAP |=========");
        Set<String> paises = new HashSet<>();
        paises.add("Perú");
        paises.add("Bolivia");
        paises.add("Venezuela");
        for (String pais: paises) {
            System.out.println(pais);
        }

        System.out.println("=========| EMAILS | MAP |=========");
        HashMap<String, String> emails = new HashMap<>();
        emails.put("Will", "will@gmail.com");
        emails.put("José", "jose@gmail.com");
        for (Map.Entry<String, String>  email: emails.entrySet()) {
            System.out.println(email);
        }
    }
}
