# LEVEL 20

## 1. Conceptos

### UID real vs UID efectivo
Cuando un proceso se ejecuta en Linux, tiene varios **identificadores de usuario**, pero los dos importantes son:

***UID real (Real User ID)***

Es:
> Quién inició el proceso

Si haces:
```bash
whoami
```
Es tu UID real

Ejemplo: Estás logueado como `bandit19` -> tu UID real es `bandit19`

***UID efectivo (Effective User ID)***

Es:
> Con qué permisos se ejecuta realmente el proceso

Linux usa el **UID efectivo** para decidir:
  * Si puedes leer un archivo
  * Si puedes escribir
  * Si puedes ejecutar algo

### SUID (Set User ID)
Es un permiso especial en Linux que se asigna a archivos ejecutables para que se ejecuten con los privilegios del **propietario del archivo**, en lugar de los del usuario que lo ejecuta.

>  Este permiso es fundamental para permitir a usuarios comunes realizar tareas que requieren privilegios elevados, como cambiar contraseñas o enviar paquetes de red.

```bash
# Se activa 
chmod u+s archivo 
# Octal 4000
chmod 4755 archivo
```

Se identifica con una `s`
```bash
ls -l
-rwsr-xr-xs
```
Ejemplo: 

El comando `/usr/bin/passwd` tiene SUID activado, lo que permite a cualquier usuario cambiar su contraseña al modificar /etc/shadow, un archivo solo accesible por root.

> Riesgo de seguridad: Si un archivo con SUID tiene una vulnerabilidad, un atacante podría explotarla para obtener privilegios de root. Por eso, es crucial revisar y eliminar SUID en archivos no necesarios. 


#### Tip
Encontrar archivos SUID
```bash
find / -type f -perm 4000 2>/dev/null
```

El problema es que estás usando `find . -type f -perm 4000`, pero -perm 4000 busca permisos exactos, lo cual es muy restrictivo y rara vez coincide.

***Diferencias:***
  * `-perm -4000`: significa "todos los bits en 4000 deben estar activos" (es decir, el bit SUID debe estar presente), sin importar los otros permisos.
  * `-perm 4000`: solo encuentra archivos con permisos exactamente 4000 (rws------), lo que casi nunca ocurre. 

Alternativa moderna:
```bash
find . -type f -perm /4000
```
Donde `/4000` significa "al menos uno de los bits en 4000 está activo" (equivalente funcional a -4000 en este caso).

### Ejemplo
Cuando un usuario normal ejecuta el comando passwd, ocurre lo siguiente:

  * UID real: Es el del usuario que ejecuta el comando (por ejemplo, 1000). 
  * UID efectivo: Cambia temporalmente a 0 (root), porque el binario /usr/bin/passwd tiene el bit SUID activado. 

Esto permite que el proceso modifique el archivo /etc/shadow, que solo root puede editar, aunque el usuario que lo ejecuta no sea root. El sistema verifica el UID efectivo para conceder acceso, no el real. 


Internamente el kernel:
  * Guarda RUID
  * Guarda EUID
  * Cuando el proceso intenta abrir un archivo → usa EUID

Por eso SUID funciona.

## 2. Archivos SUID
Ejecutables mal programados podrían dejar vulnerabilidades y más con permisos SUID, ya que estos podría ejecutar comandos como root y llevar a escalada de privilegios.

```bash
# Ejecución de comandos
./archivo_ejecutable comando
```

Entrar con shell:
```bash
./archivo_ejecutable bash -p
```

La opción `-p` significa privileged mode (modo privilegiado).

Solo con bash, este se protege y baja los privilegios automáticamente.

