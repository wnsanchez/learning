/*
PARTE 4: OPERADORES
- Unarios: ++, --
- Lógicos: <, >, !=, ==. >=, <=
- Aritméticos: +, -, *, /
*/


public class A_Operadores {
    public static void main(String[] args) {
        // Variables
        var a = 8;
        var b = 4;
        var c = 1;
        var d = 6;

        // ARITMÉTICO
        System.out.println("ARITMÉTICO");
        System.out.println(a + b); // Suma
        System.out.println(a - b); // Resta
        System.out.println(a * b); // Multiplicación
        System.out.println(a / b); // División
        System.out.println(a % b); // Módulo


        // ASIGNACIÓN
        System.out.println("ASIGNACIÓN");
        a = c; // Igual
        System.out.println(a);
        a = b * 2;
        System.out.println(a);
        a += 2; // a = a + 2
        System.out.println(a);
        a -= 2; // a = a - 2
        System.out.println(a);
        a *= 2; // a = a * 2
        System.out.println(a);
        a /= 2; // a = a / 2

        // COMPARACIÓN (Relacional)
        System.out.println("COMPARACIÓN");
        System.out.println("Comparación:");
        System.out.println(a == b); // Igual
        System.out.println(a >= b); // Mayor o igual
        System.out.println(a <= b); // Menor o igual
        System.out.println(a < b); // Menor
        System.out.println(a != b); // Distinto

        // LÓGICOS
        System.out.println("LÓGICOS");
        System.out.println(true && true); // AND | &&
        System.out.println(true || false); // OR | ||
        System.out.println(!true); // NOT | !8
        System.out.println(!(3 > 2) && (5 < 4));

        // UNARIOS
        System.out.println("UNARIOS");
        System.out.println(+c);
        System.out.println(-c);
        System.out.println(d); // Valor 6
        System.out.println(++d); // Incremento al imprimirse
        System.out.println(d++); // Incrementa después de imprimirse
        System.out.println(d);
        System.out.println(--d); // Decremento al imprimirse
        System.out.println(d--); // Decrementa después de imprimirse
        System.out.println(d);

        // EXTRA
        System.out.println("EXTRA");
        var saludo = "Mundo";
        var numero = 4;
        System.out.println("Hola " + saludo); // Concatenación
        System.out.println("Hola " + numero);
        System.out.println("Hola " + 4);

    }
}
