# PRUNE
Docker tiene varios comandos prune que eliminan recursos no utilizados (es decir, que están detenidos, sin usar o sin referencia).


## 1. `docker container prune`
* Elimina todos los contenedores detenidos (no los que están corriendo).

Te pedirá confirmación
```bash
WARNING! This will remove all stopped containers.
Are you sure you want to continue? [y/N]
```

## 2.  `docker image prune` 
* Elimina todas las imágenes "dangling" (colgantes), es decir, imágenes sin etiqueta (<none>) que no están asociadas a ningún contenedor.

Ejemplo de imagen "dangling"
```bash
<none>    <none>    abc123...
```

## 3. `docker volume prune`
* Elimina todos los volúmenes que no estén en uso por algún contenedor.
* Los volúmenes son donde se guarda información persistente (como datos de bases de datos).
> Mucho cuidado aquí si usás volúmenes y querés mantener datos.

## 4. `docker network prune`
* Elimina redes no utilizadas por contenedores.

> No afecta redes como `bridge`, `host` o `none`.

## 5. `docker system prune`
* Elimina TODO lo que no esté en uso:


| Recurso      | ¿Lo elimina?                            |
| ------------ | --------------------------------------- |
| Contenedores | ✅ Detenidos                             |
| Imágenes     | ✅ No usadas / `<none>`                  |
| Volúmenes    | ❌ No los elimina (a menos que lo pidas) |
| Redes        | ✅ No utilizadas                         |

---

### Para una limpieza profunda
```bash
docker system prune -a --volumes
```
* -a: también elimina imágenes no referenciadas.
* --volumes: también limpia volúmenes sin usar


