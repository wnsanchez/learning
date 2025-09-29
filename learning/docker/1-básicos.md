# COMANDOS

## Descargar
### 1. Descargar
```bash
sudo docker pull nombre_image
```
> Ver imágenes disponibles en Docker Hub

### 2. Revisar descarga
```bash
sudo images
```

### 3. Correr imagen
```bash
sudo docker run nombre_image
```

### 4. Ejemplo
```bash
sudo docker pull hello-world
docker images
sudo docker run hello-world
```

## Trabaja con imagen
### 1. Descargar con imagen
```bash
sudo docker pull alpine
```

### 2. Correr imagen
```bash
sudo docker run alpine
```
> El contenedor se crea, se ejecuta brevemente y se detiene inmediatamente.


### 3. Ingresar con el shell /bin/sh.
```bash
sudo docker run -it alpine sh 
```

### 4. Dejar en segundo plano
```
CRTL + P + Q
```

### 5. Ver contendedor activo
```bash
docker ps
``` 
> Revisar columna de `names` e `id`

### 6. Entrar en contenedor activo
```bash
docker exec -it <NOMBRE o ID> sh
```

### 7. Cerrar el contenedor 
```bash
exit
``` 

O
```bash
docker stop <NOMBRE o ID>
``` 

### 8. Reutilizar contenedor detenido
#### Ver contenedores activos y detenido
```bash
docker ps -a
```
Salida:
```bash
CONTAINER ID   IMAGE     COMMAND     CREATED        STATUS                      PORTS     NAMES
8fe480372071   alpine    "/bin/sh"   12 hours ago   Exited (0) 12 hours ago               angry_murdock
```

#### Reutilizar
```bash
docker start -ai <NOMBRE o ID>
``` 



