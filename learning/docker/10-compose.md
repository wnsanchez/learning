# DOCKER COMPOSE
Docker Compose es una herramienta que te permite:
* Definir **múltiples contenedores** (servicios) en un solo archivo YAML.
* Configurar fácilmente redes, volúmenes, variables, puertos, etc.
* Levantar todo con un solo comando


## ESTRUCTURA BÁSICA
Usando un archivo llamado `docker-compose.yml`. En este archivo declaras qué servicios necesitas, cómo deben correr, y cómo se conectan entre ellos.

`docker-compose.yml` más simple posible:
```bash
version: "3.9"

services:
  web:
    image: nginx
    ports:
      - "8080:80"

```

## COMANDOS 

### Usando en el archivo `docker-compose.yml`
#### 1. `version`
Esto va en la parte superior para identificar que versión está escrito
```dockerfile
version: '3.3'
```

#### 2. `services`
Esto es el inicio de los contenedores
```dockerfile
services:
  # Tomar en cuenta la tabulación (dos espacios)
```

#### 3. `nombre` 
El nombre que va definir el contenedor con su configuración
```dockerfile
services:
  servicio1: # servicio1 es el nombre
    # Tabulación
  servicio2:
    # Tabulación
```

#### 4. `build`
Define el directorio donde estará ubicado el Dockerfile
```dockerfile
services: 
  servicio1:
    build: . # . (Es el directorio actual)
```
#### 5. `image`
Se utiliza para definir que imagen se usará para construirlo
```dockerfile
services:
  servicio1:
    image: nombre_imagen:tag
```

#### 6. `ports`
Esta instrucción publica puertos en los puertos expuestos (Depende de la imagen o Dockerfile)
```dockerfile
services:
  servicio1:
    ports: 
      - "8080:80" # PORT_HOST:PORT_IMAGEN
```

#### 7. `volumes`
Esta instrucción enumera los directorios que deben montarse en el contenedor desde el sistema operativo host.
```dockerfile
services:
  servicio1:
    volumes:  
      - pgdata:/var/lib/postgresql/data

volumes:
  pgdata:

```

* volumes: bajo el servicio servicio1 → dice: usa el volumen llamado pgdata para guardar los datos de la base de datos.

* volumes: al final del archivo → declara ese volumen, para que Docker lo cree si no existe.

#### 8. `environment`
Se utiliza para pasar variables de entorno (no seguras), es decir, contraseñas, nombres de usuario, configuraciones de zona horaria, etc.
```dockerfile
services:
  servicio1:
    environment:
          - MYSQL_DATABASE=ecommerce
```

#### 9. `networks`
Esta instrucción define qué redes formarán parte de los contenedores
```
services:
  servicio1:
    networks:
      - ecommerce
  servicio2:
    network:
      - ecommerce

networks:
  ecommerce
```

### Usando `docker-compose <opciones>`
#### 1. `up`
```
docker-compose up
```

Creará, construirá e iniciará los contenedores especificados en el archivo `compose`

Forzar reconstrucción de la imagen ya construida al editar el archivo `docker-compose up --build`

> Nota: Actuará sobre el archivo docker-compose.yml dentro del directorio actual

#### 2. `start`
Esto iniciará pero requiere que los contenedores del archivo ya esten construidos.
```
docker-compose start
```

#### 3. `down`
Este comando detendrá y eliminará los contenedores especificados en el archivo.

```
docker-compose down
```

#### 4. `stop`
Solo detendrá los contenedores de acuerdo al archivo.

```
docker-compose up
```

#### 5. `build`
Este comando creará (pero no iniciará) los contenedores de acuerdo al archivo.

```
docker-compose build
```



