# LEVEL 26

## 1. Conceptos

### TTY
**TTY** significa **teletypewriter**. Hoy en Linux se usa para referirse a **la interfaz de terminal interactiva** entre el usuario y el sistema.

En otras palabras:

* Es el **canal por donde escribes comandos**
* Y por donde **recibes la salida**

Ejemplos de TTY:

* Terminal local (`Ctrl + Alt + F3`)
* Terminal de GNOME / KDE
* Conexión SSH
* Un pseudo-terminal creado por programas

Puedes ver cuál estás usando con:

```bash
tty
```

Ejemplo de salida:

```
/dev/pts/0
```

Significa que estás usando un **pseudo-terminal (PTS)**, típico cuando usas SSH o un emulador de terminal.

#### ¿Qué es un TTY interactivo?

Un **TTY interactivo** es una terminal donde:

* puedes **escribir input**
* el sistema **responde inmediatamente**

Ejemplo interactivo:

```bash
bash
python
ssh
nano
vim
```

Ejemplo **no interactivo**:

```bash
echo hola | grep hola
```

o scripts ejecutados automáticamente.

En seguridad y CTFs esto importa porque a veces obtienes una **shell limitada sin TTY**, y algunos programas no funcionan bien.

Por ejemplo:

* `sudo`
* `ssh`
* `vim`
* `su`

### Comando `stty`

`stty` significa **set terminal type/settings**.

Sirve para **ver o cambiar configuraciones del terminal**.

Ejemplo:

```bash
stty -a
```

Muestra cosas como:

* control de eco
* tamaño del terminal
* comportamiento del teclado

Ejemplo:
```bash
# Desactivar echo
stty -echo
# Lo que escribas no se muestra
stty echo
# Vuelve a  activar 
```

#### Tamaño de terminal
Podemos ver el tamaño con:

```bash
stty size
```
Muestra rows(filas), columns(columnas)

Editar:
```bash
stty rows <número> cols <número>
stty rows 44 cols 120
```

### Comando `reset`
`reset` **repara el terminal** cuando se corrompe.

Ejemplo típico en Bandit:

* abres un archivo binario con `cat`
* el terminal se llena de caracteres raros
* el teclado deja de funcionar bien

Solución:

```bash
reset
```

Esto:

* limpia la pantalla
* reinicia configuraciones del TTY

### Comando `more`
`more` es un pager de Unix/Linux. Sirve para ver archivos largos **pantalla por pantalla**.
```bash
more archivo.txt
```
En lugar de mostrar todo de golpe, te deja de navegar:
  * `Espacio`: Baja una página
  * `b`: Retrocede una página
  * `Enter`: Baja una línea
  * `q`: Salir
  * Además **comandos interactivos**: `!comando`

> Solo si el contenido es largo lo muestra de forma interactiva 

Entrar en modo editor:
```bash
v
```
Abre editor por defecto de `vim`, si agregamos contenido podemos guardar primero salimos usando `esc` y guardamos con `:wq` guarda y sale.

Si solo queremos salir del modo editor solo `esc`

Escapar de Vim
```bash
:set shell=/bin/bash
:shell
```
Abre una shell, podemos ejecutar comandos y para salir escribimos `exit` 

Para salir de Vim sin guardar:
```bash
:q!
```
