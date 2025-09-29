# RUN

## FLAGS
Flags más usados con docker run

### 1. `-d` (--detach) -> detached
Corre el contenedo en segundo plano
```bash
docker run -d nginx # Versión corta
docker run --detach nginx
```

### 2. `-it` -> interactivo + terminal
```bash
docker run -it alpine sh
```
👉 Combina dos flags:
* -i (mantiene STDIN abierto)
* -t (asigna una pseudo-terminal)

### 3. `--name` nombrar al contenedor 
Asignar un nombre fácil en lugar del ID
```bash
docker run --name nombre_contenedor nginx
```

### 4. `-p` (--publish) -> publicar puertos
```bash
docker run -d -p 8080:80 nginx # Versión corta
docker run --detach --publish 8080:80 nginx

```
Accedes a Nginx en `http://localhost:8080`.

### 5. `-v`-> volúmenes
Montar carpetas de tu máquina dentro del contenedor.
```bash
docker run -d -v $(pwd)/html:/usr/share/nginx/html -p 8080:80 nginx
```

### 6. `-rm` -> borrar al salir 
El contenedor se elimina automáticamente al detenerse.
```bash
docker run --rm -it alpine sh
```

### 7. `-e` -> variable de entorno
Definir variables de entorno dentro del contenedor
```bash
docker run -d -e MYSQL_ROOT_PASSWORD=123456 mysql:8.0
```

### 8. --restart → política de reinicio
Hace que el contenedor se reinicie bajo ciertas condiciones.
```bash
docker run -d --restart always nginx
```

### 9. --network → red personalizada
Conectar el contenedor a una red creada por ti.
```bash
docker network create mi_red
docker run -d --name web --network mi_red nginx
```


## `create` en vez de `run`
Crea un nuevo contenedor a partir de una imagen, pero no lo inicia.

### ¿Cuándo usar `docker create`?
* Cuando quieres preparar contenedores con ciertas configuraciones pero iniciarlos más tarde.
* En scripts de automatización, donde primero defines varios contenedores y los ejecutas según sea necesario.
* Para inspeccionar o preparar volúmenes, redes, o configuraciones sin correr el contenedor aún.

