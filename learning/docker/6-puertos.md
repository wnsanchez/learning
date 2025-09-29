# PUERTOS
En Docker, los contenedores viven aislados. Si levantas un servidor web dentro de un contenedor, no puedes acceder a él desde tu navegador a menos que expongas (abras) un puerto hacia afuera.

## 1. Mapeo de Puertos con `-p`
```bash
docker run -p PUERTO_HOST:PUERTO_CONTENEDOR imagen
```

## 2. Primer ejemplo práctico
### Paso 1: Ejecutar nginx sin mapeo de puertos
```bash
docker run -d --name nginx-sin-puerto nginx
```
Este contenedor está corriendo, pero si visitas http://localhost, no verás nada.

### Paso 2: Ejecutar nginx con puerto mapeado
```bash
docker run -d --name nginx-con-puerto -p 8080:80 nginx
```
* 80 es el puerto dentro del contenedor (nginx siempre escucha ahí).
* 8080 es el puerto en tu máquina (host).
Ahora visita:
```bash
http://localhost:8080
```
Verás la página de bienvenida de nginx.


## 3. Revisar que puertos usa un contenedor
Usando `docker ps`

Veras una salida como:
```ouput
PORTS                  NAMES
0.0.0.0:8080->80/tcp   nginx-con-puerto
```
> Esto te dice que el puerto 8080 de tu máquina está redirigido al 80 del contenedor.

## 4. Cambiar el puerto del host
Puedes mapear el puerto del contenedor a cualquier puerto libre en tu host.
```bash
docker run -d --name nginx-otra -p 3000:80 nginx
```

> Nota: Un puerto del host solo puede ser usado por un contenedor a la vez.

