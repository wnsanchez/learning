# LEVEL 8

## Buscar una línea única
La misión es encontrar una línea sin repetir para eso usamos los siguientes comando `sort` y `uniq`.

### 1. `sort`
Su uso me permite ordenar el contenido

### 2. `uniq`
Se utiliza para filtrar o eliminar líneas duplicadas consecutivas en un archivo o entrada de texto.

>  Requiere que las líneas duplicadas estén adyacentes, por lo que se usa frecuentemente junto con `sort`

  * `uniq -c` -> Cuenta y muestra el número de repeticiones de cad línea
  * `uniq -d` -> Muestra solo líneas que están duplicadas
  * `uniq -u` -> Muestra solo líneas únicas


Ejemplo
```bash
sort archivo | uniq -u
```


