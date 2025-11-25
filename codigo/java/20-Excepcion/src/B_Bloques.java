/*
Múltiples Bloques catch
Si hay diferentes tipos de excepciones, puedes usar múltiples bloques catch
*/

public class B_Bloques {
    public static void main(String[] args) {
        try {
            String texto = null;
            System.out.println(texto.length()); // Esto causará NullPointerException
            int reultado = 10 / 0; // Esto causará una ArithmeticException
        } catch (NullPointerException e) {
            System.out.println("Error: Intento de acceder a un objeto nulo." );
        } catch (ArithmeticException e) {
            System.out.println("Error: División entre cero.");
        }

    }
}

