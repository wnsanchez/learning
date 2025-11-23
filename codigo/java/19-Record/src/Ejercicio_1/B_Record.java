
/*
Clase Record
Genera automáticamente
- Campos (variables de instancia)
- Constructores
- Getters
- equals(), hashCode(), toString()
Un record protege datos igual que una clase inmutable:
 una vez creado, no puedes cambiar sus atributos.

 */

package Ejercicio_1;


public record B_Record(String nombre, double precio) {
}
/*
Molde
┌──────────────────────┐
│ Producto: "Laptop"   │
│ Precio: 1500.0       │
└──────────────────────┘

 */

