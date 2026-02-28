# LEVEL 21

## CRON 
Cron es un demonio en Linux que ejecuta tareas programadas automáticamente en momentos específicos, como cada minuto, hora, día, semana o mes

El servicio que corre en segundo plano se llama:
> crond (en la mayoría de distribuciones)

Su trabajo es:
  * Leer archivos de configuración
  * Revisar cada minuto si debe ejecutar algo
  * Ejecutar los comandos programados

### `crontab`
Es el archivo donde se definen las tareas programadas.

Cada usuario puede tener su propio crontab.

**¿Qué hace`crontab -l`?**

Significa: list

Muestra el contenido del crontab del usuario actual.

Internamente esta leyendo un archivo que normalmente está en:
```bash
/var/spool/cron/crontabs/usuario
```
> No se edita directamente ese archivo. Se usa el comando `crontab`.

**¿Qué hace`crontab -e`?**

Signiica: edit

Abre el crontab del usuario actual en un editor (nano o vi)

Cuando guardas:
  * Sobrescribe el archivo en `/var/spool/cron/crontabs/`
  * Le pone permisos correctos
  * Notifica al daemon cron

### Estructura
```bash
* * * * * comando
│ │ │ │ │
│ │ │ │ └── día de la semana (0-7)
│ │ │ └──── mes
│ │ └────── día del mes
│ └──────── hora
└────────── minuto
```


### Carpetas

#### ¿Qué es `/etc/crontab`?
Es el crontab **global del sistema**.

Diferencia importante:

En `/etc/crontab` hay una columna extra:
```bash
* * * * * usuario comando
```

Aquí si se especifica qué usuario ejecuta el comando:
```bash
# Ejemplo se ejecuta cada 5 minutos
*/5 * * * * root /usr/bin/backup.sh
```



#### ¿Qué es `/etc/cron.d`?
Es un directorio que contiene archivos adicionales tipo crontab.

Cada archivo dentro de `/etc/cron.d/`:
  * Tiene el mismo formato que `/etc/crontab`
  * Incluye la columna de usuario
  * Es leído automáticamente por cron

Es una forma modular de agregar tareas sin tocar `/etc/crontab`.

## SCRIPTS

### Variable
Variables en bash
```bash
# Declarando variable
var1="Will"
var2=20
var3="Perú"

#Usando variable 
echo "$name"
```

Variables con salida de un comando eso se llama **command sustitution(sustitución de comando)**.

```bash
# Sintaxis
variable=$(comando)
# Uso
usuario=$(whoami)
```
Internamente:
  1. Ejecuta whoami
  2. Captura lo que imprime (por ejemplo bandit21)
  3. Sustituye $(whoami) por ese resultado
  4. Asigna el valor a la variable

Equivale a: `usuario=bandit21`

> Si el comando produce error (stderr), no lo captura.

### Comillas
Expansión significa:
> Reemplazar algo que no es literal por su valor real antes de ejecutar el comando.

```bash
var="hola"
```

#### Simples ('')
No permite expansión
```bash
echo '$var'
```
Bash:
  * No hay expansión
  * Trata todo literal

Imprime:
```bash
$var
```

> No interpreta el $.

#### Dobles ("")
Permite expansión
```bash
echo "$var"
```
Bash:
  * Ve $var
  * Lo expande a hola

Imprime:
```bash
hola
```
> Porque las comillas dobles sí permiten expansión de variables.

### Sin comillas
```bash
archivo=$(cat input.txt)
rm $archivo
```
Aquí Bash hace esto:
  * Toma el contenido de archivo
  * Lo divide por espacios (`word splitting`)
  * Expande caracteres especiales como `*`
  * Luego ejecuta `rm` con lo que resulte

### Nota
Regla mental ultra simple
  * `' '` = Modo piedra (literal, nada se toca)
  * `" "` = Modo inteligente (expande variables)
  * Sin comillas = Modo peligroso (expande y divide)


