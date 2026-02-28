# LEVEL 23

## SCRIPTS
### Shebang
Indica que el script se ejeuta con bash
```bash
#!/bin/bash
```

### `nullglob`
El comando `shopt -s nullglob` activa la opción nullglob en Bash, que hace que los patrones de expansión de nombres de archivo (como *.txt) que no coincidan con ningún archivo se expandan a una cadena vacía, en lugar de mantener el patrón original.

```bash
shopt -s nullglob
```
#### Comporttamiento
  * **Sin `nullglob`**(por defecto):

    Si no hay archivos `.txt`, `*.txt` se mantiene literal:
    ```bash
    for i in *.txt; do echo $i; done
    # Salida: *.txt  (si no hay archivos)   
    ```
    
  * **Con `shopt -s nullglob`**

    Si no hay archivos `.txt`, el patrón se elimina (no entra en el bucle):
    ```bash
    shopt -s nullglob
    for i in *.txt; do echo $i; done
    # No hay salida si no existen archivos .txt   
    ```

#### Uso común 
Es útil en scripts para evitar procesar patrones como nombres de archivo reales:

```bash
shopt -s nullglob

for archivo in *.log; do
    echo "Procesando: $archivo"
done
```

### Variable
```bash
myname=$(whoami)
```
Guarda en la variable `myname` el usuario actual.

### Comando
```bash
cd /car/spool/"$myname"/foo || exit
```
Cambia el directorio:
```bash
/var/spool/bandit23/foo
```
Si no puede entrar -> el script termina.

Mensaje:
```bash
echo "Executing and deleting all scripts in /var/spool/$myname/foo:"
```

### FOR
#### Estructura
##### ***Clásica(para listas)***
```bash
for variable in lista
do
    comandos
done
```
  * **lista**: puede ser una secuencia de números, archivos (`*.txt`), resultados de comandos (`$()ls`) o un rango (`{1..5}`).

  * **variable**: toma cada valor de la lista en cada iteración (como `$i`)

##### ***Sintaxis tipo C(para contadores)***
```bash
for ((inicialización; condición; incremento))
do
    comandos
done
```
Útil para iterar un número específico de veces. 

Ejemplo:
```bash
for ((i=1; i<=5 ; i++))
do
    echo "Número $i"
done
```
Ambas estructuras usan do para iniciar y done para cerrar el bloque de comandos. 

#### Ejercicio
```bash
for i in * .*;
```
Esto hace que el script recorra:
  * Todos los archivos normales (`*`)
  * Todos los archivos ocultos (`.*`)

```bash
# Ejemplo
script.sh
.test
```

### Condición
La estructura del comando `if` en Bash permite ejecutar bloques de código condicionalmente según el resultado de una prueba.

#### Estructura

##### ***Básica***
```bash
if [ condición ]; then
    # Comandos sí es verdadero
fi
```

##### ***Con `else`***
if [ condición ]; then
    # sí verdadero
else
    # sí falso
fi

##### ***Con elif***
```bash
if [ condición1 ]; then
    # si condición1 es verdadera
elif [ condición2 ]; then
    # si condición2 es verdadera
else
    # si ninguna es verdadera
fi
```

##### Operadores
  * **Número:** `-eq`, `-ne`, `-lt`, `-gt`, `-le`, `-ge`
  * **Cadenas:** `!=`, `-z` (vacía)
  * **Archivos:** `-f` (archivo), `-d` (directorio), `-e` (existe)

Este operador `&&` se utiliza para evaluar múltiples condiciones, y requiere que todas sean verdaderas para que el bloque `then` se ejecute

#### Ejercicio
```bash
if [ "$i" != "." ] && [ "$i" != ".." ];
```
Evita procesar:
  * `.`
  * `..`

Porque aparecerían en `.*`

### `stat`
Proporciona metadatos como permisos, inodos, marcas de tiempo y detalles del sistema de archivos.

#### Uso básico
```bash
stat archivo
```

#### Opciones
  * `-c` o `--format`: Permite personalizar la salida con especificaciones como:
    * `%s`: Tamaño de bytes
    * `%A`: Permisos en formato legible
    * `%x`: Último acceso
    * `%y`: Última modificación
    * `%i`: Número de inodo
    * `%U`: Nombre de usuario

#### Ejercicio
```bash
owner="$(stat --format "%U" "./$i")"
```
Obtiene el dueño del archivo (`./$i`)

### Condición 
```bash
if [ "${owner}" = "bandit23" ] && [ -f "$i" ];
```
Solo se ejecuta si:
  * El dueño es `bandit23`
  * Es un archivo normal (`f`)

### `timeout`
El comando `timeout` en Linux ejecuta un comando y lo termina si supera un tiempo límite especificado.

```bash
timeout [OPCIONES] DURACIÓN COMANDO   
```
  * `Duración`: puede ser `5s`(segundos), `2m` (minutos), `1h` (horas), etc. Por defecto es segundos.
  * `Comando`: el programa o script a ejecutar.

#### Comportamiento 
  * Por defecto, envía la señal SIGTERM al final del tiempo. 
  * Si el proceso no responde, puede usar `-k` para enviar SIGKILL después de un periodo adicional. 
  * Retorna código `124` si el comando es terminado por timeout.

#### Ejercicio
```bash
timeout -s 9 60 "./$i"
```
  * `60`: Límite de tiempo de **60 segundos**
  * `-s 9`: Envía la señal SIGKILL (número 9) directamente al final del tiempo.
    * A diferencia de SIGTERM, SIGKILL mata el proceso inmediatamente y no puede ser ignorada ni capturada. 
  * `./$i`: Archivo o script a ejecutar, cuyo nombre está en la variable `$i`.

### `rm`
#### Ejercicio
```bash
rm -rf "./$i"
```
El comando `rm -rf "./$i"` elimina de forma recursiva y forzada el archivo o directorio cuyo nombre está en la variable $i, ubicado en el directorio actual. 

