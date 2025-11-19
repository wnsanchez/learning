package Ejercicio;

public class Sistema {
    public static void main(String[] args) {
        Vehiculo.guia(); // método static

        Vehiculo auto = new Auto();
        Vehiculo moto = new Moto();
        Vehiculo bici = new Bicicleta();

        System.out.println("\n--- Probando vehículos ---\n");

        GestorVehiculos.operarVehiculo(auto);
        GestorVehiculos.operarVehiculo(moto);
        GestorVehiculos.operarVehiculo(bici);
    }
}
