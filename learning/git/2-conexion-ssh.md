
# Conexión

## Mediante SSH
### 1- Ver si ya tienes una clave SSH
```bash
ls ~/.ssh
```
Posibles archivos:
* `id_rsa` y `id_rsa.pub`
* o `id_ed25519` y `id_ed25519.pub`


| Archivo          | Contenido                                    | ¿Compartir? |
| ---------------- | -------------------------------------------- | ----------- |
| `id_ed25519`     | 🔒 Clave privada → **nunca compartir**       | ❌ No        |
| `id_ed25519.pub` | 📢 Clave pública → **sí se puede compartir** | ✅ Sí        |


> Entonces tienes una clave SSH creada.

### 2- Crearla si no hay clave SSH
```bash
ssh-keygen -t ed25519 -C "tucorreo@ejemplo.com"
```

| Parte                       | Significado                                                         |
| --------------------------- | ------------------------------------------------------------------- |
| `ssh-keygen`                | Programa que genera claves SSH                                      |
| `-t ed25519`                | Especifica el **tipo de algoritmo**: en este caso, `ed25519`        |
| `-C "tucorreo@ejemplo.com"` | Agrega un **comentario** a la clave (usualmente tu correo o nombre) |

> Nos da la opción de nombrar al archivo `demo_git`, como agregar un `passphrase` una clave extra (opcional)

#### ¿Qué es `ed25519`?
* Es un tipo de algoritmo criptográfico moderno y muy seguro.
* Reemplaza a los antiguos `rsa` y `dsa` que eran más largos y lentos.
* Ventajas:
    - Más corto: claves de 256 bits.
    - Más rápido
    - Más seguro


### 3- Subir a GITHUB
Primero copiar la clave pública con extensión `*.pub`
```bash
cat ~/.ssh/id_ed25519.pub
```
1. Ir al enlace [https://github.com/settings/ssh/new](https://github.com/settings/ssh/new)
2. Colocar un nombre
3. Pegar el contenido de la clave pública en el campo
4. Guardar

### 4- Probar si funciona
```bash
ssh -T git@github.com
```
Salido si todo esta bien
```bash
Hi <nombre_usuario>! You've successfully authenticated, but GitHub does not provide shell access.
```

### 5- Sino sale bien
#### Agregar un archivo `~/.ssh/config`
```bash
nano ~/.ssh/config
```
#### Agregar este contenido
```bash
Host github.com
  HostName github.com
  User git
  IdentityFile ~/.ssh/demo_git
  IdentitiesOnly yes
```
Que hace:
* `Host github.com`: se aplica cuando conectes a GitHub
* `IdentityFile ~/.ssh/demo_git`: usa esta clave privada
* `IdentitiesOnly yes`: ignora otras claves que pueda tener tu sistema cargadas

#### Comprobar `ssh -T git@github.com`
Mensaje esperado
```bash
Hi <nombre_usuario>! You've successfully authenticated, but GitHub does not provide shell access.
```

##### Ejemplo
Clonar repositorio
```bash
git clone git@github.com:nombre_usuario/nombre_repositorio.git
git push
git pull
```

> Y no necesitas tokens, contraseñas ni ingresar nada más, porque la autenticación es automática con tu clave SSH.

#### Quiero usar más claves
##### Agregar en el `config`
Puedo tener varios bloques Host dentro
```bash
# Cuenta personal en GitHub
Host github-personal
  HostName github.com
  User git
  IdentityFile ~/.ssh/id_ed25519
  IdentitiesOnly yes

# Cuenta de trabajo en GitHub
Host github-work
  HostName github.com
  User git
  IdentityFile ~/.ssh/work_git_key
  IdentitiesOnly yes

# Cuenta en GitLab
Host gitlab
  HostName gitlab.com
  User git
  IdentityFile ~/.ssh/gitlab_key
  IdentitiesOnly yes

```
##### Conectar y trabajar
```bash
git clone git@github-work:empresa/repositorio.git
git clone git@github-personal:wnsanchez/otro-repo.git
```

