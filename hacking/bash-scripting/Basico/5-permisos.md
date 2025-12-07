# PERMISOS

## Ver información
```bash
ls -l
-rw-r--r-- 1 user user 0 Dec  7 05:00 editor.txt
```
Muestra:
  * Muestra el tipo de archivo `-`: Este caso un archivo
  * Representa 3 grupos que son propietario, grupo, otros `rw-r--r--`
  * Cada grupo contiene permisos `rwx`: read, write, execute
  * Propietario: `user`
  * Grupos: `user` al crear un user se crea un grupo con el mismo nombre
  * Fecha, hora
  * Nombre del archivo


## Read, Write, Execute
  * `read (r)`: Permiso de lectura
  * `write (w)`: Permiso de escritura
  * `execute (x)`: Permiso de ejecución


## Grupos `rwxrwxrwx`
  * `Propietario`: Los tres primero pertenecen al dueño
  * `Grupo`: Los siguientes a un grupo de usuarios
  * `Otros`: Los últimos a otros usuarios 


