# LEVEL 27

## GIT

### ¿Qué es git?
Git es un **sistema de control de versiones**.

Sirve para:
  * Guardar cambios de archivos 
  * Ver el historial de modificaciones
  * Volver a versiones anteriores
  * Colaborar con otros

> Piensa en Git como **una máquina del tiempo para código**.

### Repositorio | repo
Un **repositorio** es una carpeta que Git controla.

Contiene:
  * Archivos del proyecto
  * Historial de cambios
  * Información de commits

Puede ser:
  * Local → en tu máquina
  * Remoto → en un servidor

Descargar un repo:
```bash
git clone <url>
```

### Commit
Un **commit** es una "foto" del proyecto en un momento.

Cada commit tiene:
  * Autor
  * Fecha
  * Mensaje
  * Cambios realizados

Para verlos:
```bash
git log
```
### Ver cambios en commits
Para ver qué cambió en su commit:
```bash
git show <commit>
```
Ejemplo:
```bash
git show 4a7d2f3
```

### Historial de archivos
También puedes ver versiones anteriores de un archivos.
Ejemplo:
```bash
git log README
```
o:
```bash
git show HEAD-1:README
```
Significa:
  * `HEAD` -> último commit
  * `HEAAD-1` -> commit anterior

### Branches | Ramas
Una **branch** es una línea alternativa de desarrollo.

Para verlas:
```bash
git branch -a
```
Cambiar de rama:
```bash
git checkout <branch>
```

### Tag
Un **tag** marca un commit específico

Para verlos:
```bash
git tag
```
Y ver su contenido:
```bash
git show <tag>
```

### Git diff
Muestra diferencias entre versiones.
```bash
git diff
```
o
```bash
git diff HEAD-1 HEAD
```

### El directorio `.git`
Todo el historial esta dentro de:
```bash
cd .git
ls
```

## Bandit
Clonar un repo usando un puerto específico
```bash
git clone ssh://git@github.com:2222/usuario/repositorio.git
```

```bash
git clone ssh://bandit27-git@bandit.labs.overthewire.org:2220/home/bandit27-git/repo
# Entrar a repo
cd repo
# Listar contenido de repo
ls
# Revisar contenido
cat README
```


