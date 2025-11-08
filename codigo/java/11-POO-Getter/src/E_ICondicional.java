/*
GETTER CON LÓGICA ADICIONAL
- Un getter condicional es un getter que no devuelve directamente el valor del atributo, sino que evalúa una condición antes de decidir qué devolver.
- Necesitas controlar la salida
- Quieres validar o formatear datos antes de devolverlos
- Desea proteger la lógica interna de tu clase
*/

class Producto{
    // Variables
    private double precio;

    // Constructor
    public Producto(double precio) {
        this.precio = precio;
    }

    // Getter condicional
    public String getPrecio() {
        if (precio <= 0) {
            return "Precio no disponible";
        } else {
            return String.format("$%.2f", precio);
        }
    }


}

public class E_ICondicional {
    public static void main(String[] args) {
        Producto p1 = new Producto(122.34444);
        Producto p2 = new Producto(25.677);

        System.out.println("Precio 1: " + p1.getPrecio());
        System.out.println("Precio 2: " + p2.getPrecio());
    }
}
