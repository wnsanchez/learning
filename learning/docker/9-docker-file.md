# DOCKER FILES 

## 1. ¿Qué es dockerfile?
Es un **archivo de texto** con instrucciones paso a paso que Docker usa para construir una imagen personalizada.

## 2. Conceptos clave
| Concepto           | ¿Para qué sirve?                                                    |
| ------------------ | ------------------------------------------------------------------- |
| **Imagen**         | Plantilla inmutable (como un snapshot de un sistema con programas). |
| **Contenedor**     | Una instancia viva de una imagen.                                   |
| **Dockerfile**     | Script para construir tu propia imagen.                             |
| **`docker build`** | Comando que toma tu Dockerfile y crea una imagen.                   |
| **`docker run`**   | Lanza un contenedor desde una imagen.                               |

---


## 3. Estructurra básica
Estas son las instrucciones más comunes:

### ***`FROM`***
Definir la imagen base desde la que partes
```dockerfile
FROM node:18
```

### ***`WORKDIR`***
Establece el directorio de trabajo dentro del contenedor (como `cd`).
```dockerfile
WORKDIR /app
```

### ***`COPY`***
Copia archivos desde tu máquina (contexto de build) al contenedor.
```dockerfile
COPY . .
```

### ***`RUN`***
Ejecuta comandos en la imagen durante la construcción (build). Ideal para instalaciones o configuración.
```dockerfile
run npm install
```

### ***`EXPOSE`***


### ***`CMD` o `ENTRYPOINT`***
Define el comando por defecto que correrá el contenedor al arrancar
```dockerfile
CMD ["node", "index.js"]
```
> Solo debe haber **una** instrucción `CMD` activa. Si hay más, solo se usa la última.

## 4. Ejemplo básico

### Estructura del proyecto
```bash
mi-proyecto/
├── Dockerfile
├── app.sh
└── otros_archivos...
```

### Agregar script sencillo
Usando editor nano u otro
```bash
#!/bin/bash
echo "Hola desde alpine"
```
Dar permiso de ejecución:
`chmod +x app.sh`


### Dockerfile
Creando un `Dockerfile`
* No tiene una extensión como `.py`, `.sh`, etc.
* Docker lo detecta automáticamente al momento de construir la imagen
* Debe estar en la raíz del directorio donde está tu proyecto o los archivos que quieres copiar a la imagen.

```bash
# 1. Imagen base ligera
FROM alpine:3.18 # Según su tag

# 2. Autor/Etiqueta (Opcional, buena práctica)
LABEL maintainer="tu-nombre@correo.com"

# 3. Actualiza e instala dependencias
RUN apk update && apk add --no-cache \
    bash \
    curl

# 4. Crea un directorio
WORKDIR /app

# 5. Copia archivos locales al contenedor
COPY . /app # (.) Directorio actual

# 6. Expone el puerto (ejemplo: app en puerto 8080)
EXPOSE 8080

# 7. Comando por defecto
CMD ["./app.sh"] # Ejecuta el script

```

### Construir  y correr
1. Construir la imagen:

    #### **Sintaxis:**
    `docker build [OPTIONS] PATH`

    #### **Ejemplo básico:** 
    `docker build .`
    > Construye una imagen usando el `Dockerfile` en el directorio actual (.)

    #### **Construyendo**

    ```bash
    docker build -t mi-app-alpine .
    ```

    > `-t` Esta opción permite agregarle un tag(Etiqueta)

2. Ejecutar un contenedor
    ss
    ```bash
    docker run --rm mi-app-alpine
    ```




