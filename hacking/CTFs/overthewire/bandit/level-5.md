# LEVEL 5

## Búsqueda por tamaño
Usando el comando `find` y la opción `size` podemos encontrar fácilmente según tamaño específico

```bash
find . -size <tamaño(unidad)>
```

> `.` es directorio actual o podemos usar `/` una búsqueda a todo el sistema

**Unidades:**
  * c -> bytes
  * k -> kilobytes
  * M -> Megabytes
  * G -> Gigabytes
  * b: bloques de 512 bytes

**Modificadores**
  * `+` -> Mayor que el tamaño especificado
  * `-` -> Menor que el tamaño especificado

Ejemplo:
```bash
find . -size 1033c
```

## Extra 
Búsqueda por tipo: `-type`
  * `f` -> archivo
  * `d` -> directorio
  * `l` -> enlaces simbólicos

Opciones: 
  * `-readable` -> Lectura
  * `-executable` -> Executables
  * `!` -> Muestre lo contrario



Ejemplo:
```bash
find . -type f ! -executable -size 1033c | xargs cat | xargs
```

