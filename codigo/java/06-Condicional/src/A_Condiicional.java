/*
PARTE 6: CONDICIONALES
- Estructura if, else if, else
- Ejemplo de estructura
*/

public class A_Condiicional {
    public static void main(String[] args) {
        // Variables
        int edadMayor = 20;
        int edadMenor = 10;

        System.out.println("____________________________________________________");
        System.out.println(" **** CONDICIONALES ****");

        // Condicional if
        System.out.println("===| IF |===");
        System.out.println("Simple condición:");
        String simpleIf = """
                if (ageMayor >= 18) {
                            System.out.println("Eres mayor de edad");
                        }
                """;
        System.out.println(simpleIf);
        System.out.print("Resultado: ");
        if (edadMayor >= 18) {
            System.out.println("Eres mayor de edad");
        }

        // Condicional if - else if
        System.out.println("\n===| ELSE IF |===");
        System.out.println("Else-if condición");
        String medioIf = """
                if (edadMenor >= 18) {
                            System.out.println("Eres mayor de edad");
                        } else if (edadMenor < 18) {
                            System.out.println("Eres menor de edad");
                        }
                """;
        System.out.println(medioIf);
        System.out.print("Resultado: ");
        if (edadMenor >= 18) {
            System.out.println("Eres mayor de edad");
        } else if (edadMenor < 18) {
            System.out.print("Eres menor de edad");
        }

        // Condiciona else
        System.out.println("\n===| ELSE |===");
        System.out.println("Else condición");
        String completoIf = """
                if (edadMenor > 18){
                            System.out.println("El usuario es mayor de edad");
                        } else if (edadMenor == 18) {
                            System.out.println("El usuario acaba de cumplir 18");
                        } else {
                            System.out.println("El usuario es menor de edad");
                        }
                """;
        System.out.println(completoIf);
        System.out.print("Resultado: ");
        if (edadMenor > 18){
            System.out.println("El usuario es mayor de edad");
        } else if (edadMenor == 18) {
            System.out.println("El usuario acaba de cumplir 18");
        } else {
            System.out.println("El usuario es menor de edad");
        }

    }
}
