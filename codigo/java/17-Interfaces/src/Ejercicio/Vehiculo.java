package Ejercicio;

public interface Vehiculo {

    // Métodos abstractos | Obligatorios
    public void encender();
    public void apagar();
    public void acelerar(int kmh);

    // Métodos default (Opcional)
    default void info() {
        System.out.println("Este objeto es un vehículo operable");
    }

    // Métodos static (no pertenece a objetos) | Global
    public static void guia() {
        System.out.println("Guía general: todos los vehículos deben poder encender y acelerar");
    }

}
