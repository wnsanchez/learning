# REDES | NETWORK
## **¿Por es importante las redes?**
Porque los contenedores no viven solos:
* Una app web necesita hablar con una base de datos.
* Un backend necesita hablar con una API.
* Necesitas exponer tu app al navegador.

> Todo eso se hace con redes Docker.

## Red Docker
Una red Docker es como una red virtual privada para tus contenedores. Les permite comunicarse como si estuvieran conectados por un switch local.

### 1. Fundamentos
#### Tipos de redes por defecto
Al instalar Docker, ya tienes varias redes predeterminadas lo vemos con `docker network ls`

Resultado:
```bash
NETWORK ID     NAME      DRIVER    SCOPE
a1b2c3d4e5f6   bridge    bridge    local
b7c8d9e0f1a2   host      host      local
c3d4e5f6a7b8   none      null      local
```

#### Lo que pasa por defecto
Cuando haces: `docker run -d --name web nginx`
> Docker **conecta automáticamente** ese contenedor a la red bridge.

### 2. Comunicación entre contenedores 
Por defecto, dos contenedores en la red bridge NO pueden verse por nombre. Solo por IP (y eso no es confiable).

> No puedes hacer ping ejemplo `ping name_container`

#### Crear una red propia (bridge personalizada)
```bash
docker network create red_test
```

#### Crear contenedores
```bash
# Contenedor con Nginx
docker run -dit --name nginx --network red_test nginx

# Dos contenedores Alpine para pruebas
docker run -dit --name cliente1 --network red_test alpine sh
docker run -dit --name cliente2 --network red_test alpine sh
```

#### Instalar herramientas en alpine (ping, curl)
Por defecto, Alpine viene muy básico.

Entrar a un cliente: `docker exec -it cliente1 sh`

Dentro del contenedor:
```bash
apk update
apk add iputils curl
```
Puedes probar :
```bash
ping nginx
curl http://nginx
```

#### ¿Qué está pasando?
* Todos los contenedores están en la red red_test.
* Pueden comunicarse entre sí por nombre de contenedor (nginx, cliente1, etc.).
* No necesitas exponer puertos con -p porque están dentro de una red privada de Docker.



### 3. Comandos extras
#### Eliminar una red
```bash
docker network rm nombre_red
```