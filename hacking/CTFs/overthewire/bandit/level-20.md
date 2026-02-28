# LEVEL 20
Comunicación entre procesos estos usan el kernel como intermediario.

## 1. Conceptos

### Procesos
Un proceso puede:
  * Escuchar 
  * Conectarse
  * Enviar datos
  * Recibir datos

### Puerto
Actúa como un punto final lógico de comunicación para aplicaciones y servicios de red.

### Socket
Un socket es un endpoint de comunicación.

Es como un “enchufe” donde un proceso puede:
  * Enviar datos
  * Recibir datos

Un socket conecta: `Proceso ↔ Socket ↔ Red (o sistema)`

El puerto es solo una parte del socket.

Un proceso no escucha directamente en un puerto.
El proceso crea un socket, y ese socket se asocia a un puerto.

El kernel mantiene una tabla interna:
```bash
Socket ↔ File Descriptor ↔ Proceso (PID)
```
> En Linux, un socket es un file descriptor.

Por eso lo podemos ver:
```bash
ls -l /proc/<PID>/fd
```
Y verás algo como:
```bash
socket:[12345]
```

### IP:PUERTO

#### `localhost`
`127.0.0.1" es una dirección especial.

Significa:
> "Esta misma máquina"

  * No sale internet
  * No usar una red física
  * Es un loop interno del kernel.

Si está en `127.0.0.1`, el kernel simplemente:
> No expone ese puerto a la red externa.

#### `0.0.0.0`
Significa:
> Escuchar en **todas las interfaces de red**.

Eso incluye:
  * 127.0.0.1 (loopback)
  * IP privada (ej. 192.168.x.x)
  * IP pública (si existe)


**Concepto fundamental**

Un puerto no es global.

Un puerto pertenece a:
```
IP + Puerto
```

Ejemplo:

```
127.0.0.1:4000
192.168.1.10:4000
```
Son sockets distintos.


