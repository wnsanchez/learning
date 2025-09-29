# VOLÚMENES | Volume
Un volumen es un mecanismo para persistir datos generados o usados por contenedores.

## 1. ¿Por qué usarlos?
* Guardar datos de una base de datos.
* Servir archivos estáticos desde tu host.
* Compartir información entre contenedores.
* Hacer backup fácilmente.


## 2. Primer contacto (bind mount)
```bash
docker run -v $(PWD)/data:/app/dat alpine
```
* $(pwd)/data: carpeta en tu host.
* /app/data: carpeta dentro del contenedor.

> Lo que pongas en tu carpeta local aparecerá dentro del contenedor, y viceversa.

## 3. Vólumenes administrados por docker
Docker puede crear volúmenes automáticamente sin ruta en el host:
```bash
docker volume create mi_volumen
```
Luego lo usas:
```bash
docker run -v mi_volumen:/app/data alpine
```
Docker guarda los datos en una ruta tipo:
```bash
/var/lib/docker/volumes/mi_volumen/_data/
```
> Los contenedores ven /app/data, pero los datos están seguros fuera del contenedor.

## 4. Comparación: Bind Mount vs Volume

| Aspecto      | Bind Mount (`/path:/path`) | Volume (`nombre:/path`) |
| ------------ | -------------------------- | ----------------------- |
| Control      | Tú eliges la carpeta       | Docker lo gestiona      |
| Portabilidad | Menor                      | Mayor (en producción)   |
| Seguridad    | Depende del host           | Aislado del host        |
| Backup fácil | ❌ (manual)                 | ✅                       |
| Ideal para   | Desarrollo                 | Producción / datos      |


## 5. Operaciones extras
### Ver todos los volúmenes
```bash
docker volume ls
```

### Ver detalles de un volumen
```bash
docker volume inspect nombre_volume
```

### Eliminar volumen
```bash
docker volume rm nombre_volume
```

### Eliminar todos los no usados
```bash
docker volume prune
```

> ¡Cuidado! Elimina volúmenes sin contenedores activos.

### 6. Volúmenes avanzados

####  Backup de volumen:

```bash
docker run --rm -v mi_volumen:/volume -v $(pwd):/backup alpine tar czf /backup/backup.tar.gz -C /volume .
```

#### Restaurar:

```bash
docker run --rm -v mi_volumen:/volume -v $(pwd):/backup alpine tar xzf /backup/backup.tar.gz -C /volume
```

#### Compartir entre contenedores
```bash
docker run -d --name contenedor1 -v datos:/app/data alpine
docker run -it --name contenedor2 --volumes-from contenedor1 alpine
```

Ambos acceden al **mismo volumen**.


