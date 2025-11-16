import Paquete_1.ClaseA;
import Paquete_1.ClaseB;
import Paquete_2.ClaseC;

public class Menu {
    public static void main(String[] args) {
        ClaseA claseA = new ClaseA();
        ClaseB claseB = new ClaseB();
        ClaseC claseC = new ClaseC();

        System.out.println("=== CLASE C ===");
        claseA.mostrarAtributo();

        System.out.println("=== CLASE B ===");
        claseB.probarAccesoB();

        System.out.println("=== CLASE C ===");
        claseC.probarAccesoC();
        //claseC.metodoProtetec(); // no se puede acceder desde aquí
    }
}
