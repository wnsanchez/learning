# ARQUITECTURA DOCKER

## 📦 Arquitectura básica de Docker

### 1. **Docker Client (Cliente)**

* Es la interfaz de línea de comandos (CLI) que usas para comunicarte con Docker.
* Comandos como `docker run`, `docker build`, `docker ps` vienen de aquí.
* El cliente envía solicitudes al **Docker Daemon** para que realice las acciones.

---

### 2. **Docker Daemon (Dockerd)**

* Es el motor principal que corre en segundo plano (background) en tu máquina.
* Se encarga de construir, ejecutar y distribuir contenedores.
* Escucha las peticiones del cliente Docker y gestiona objetos Docker (imágenes, contenedores, redes, volúmenes).

---

### 3. **Docker Registry**

* Es el lugar donde se almacenan las imágenes Docker.
* Puede ser público (como Docker Hub) o privado.
* Cuando haces `docker pull`, descargas imágenes de aquí; cuando haces `docker push`, subes imágenes.

---

### 4. **Docker Images (Imágenes)**

* Son plantillas inmutables que contienen todo lo necesario para crear un contenedor (código, runtime, librerías, configuraciones).
* Se construyen a partir de un `Dockerfile`.
* Puedes pensar en ellas como snapshots listos para ejecutar.

---

### 5. **Docker Containers (Contenedores)**

* Son instancias en ejecución de una imagen.
* Aislados, pero usan recursos del sistema operativo host.
* Se ejecutan procesos específicos y pueden ser efímeros o persistentes (si usas volúmenes).

---

### 6. **Docker Objects adicionales**

* **Volumes**: para almacenamiento persistente fuera del ciclo de vida del contenedor.
* **Networks**: para comunicar contenedores entre sí o con el exterior.
* **Docker Compose**: herramienta para definir y administrar aplicaciones multi-contenedor con un archivo YAML.

---

## 🔗 Flujo básico (Cliente → Daemon → Registro → Contenedor)

1. El usuario usa Docker Client para pedir crear un contenedor.
2. El cliente envía el pedido al Docker Daemon.
3. El daemon verifica si la imagen está local o la descarga desde el Docker Registry.
4. El daemon crea y ejecuta el contenedor basado en la imagen.
5. El contenedor corre el proceso definido (por ejemplo, un servidor web).

---

## 🖼️ Resumen visual

```
+-----------------+        +-----------------+        +------------------+
|  Docker Client  | <----> |  Docker Daemon  | <----> | Docker Registry  |
+-----------------+        +-----------------+        +------------------+
                                |
                                v
                         +--------------+
                         | Docker Images|
                         +--------------+
                                |
                                v
                         +--------------+
                         | Docker Container |
                         +--------------+
```

---

