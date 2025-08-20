
# Configuración

### Básico
#### 1- Agregar nombre de usuario
```bash
git config --global user.name "Tu nombre"
```
#### 2- Agregar correo electrónico
```bash
git config --global user.email "tucorreo@ejemplo.com"
```
#### 3- Verificar configuración actual
```bash
git config --list
```
#### 4- Cambiar la rama incial por defecto (Opcional)
```bash
git config --global init.defaultBranch main
```
> Por defecto es `master`
#### 5- Configurar el editor por defecto (Opcional)
```bash
git config --global core.editor "code --wait"
```
> Para usar VSCode, defecto es VIM
#### 6- Activar colores (Opcional)
```bash
git config --global color.ui auto
```
> Hacer que los mensajes de Git sean más legibles

Las configuraciones se guardan en `~/.gitconfig`


### Otros comandos
#### 



