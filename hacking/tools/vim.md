# VIM

### 1. Edición de archivo
```bash
vim archivo
```

> Si no existe abre uno nuevo hasta guardarlo.

### 2. Modo inserción 
Dentro de vim hay modos como solo ver y edición en este caso, dentro de vim escribimos `i`

> Después de `i` ya podemos agregar contenido.

### 3. Guardar archivo
Para guardar debemos salir del modo inserción con `esc`
  * Solo guardar, escribir dentro de vim `:w`
  * Para guardar y salir `:wq`
  * Para salir sin guardar `:q!`
 
### 4. Modo view (ver)
Entra al modo view con `esc`

#### Moverse dentro:
  * Arriba: `k`
  * Abajo: `j`
  * Izquierda: `h`
  * Derecha: `l`

> O usar flechas

#### Inicio y Fin de archivo:
Lleva al principio de cada línea:
  * Inicio: `gg`
  * Final: `G` (shift + g)

#### Inicio y Fin de línea:
Movernos en una línea:
  * Inicio: `0`
  * Final: `$`

### 5. Mover por palabras 
  * Va al inicio de la siguiente palabra: `w`
  * Va al inicio de la palabra anterio: `b`
  * Va al final de la siguiente palabra: `e`
  * Va al final de la palabra anterior: `ge`
 
### 6. Borrar
Igual con el modo view:
  * Borrar carácter bajo el cursor: `x`
  * Borra palabra desde el cursor hasta el inicio del siguiente: `dw`
  * Borra la palabra hacia atrás, desde el cursor hasta el inicio de la palabra actual: `db`
  * Borra toda la línea: `dd`
  * Borra desde el cursor hasta el final de la línea: `D` o `d$`
  * Borra desde el cursor hasta el principio de la línea: `d0`

> Deshacer cambios `alt + u`

### 7. Modo búsqueda
Para buscar dentro de vim en le modo view: `shift + 7`(/) + palabra_a_buscar y `enter` para moverse hacia adelante `n` y anterio `shift + n` (N)


### 8. Reemplazar palabras
  * `:s/antiguo/nuevo/`: Reemplaza la primera aparición en la línea actual.
  * `:s/antiguo/nuevo/g`: Reemplaza todas las apariciones en la línea actual.
  * `:%s/antiguo/nuevo/g`: Reemplaza en todo el archivo.
  * `:%s/antiguo/nuevo/gc`: Reemplaza en todo el archivo preguntando confirmación en cada caso (`y`, `n`, `a`, `q`).
