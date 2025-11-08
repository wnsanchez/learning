/*
GETTER INMUTABLE
Un objeto inmutable es aquel que no puede cambiar su estado después de ser creado.
*/
class Direccion {
    private String ciudad;

    public Direccion(String ciudad) {
        this.ciudad = ciudad;
    }

    public Direccion(Direccion otra) {
        this.ciudad = otra.ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return ciudad;
    }
}

public class G_Inmutable {
    // Clase Persona
    public static final class Persona {
        private final String nombre; // String = inmutable
        private final int edad; // Primitivo = se copia por valor
        private final int[] notas; // Array = mutable
        private final Direccion direccion; // Objeto mutable personalizado

        // Constructor
        public Persona(String nombre, int edad, int[] notas, Direccion direccion) {
            this.nombre = nombre; // String es inmutable
            this.edad = edad; // primitivo
            this.notas = notas.clone(); // copia defensiva (array mutable) | referencia
            this.direccion = new Direccion(direccion); // copia defensiva (objeto mutable)

        }

        // Getters
        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }

        public int[] getNotas() {
            return notas.clone(); // Devolver copia defensiva
        }

        public Direccion getDireccion() {
            return new Direccion(direccion); // devolver copia del objeto mutable
        }

        /*
        public int[] getNotas() {
            return notas; // Devolver referencia
        }

        public Direccion getDireccion() {
            return direccion;
        } // Esto devuelve referencia
        */
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Nombre: ").append(nombre)
                    .append(", Edad: ").append(edad)
                    .append(", Notas: [");
            for (int i = 0; i < notas.length; i++) {
                sb.append(notas[i]);
                if (i < notas.length - 1) sb.append(", ");
            }
            sb.append("], Dirección: ").append(direccion);
            return sb.toString();
        }

    }
    public static void main(String[] args) {
        int[] notasOriginales = {10, 9, 8};
        Direccion direccionOriginal = new Direccion("Madrid");

        Persona p = new Persona("Ana", 25, notasOriginales, direccionOriginal);

        System.out.println("Antes de modificar:");
        System.out.println(p);

        // 🔸 Intentamos cambiar el array original
        notasOriginales[0] = 0;

        // 🔸 Intentamos cambiar la dirección original
        direccionOriginal.setCiudad("Barcelona");

        // 🔸 Intentamos cambiar el array que devuelve el getter
        int[] notasDelGetter = p.getNotas();
        notasDelGetter[1] = 0;

        // 🔸 Intentamos cambiar la dirección obtenida del getter
        Direccion dirDelGetter = p.getDireccion();
        dirDelGetter.setCiudad("Valencia");


        System.out.println("\nDespués de intentar modificar:");
        System.out.println(p);
        System.out.println(direccionOriginal.getCiudad());

    }
}
