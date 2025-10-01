public class C_Ejercicios {
    public static void main(String[] args) {
        // Variables
        int edad = 18;
        int numeroA = 10;
        int numeroB = 4;
        int numeroNegativo = -4;
        int dia = 4;
        int nota = 50;
        char vocal = 'A';


        System.out.println("____________________________________________________");
        System.out.println("                    EJERCICIOS                     ");
        System.out.println("====================================================");


        // 1. Establece la edad de un usuario y muestra si puedes votar (Mayor o igual a 18)
        System.out.println("===| Ejercicio 1: Votación");
        System.out.println("""
                System.out.print("Resultado: ");
                        if (edad >= 18) {
                            System.out.println("Puede votar");
                        } else {
                            System.out.println("No puedes votar");
                        }
                """);
        System.out.print("Resultado: ");
        if (edad >= 18) {
            System.out.println("Puede votar");
        } else {
            System.out.println("Puedes votar");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales
        System.out.println("\n===| Ejercicio 2: Comparación");
        System.out.println("""
                if (numeroA == numeroB) {
                            System.out.println("Los números son iguales");
                        } else if (numeroA > numeroB) {
                            System.out.println("El número " + numeroA + " es mayor");
                        } else {
                            System.out.println("El número " + numeroB + " es mayor");
                        }
                """);
        System.out.print("Resultado: ");
        if (numeroA == numeroB) {
            System.out.println("Los números son iguales");
        } else if (numeroA > numeroB) {
            System.out.println("El número " + numeroA + " es mayor");
        } else {
            System.out.println("El número " + numeroB + " es mayor");
        }

        // 3. Dado un número verifica si es positivo, negativo o cero
        System.out.println("\n===| Ejercicio 3: Verificación");
        System.out.println("""
                if (numeroNegativo > 0) {
                            System.out.println("Este número es positivo");
                        } else if (numeroNegativo < 0) {
                            System.out.println("Este número es negativo");
                        } else {
                            System.out.println("Es cero");
                        }
                """);
        System.out.print("Resultado: ");
        if (numeroNegativo > 0) {
            System.out.println("Este número es positivo");
        } else if (numeroNegativo < 0) {
            System.out.println("Este número es negativo");
        } else {
            System.out.println("Es cero");
        }

        // 4. Crea un programa que diga si es un número es par o impar
        System.out.println("\n===| Ejercicio 4: Par o Impar");
        System.out.println("""
                if (numeroA % 2 == 0) {
                            System.out.println("Este número es par");
                        } else {
                            System.out.println("Este número es impar");
                        }
                
                """);
        System.out.print("Resultado: ");
        if (numeroA % 2 == 0) {
            System.out.println("Este número es par");
        } else {
            System.out.println("Este número es impar");
        }

        // 5. Verifica si un número está en el rango de 1 a 100
        System.out.println("\n===| Ejercicio 5: Rango");
        System.out.println("""
                if (numeroB >= 1 && numeroB <= 100) {
                            System.out.println("Este número está dentro del rango");
                        } else {
                            System.out.println("No está en el rango");
                        }
                """);
        System.out.print("Resultado: ");
        if (numeroB >= 1 && numeroB <= 100) {
            System.out.println("Este número está dentro del rango");
        } else {
            System.out.println("No está en el rango");
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch
        System.out.println("\n===| Ejercicio 6: Rango");
        String diaSemana = """
                switch (dia) {
                            case 1:
                                System.out.println("Lunes");
                                break;
                            case 2:
                                System.out.println("Martes");
                                break;
                            case 3:
                                System.out.println("Miércoles");
                                break;
                            case 4:
                                System.out.println("Jueves");
                                break;
                            case 5:
                                System.out.println("Viernes");
                                break;
                            case 6:
                                System.out.println("Sábado");
                                break;
                            case 7:
                                System.out.println("Domingo");
                                break;
                            default:
                                System.out.println("Día inválido. Debe estar entre 1 y 7");
                        }
                """;
        System.out.println(diaSemana);
        System.out.print("Resultado: ");
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día inválido. Debe estar entre 1 y 7");
        }

        // 7. Simula un sistema de notas de 0 - 100
        System.out.println("\n===| Ejercicio 7: Notas");
        String evalNotas = """
                if (nota == 100) {
                            System.out.println("Excelente. Estás aprobado");
                        } else if (nota >= 50) {
                            System.out.println("Estás aprobado");
                        } else {
                            System.out.println("Estás desaprobado");
                        }
                
                """;
        System.out.println(evalNotas);
        System.out.print("Resultado: ");
        if (nota == 100) {
            System.out.println("Excelente. Estás aprobado");
        } else if (nota >= 50) {
            System.out.println("Estás aprobado");
        } else {
            System.out.println("Estás desaprobado");
        }



        // 8. Crea un programa que diga si una letra es vocal o consonante
        System.out.println("\n===| Ejercicio 8: Letra");
        String evalLetra = """
                vocal = Character.toLowerCase(vocal); 
                if (vocal ==  'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u' ) {
                            System.out.println(vocal + " es una vocal");
                        } else if (Character.isLetter(vocal)) {
                            System.out.println(vocal + " es una consonante");
                        } else {
                            System.out.println("No es una letra válida");
                        }
                """;
        System.out.println(evalLetra);
        System.out.println("Resultado: ");
        vocal = Character.toLowerCase(vocal); // Convierte a minúsculas
        if (vocal ==  'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u' ) {
            System.out.println(vocal + " es una vocal");
        } else if (Character.isLetter(vocal)) {
            System.out.println(vocal + " es una consonante");
        } else {
            System.out.println("No es una letra válida");
        }













    }
}
