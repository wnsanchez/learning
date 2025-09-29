# ETIQUETA | TAG

## 1. ¿Qué es?
Son una forma de identificar y versionar imágenes.

Puedes buscar las etiquetas disponibles de una imagen en Docker Hub:

Por ejemplo: [https://hub.docker.com/_/nginx/tags](https://hub.docker.com/_/nginx/tags)

### Sintaxis
```bash
<repositorio>:<etiqueta>
```
Ejemplo:
```bash
alpine:3.19
nginx:latest
ubuntu:22.04
```
> La etiqueta (tag) es simplemente un alias o versión de esa imagen.

### 2. Default
Si no usas una etiqueta, docker usa la versión por defecto `:lasted` (actual)
```bash
docker pull alpine
```
> Esto en realidad baja alpine:latest.

### 3. Múltiples tags
```bash
docker tag alpine:3.19 mi-alpine:pruebas
```
> Ahora tienes la misma imagen identificada como alpine:3.19 y mi-alpine:pruebas apuntando al mismo IMAGE_ID.

### 4. Son inmutables
* El repositorio puede actualizar nginx:latest y mañana no será la misma imagen que hoy.
* Por eso, en producción se recomienda usar etiquetas específicas (nginx:1.25.3) en lugar de latest.






