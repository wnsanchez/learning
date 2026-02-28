# LEVEL 13

## SERVICIO SSH
Es un protocolo que se usa para conectarte de forma segura a otra computadora (normalmente un servidor) a través de una red, como Internet.

> SSH te permite entrar y controlar otra máquina remotamente, pero cifrado, para que nadie pueda espiar lo que envías (contraseñas, comandos, archivos, etc.).

### 1. Formas de conexión

#### Contraseña

#### Claves públicas y privadas
Se usa `ssh-keygen` que es una herramienta para crear claves SSH.
Estas claves se usan para autenticarse sin contraseña (y de forma más segura).

Se generan dos llaves:

  * **Clave privada:** se queda SOLO en tu computadora (nunca se comparte)
  * **Clave pública:** se copia al servidor

Como funciona `ssh-keygen`:
  * Se genera un par de claves (pública y privada)
  * Te pregunta dónde guardarlas (normalmente `~/.ssh/id_rsa` o `id_ed25519`)
  * Te pide una **passpharase** (opcional, pero muy recomendable).
  * Crea los archivos:
    * `id_ed25519` -> clave privada
    * `id_ed25519.pub` -> clave privada

Requisitos para el uso de SSH:
| Ruta              | Permisos |
| ----------------- | -------- |
| `/home/usuario`   | `755`    |
| `~/.ssh`          | `700`    |
| `authorized_keys` | `600`    |

> Si no se usa así se quejará SSH.

### 2. Conexión

#### Uso simple
Por defecto usando el puerto 22
```bash
ssh usuario@servidor
```

Usando un puerto específico `-p`
```bash
ssh usuario@servidor -p <Puerto>
#Ejemplo
ssh bandit13@bandit.labs.overthewire.org -p 2220
```
#### Usar clave pública
Copiar la clave pública al servidor
```bash
ssh-copy-id usuario@servidor
```
Automáticamente se pondrá en el archivo `/home/usuario/.ssh/authorized_keys`

> Según `~/.ssh/authorized_keys` del usuario al que te conectas

#### Usar clave privada
Copiar la clave privada generada en el servidor no recomendable pero así es el reto para entender como funciona `ssh -i`

Requisitos para el reto:
  * El archivo debe tener permiso octal 600 
  * Copiar el archivo a nuestra máquina que al realizarlo dentro del mismo servidor usando local host está bloqueado.

```bash
ssh -i sshkey.private bandit14@bandit.labs.overthewire.org -p 2220
```
