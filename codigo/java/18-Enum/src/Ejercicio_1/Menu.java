package Ejercicio_1;

public class Menu {
    public static void main(String[] args) {
        Pedido p = new Pedido(101);
        System.out.println(p.estado);

        System.out.println(p);
        p.avanzarEstado();
        System.out.println(p);
        p.avanzarEstado();
        System.out.println(p);
        p.avanzarEstado();
        System.out.println(p);
        p.avanzarEstado();
        System.out.println(p);

    }
}
