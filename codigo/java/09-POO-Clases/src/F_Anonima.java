/*
CLASES ANÓNIMAS
- Es una clase sin nombre que se declara e instancia al mismo tiempo
- Se usa para sobreescribir métodos de una clase o interfaz existente
- Usado para una implementación rápida que no se utilizará
 */
interface Saludo {
    void decirHola();
}

public class F_Anonima {
    public static void main(String[] args) {
        Saludo s = new Saludo() {
            @Override
            public void decirHola() {
                System.out.println("¡Hola desde una clase anónima!");
            }
        };

        s.decirHola();
    }
}
