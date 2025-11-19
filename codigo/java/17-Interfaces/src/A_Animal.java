/*
INTERFACES
- Una interfaz es un contrato que obliga a una clase a implementar ciertos métodos
- Una interfaz no tiene lógica, solo define que métodos deben existir, no como funcionan
- Usos:
    * Para permitir polimorfismo y desacoplar el código
    * Puedes tratar objetos de distintas clases como si fueran del mismo tipo.
- No almacena estado (no tiene atributos normales)
- Métodos sin cuerpo (y default desde Java 8)
- Una clase puede implementar varias interfaces

*/

public interface A_Animal {
    public void hacerSonido(); // Toda clase que sea Animal debe tener un método hacerSonido
}
