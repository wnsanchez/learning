# LEVEL 32

## 1. Parámetros posicionales 
Cuando ejecutas un script así:
```bash
./script.sh uno dos tres
```
Bash asigna utomáticamente:
  * `$0` -> nombre del script (`script.sh`)
  * `$1` -> primer argumneto (`uno`)
  * `$2` -> segundo argumento (`dos`)
  * `$3` -> tercer argumento (`tres`)

Ejuemplos:
```bash
#!/bin/bash
echo "Script: $0"
echo "Arg1: $1"
echo "Arg2: $2"
```
Ejecutar: `./archivo.sh uno dos`

Salida:
```bash
Script: script.sh
Arg1: uno
Arg2: dos
```

### Variables importantes 

| Variable    | Significado                               |
| ----------- | ----------------------------------------- |
| `$0`        | nombre del script                         |
| `$1 $2 ...` | argumentos individuales                   |
| `$#`        | número de argumentos                      |
| `$@`        | todos los argumentos separados            |
| `$*`        | todos los argumentos como una sola cadena |
| `"$@"`      | forma segura para iterar argumentos       |


#### `$@` (sin comillas)
`$@` expande **todos los argumentos**, pero el puede volver a separarlos por espacios.

```bash
#!/bin/bash

echo '$@ SIN COMILLAS'
echo -e "----------------\n"

echo "|== Arg1 -> $1"
echo "|== Arg2 -> $2"
echo "|== Arg3 -> $3"

echo -e "\nBUCLE"
echo -e "***********"
for i in $@;do
    echo "$i"
done

echo -e "***********"

```
Ejecutar: `./argumento1.sh "uno  medio" dos tres`

Salida: 
```bash
$@ SIN COMILLAS
----------------

|== Arg1 -> uno  medio
|== Arg2 -> dos
|== Arg3 -> tres

BUCLE
***********
uno
medio
dos
tres
***********

```

#### `$@` (con comillas)
`"$@"` trata cada argumento como un elemento separado, preservando espacios.


```bash
#!/bin/bash

echo '$@ CON COMILLAS'
echo -e "----------------\n"

echo "|== Arg1 -> $1"
echo "|== Arg2 -> $2"
echo "|== Arg3 -> $3"

echo -e "\nBUCLE"
echo -e "***********"
for i in "$@";do
    echo "$i"
done

echo -e "***********"

```
Ejecutar: `./argumento1.sh "uno  medio" dos tres`

```bash
$@ CON COMILLAS
----------------

|== Arg1 -> uno  medio
|== Arg2 -> dos
|== Arg3 -> tres

BUCLE
***********
uno  medio
dos
tres
***********

```

#### `$*`
`"$*"` convierte todos los argumentos en una sola cadena.

```bash
#!/bin/bash

echo '$* CON COMILLAS'
echo -e "----------------\n"

echo "|== Arg1 -> $1"
echo "|== Arg2 -> $2"
echo "|== Arg3 -> $3"

echo -e "\nBUCLE"
echo -e "***********"
for i in "$*";do
    echo "$i"
done

echo -e "***********"

```
Ejecutar: `./argumento1.sh "uno  medio" dos tres`

```bash
$@ CON COMILLAS
----------------

|== Arg1 -> uno  medio
|== Arg2 -> dos
|== Arg3 -> tres

BUCLE
***********
uno  medio dos tres
***********

```


## 2. `$0` | Terminal interactiva
Si escribes:
```bash
echo $0
```
Normalmente verás algo como:
```bash
bash
```
porque el programa que está ejecutándose es el shell actual.

Si usas:
```bash
$0
```
Lo que abre una nueva shell normal.


