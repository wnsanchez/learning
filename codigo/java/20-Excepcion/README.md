# ROADMAP

# PARTE 20: EXCEPCIONES
Una excepción es un evento que ocurre durante la ejecución de un programa y que interrumpe su flujo normal.

>> Java detiene el programa y muestra un error… a menos que tú manejes esa situación.

## 1. Sintaxis
### Forma básica
```
try {
    // Código que puede generar excepción
} catch (TipoDeExcepcion e) {
    // Código para manejar l excepción
}
```

### Múltiples bloques
```
try {
    // Código riesgoso
} catch (IOException e) {
    // Menejar IOException
} catch (Exception e) {
    // Manejar cualquier otra exception
}
```

### Bloque `finally`
Se ejecuta siempre
```
try {
    // Código riesgoso
} catch (IOException e) {
    System.out.println("Ocurrió un error");
} finally {
    System.out.println("Este bloque siempre se ejecuta");
}
```

### Excepciones manualmente `throw`
Sirve para lanzar una excepción dentro del cuerpo de un método.

> Tú decides exactamente dónde y por qué lanzarla.

Donde se usa:
 - Dentro de un método
 - Dentro de un if, un bloque lógico, una validación
 - Para detener el método c[README.md](README.md)uando algo no cumple una regla

```
throw new TipoDeExcepcion("Mensaje");
```

**⭐ throw = lanza** |
“LANZO la excepción ahora mismo”.

### Excepciones en métodos `throws`
Se coloca en la firma del método para indicar que el método puede lanzar una excepción.

Sirve como advertencia a quién llame al método
> “Ojo: este método puede lanzar esta excepción. Si la llamas, deberás manejarla con try/catch o volver a declararla.”

```
public void metodo() throws TipoDeExcepcion {
    // código
}
```
**⭐ throws = aviso** |
“AVISO que este método puede lanzar esta excepción”.

## 2. Jerarquía de Excepciones
Todas las excepciones derivan de `Throwable`, y bajo él hay dos grandes ramas:
```php
                Throwable
                /       \
         Exception     Error
```
  * Como programador, tú manejas la rama de Exception
  * La rama de Error no la manejas (problemas graves del sistema: memoria, JVN, etc).

### Rama Exception
Dentro de `Exception` hay dos tipos fundamentales:
```
Exception
   |
   +-- Checked Exceptions  (se deben manejar sí o sí)
   |
   +-- Unchecked Exceptions (RuntimeException)

```

#### A. Checked Exception (Obligatorias)
Son excepciones que el programador debe manejar porque representan fallos esperados del entorno.
Ejemplos:
  * `IOException` (fallos al leer archivos / red)
  * `SQLException` (BD)
  * `ClassNotFoundException`
  * `FileNotFoundException`

El compilador exige que uses `try/catch` o declares `throws`.

> Si usas un método que trabaja con recursos externos (archivos, red, BD), es casi seguro que lanza checked exceptions.

#### B. Unchecked Exception (RuntimeException)
Estas reflejan `errores de programación`:
  * `NullPointerException`
  * `ArithmeticException`
  * `IndexOutOfBoundsException`
  * `IllegalArgumentException`

El compilador **no exige** manejarlas porque normalmente deberían corregirse en el código.

> Se manejan solo si quieres dar un mensaje más amigable o continuar el programa.

### Importancia de Jerarquía
El orden de los bloques `catch` importan.

Ejemplo incorrecto:

```
try {
    // ...
} catch (Exception e) {
    // Este atrapa todo
} catch (ArithmeticException e) {
    // ERROR: nunca se alcanzará
}
```

Ejemplo correcto:
```
try {
    // ...
} catch (ArithmeticException e) {
    // Este atrapa todo
} catch (Exception e) {
    // ERROR: nunca se alcanzará
}
```

> De lo más específico a lo más general.

### Subclases comunes 
```
Exception
   |
   +-- IOException
   |      |
   |      +-- FileNotFoundException
   |
   +-- SQLException
   |
   +-- RuntimeException
          |
          +-- NullPointerException
          +-- ArithmeticException
          +-- IllegalArgumentException
          +-- IndexOutOfBoundsException
```

Lo importante es reconocer:

* Si hereda de **RuntimeException → unchecked**
* Si NO hereda de RuntimeException → **checked**

#### ***Notas:***
  * ✔ Si la excepción extiende RuntimeException → UNCHECKED | ➡ No necesitas throws

  * ✔ Si la excepción extiende Exception (pero no RuntimeException) → CHECKED | ➡ Necesitas throws o try/catch

***Pregúntate “¿Esto es un error del programador o del entorno?”***

| Si es...                                | Tipo      |
| --------------------------------------- | --------- |
| ❌ Error de programación                 | UNCHECKED |
| 🌐 Error del entorno (archivo, red, BD) | CHECKED   |


