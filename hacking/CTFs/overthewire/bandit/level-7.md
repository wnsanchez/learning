# LEVEL 7

## Búsqueda dentro del archivo
Usamos el comando `grep` para buscar líneas que coincidan con un patrón (palabra, frase o expresión regular)

```bash
grep [opciones] patrón [archivo(s)]
```

### Uso normal
```bash
grep patron archivo.txt
```

### Sin distinción de mayúsculas y minúsculas
```bash
grep -i "error" archivo.log
```

### Cuántas veces aparace un patrón
```bash
grep -c patron archivo.txt
```
> Ignorar comentario `-v`

### Ver número línea donde el patrón
```bash
grep -n patron archivo.txt
```

### Manera contextual
Usar opciones como:
  * `-A` -> Muestra líneas sgtes
  * `-B` -> Muestra líneas anteriores
  * `-C` -> Muestra anterior y sgte

```bash
grep -A 2 patrón archivo.txt # Muestra 2 líneas después
grep -C 2 patrón archivo.txt # Muestra 2 líneas antes y después
```


## Búsqueda con tuberías `|`
Tomo el `STDOUT` de la salida de un comando y lo convierte en `STDIN` para trabajar con él.

```bash
px aux | grep "nginx"
```

```bash
cat archivo.txt | grep "patrón"
```

### Ejemplo
```bash
cat data.txt | grep millionth | awk '{print $2}' 
```


