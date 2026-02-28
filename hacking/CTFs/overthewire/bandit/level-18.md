# LEVEL 18

## 1. TTY/PTY
Es el canal de comunicación de texto (físico o virtual) que conecta al usuario con el sistema. Un TTY es físico (como `/dev/tty1`), un PTY es virtual (como `/dev/pts/0` en SSH o emuladores gráficos).

```bash
# Comando para revisar
tty
```
Este comando muestra la ruta del dispositivo de terminal que estás usando:

  * Si la salida es `/dev/tty1`, `/dev/tty2`, etc. → estás en un TTY físico o virtual (por ejemplo, al pulsar `Ctrl+Alt+F1`) y para regresar `Ctrl + Alt + F7`
  * Si la salida es `/dev/pts/0`, `/dev/pts/1`, etc. → estás en un PTY (terminal virtual, como en una ventana de terminal gráfica o una conexión SSH). 

El PTY es un par:
  * Maestro: controlador por el emulador de terminal
  * Esclavo: aparece como un dispositivo tipo TTY y es usado por la `SHELL` 

## 2. Emulador
El emulador de terminal (como GNOME Terminal, Xterm o SSH) es el programa que crea y controla el lado maestro del PTY. Él gestiona la interfaz gráfica, recibe las teclas que presionas y las envía al maestro del PTY.

## 2. SHELL
La shell (como Bash o Zsh) se ejecuta conectada al lado esclavo del PTY. Ella lee los comandos desde el esclavo, los ejecuta y escribe la salida de vuelta al esclavo, que el emulador (a través del maestro) captura y muestra en pantalla.

  * Es un programa que actúa como interfaz entre el usuario y el sistema operativo.
  * Interpreta comandos, gestiona variables de entorno, pipelines, redirecciones y control de trabajos (jobs).
  * Puede funcionar en modo interactivo o no interactivo (scripts).

***¿Cómo se conectan?***
  * Tú escribes: ls (para ver archivos).
  * El emulador de terminal (la ventana) lo manda al PTY (el canal). 
  * El PTY le pasa eso a la shell (Bash). 
  * Bash dice: "Ah, quiere ver los archivos", los lista y manda el resultado de vuelta al PTY. 
  * El PTY se lo da al emulador, y él lo muestra en pantalla. 


### Tipos de shell

#### a. Bourne Shell (sh)
  * Una de las primeras shells.
  * Ruta: `/bin/sh`
  * Prompt: `$` (Usuario normal), `#` (root)
  * Base para muchas otras shells, pero con menos funciones interactivas (sin historial, sin autocompletar). 

#### b. Bash (Bourne-Again-Shell)
  * La más usada en distribuciones Linux
  * Ruta `/bin/bash`
  * Mejora a `sh`: incluye historial de comandos, autocompletado, alias, edición de línea.
  * Compatible con scripts de `sh`.

#### c. C Shell (csh)
  * Inspirado en el lenguaje C.
  * Ruta: `/bin/csh`
  * Prompt: `%`
  * Tiene control de trabajos y historial, pero menos usada hoy. 

#### d. Tcsh (Tenex C Shell)
  * Versión mejorada de `csh`.
  * Añade autocompletado y edición avanzada de comandos.

#### e. Korn Shell (ksh)
  * Versión mejorada de `csh`
  * Combina li mejor de `sh` y `csh`, con potentes capacidades de programación.

#### f. Zsh (Z Shell)
  * Muy completa y personalizable
  * Ruta: `/bin/zsh`
  * Incluye funciones de `bash`, `ksh` y `tcsh`, más temas, plugins y mejor autocompletado.

#### e. Fish (Friendly Interactive Shell)
  * Diseñada para ser amigable
  * Autocompletado en tiempo real, colores y sintexis intuitiva.
  * No compatible con `sh`, pero ideal para uso interactivo.


### Interactiva
Para ver que opciones de Bash esta activada usamos el comando `$-`

```bash
echo "$-"
```
```ouput
Ejemplo
hBc
```

| Letra | Significado                          |
| ----- | ------------------------------------ |
| `i`   | Shell interactiva                    |
| `h`   | Guarda historial                     |
| `m`   | Control de jobs activo               |
| `B`   | Expansión de `!` (history expansion) |
| `H`   | History expansion habilitado         |
| `s`   | Lee comandos desde stdin             |
| `c`   | Ejecutando comando con `-c`          |


#### a. Shell interactiva
Una shell interactiva permite al usuario introducir comandos manualmente y ver los resultados inmediatamente. Se usa comúnmente en terminales. 

> Ejemplo: Abrir una terminal en Linux o conectarse por SSH.

**Características**
  * Muestra un prompt (como `$` o `#`)
  * Lee archivos de configuración como `~/.bashrc`
  * La variable `$PS1` esta definida.
  * El usuario puede interactuar en tiempo real.

>  `$PS1` define el formato del indicador de comandos (prompt) en la terminal del shell Bash `usuario@host:~/directorio$`.

#### b. Shell no interactiva
Se usa para ejecutarse scripts automáticamente, sin intervención del usuario.

**Características**
  * No muestra prompt.
  * No lee `~/.bashrc` (a menos que se configure).
  * La variable `$PS1` suele estar vacía.
  * Ideal para tareas automatizadas (como cron jobs.)

### Login

#### a. Shell de login
Se inicia al acceder al sistema (por ejemplo, al iniciar sesión en la terminal o por SSH).

  * Carga archivos de configuración principales: /etc/profile, luego ~/.bash_profile, ~/.bash_login o ~/.profile (en ese orden).

  * Ejemplo
    ```bash
    ssh usuario@servidor
    ```
  * Como identificar:
    ```bash
    echo $0
    # Salida: -bash  (el guion inicial indica shell de login)
    ```


#### b. Shell no login 
Se abre después de haber iniciado sesión, como una nueva terminal gráfica o al ejecutar un script.

  * No lee los archivos de perfil, pero sí `~/.bashrc` (si es interactiva)
  * Ejemplo: Abrir una terminal en el escritorio o ejecutar

    ```bash
    bash
    ``` 
  * Cómo identificarlo
  ```bash
  echo $0
  # Salida: bash  (sin guion)
  ```

## 4. Métodos para una shell no interactiva

### Normal | SSH
```bash
ssh usuario@servidor -p <PUERTO>
```
  * Se conecta
  * Inicia una shell interactiva
  * Ejecuta archivos como `.bashrc`
  * Te da la terminal


### Remoto usando comandos
```bash
ssh usuario@servidotr -p <PUERTO> 'comando'

# Ejemplo
ssh bandit18@bandit.labs.overthewire.org -p 2220 'ls'
```
  * Se conecta
  * Ejecuta ls
  * NO abre shell interactiva
  * NO carga completamente el entorno interactivo


### Shell no login
```bash
ssh bandit18@bandit.labs.overthewire.org -p 2220 /bin/bash
```
Esto inicia `/bin/bash` directamente, omitiendo el proceso de login y sus scripts.

### Pseudo-terminal con otra shell
```bash
ssh bandit18@bandit.labs.overthewire.org -p 2220 -t /bin/sh
```
Aquí usas una shell distinta (/bin/bash) y el flag `-t` fuerza una terminal, permitiendo la interacción.