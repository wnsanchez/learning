package Paquete_1;

public class ClaseB {
    public void probarAccesoB() {
        ClaseA claseA = new ClaseA();

        // Acceso dentro del mismo paquete
        System.out.println("Probando clase B: ");
        System.out.println(claseA.atributoPublico);
        System.out.println(claseA.atributoDefault);
        System.out.println(claseA.atributoProtegido);
        //System.out.println(claseA.atributoPrivado); dentro de la misma clase A

        claseA.metodoProtected(); // Accesible dentro del mismo paquete
    }
}
