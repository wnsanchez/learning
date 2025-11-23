# ROADMAP

# PARTE 19: Records
Un record es una forma concisa de declarar una clase inmutable orientada a datos.
Genera automáticamente:
 * `private final` en campos(Atributos)
 * constructor completo
 * getters
 * `equals()`
 * `hashCode`
 * `toString`

>> Ideal para data carriers (DTOs, respuestas APIs)

**NOTA:** 
- Si solo tienes datos → record. 
- Si tienes datos + comportamiento → clase.

## 1. equals()
El método equals() heredado de Object solo compara referencias; por eso, para objetos con atributos (estado interno), no sirve si lo que quieres es comparar su contenido.

Para comparar contenido se necesita sobreescribir el método equal() en la clase.

### ***En records***
En records funciona porque ya trae equals() implementado para comparar todos sus campos automáticamente.

## 2. hashCode()
Genera un número basado en la dirección de memoria del objeto (no exactamente la dirección, pero sí un identificador dependiente de ella).

> Aunque tengan los mismos valores, si son distintas instancias → hash diferente

### ***Con equals() | Sobreescrito***
Relación obligatoria con equals():
  * Regla de oro: `Si a.equals(b) es true, entonces a.hashCode() == b.hashCode() debe ser true.`

>> Si sobreescribes equals(), también debes sobreescribir hashCode()

###  ***En records***
En un record, Java genera automáticamente un hashCode() basado en todos sus componentes.
  - Es consistente con equals()
  - Sin riesgo de romper el contrato.
  - Listo para funcionar en HashMap y HashSet


**NOTA:**
  * equals() compara si dos objetos son iguales.
  * hashCode() le dice al mapa dónde buscar el objeto.


## 3. toString()
El método `toString` por defecto (sin sobreescribir) escribe algo inútil
  * NO muestra valores reales
  * No sirve para debug
```ouput
paquete.Persona@a34bd9

[clase]@[hash_de_memoria]
```

Sobreescrito es un método que convierte un objeto en una representación legible en texto.
```ouput
Persona(nombres=Ana, edad=0)
```

### ***En un records***
Los records generan automáticamente un toString() PERFECTO.
```ouput
NombreDeRecord(campo1=valor1, campo2=valor2, ...)
```
Diseñado:
  * Depurar código rápido
  * Ver valores sin escribir código extra
  * Usarse en logs
  * Inspeccionar objetos en consola

>> Es legible, útil, consistente y funciona igual para todos los records.

## DATOS 
### ¿Cuándo SÍ DEBES sobrescribir equals/hashCode?
  * quieres comparar objetos por sus DATOS
  * quieres usar los objetos como KEY en un HashMap
  * quieres ponerlos en un HashSet
  * quieres detectar duplicados lógicamente
  * quieres ordenarlos o filtrarlos por contenido
  * quieres que representen un “valor” (Value Object, DTO, Id, etc.)

### Idea principal
Sin sobrescribirlos:
  *  Java piensa: “Dos objetos SON iguales solo si están en la MISMA dirección en memoria.”

Con sobrescritura:
  *  Java piensa: “Son iguales si tú me dices que lo son según sus valores internos (nombre, edad, etc.).”