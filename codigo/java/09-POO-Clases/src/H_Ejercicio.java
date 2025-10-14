/*
Ejercicio: Sistema de notificaciones

 */

public class H_Ejercicio {
    // Método abstracto
    abstract static class Notificacion {
        String mensaje;

        public Notificacion(String mensaje) {
            this.mensaje = mensaje;
        }

        abstract void enviar();
    }

    // Clase interna
    class NotificacionInterna extends Notificacion {
        public NotificacionInterna(String mensaje) {
            super(mensaje);
        }

        @Override
        void enviar() {
            System.out.println("Notificación Interna: " + mensaje);
        }

    }

    public static void main(String[] args) {
        H_Ejercicio app = new H_Ejercicio();

        // Usando la clase interna
        Notificacion interna = app.new NotificacionInterna("Reunión a las 3 PM");
        interna.enviar();

        // Usando clase anónima
        Notificacion anonima = new Notificacion("Correo urgente") {
            @Override
            void enviar() {
                System.out.println("Enviando correo: " + mensaje);
            }
        };
        anonima.enviar();

        Notificacion anonimaDos = new Notificacion("Tu saldo es bajo") {
            @Override
            void enviar() {
                System.out.println("Enviando SMS: " + mensaje);
            }
        };
        anonimaDos.enviar();
    }
}
