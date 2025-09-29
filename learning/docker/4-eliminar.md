# ELIMINAR IMAGENES Y CONTENEDORES

## IMAGEN vs CONTENEDOR
1. **Imagen:**
Es la "plantilla" de un contenedor. El **Dockerfile** genera una imagen.
2. **Contenedor:**
Es una instancia en ejecución de una imagen.

## IMAGEN
### 1. Ver imagenes
```bash
docker images # Antes | Vigente
docker image ls # Actual | Documentación
```

### 2. Eliminar una imagen
```bash
sudo docker image rm <NOMBRE o ID> # Moderna | Documentación
sudo docker rmi <NOMBRE o ID> # Abreviada
```

### ⚠️ Consideraciones al eliminar imágenes
Antes de borrar una imagen, asegurate de que no esté siendo usada por algún contenedor (aunque esté detenido), porque si no, vas a ver un error como:
```bash
Error response from daemon: conflict: unable to remove repository reference ... (must be forced) - image is being used by running container ...
```
Eliminar contenedores primero o realizar un borrado forzado por si no vas usar el contenedor ya que quedará sin una base(imagen).
```bash
docker rmi -f <NOMBRE o ID>
```

## CONTENEDOR 
### 1. Ver contendores activos o detenido
```bash
docker ps -a
```

### 2. Eliminar contenedor
```bash
sudo docker container rm <NOMBRE o ID> # Moderna | Documentación
sudo docker rm <NOMBRE o ID> # Abreviada
```





