# LEVEL 14
Nivel donde se trata una conexión sin cifrar.

## 1. Conceptos

### Protocolos de transporte (TCP/IP)
#### TCP: es orientado a conexión
  * Hace handshake (SYN,SYN-ACK,ACK)
  * Garantiza entrega
  * Garantiza orden
  * Es confiable

##### **Three-Way Handshake** 
Se llama apretón de manos en 3 pasos.

TCP necesita establecer una conexión antes de enviar datos.

**PASO 1** | SYN

Tú máquina dice: “Hola, quiero conectar al puerto 30000” y envía un paquete con flag `SYN` 

**PASO 2** | SYN-ACK

Servidor responde: Hola, sí estoy escuchando y envía un `SYN + ACK`

**PASO 3** | ACK

Tu máquina responde: `ACK`

Ahora la conexión está establecida

Ahora sí se hace el envío de datos y este garantiza orden, entrega, integridad.

Se usa para cosas como: `SSH`, `HTTPS`, `Login Systems`

#### UDP: es sin conexión
  * No handshake
  * No confirma recepción 
  * No garantiza orden
  * Es más rápido
  * Más simple

Datos:
  
UDP es más díficil de monitorear porque:
  * No hay sesión establecida
  * No hay handshake
  * Es más fácil falsificar IP (spoofing)

Se usa en `DNS`(puerto 53), `Juegos online`, Streaming, VoIP, DHCP.

### Puerto
  * Son **"puertas"** numeradas donde los servicios escuchan conexiones


## 2. Comando `ss`
Herramienta para analizar conexiones de red. 

```bash
ss -tuln
```

| Opción | Significado                              |
| ------ | ---------------------------------------- |
| `-t`   | TCP                                      |
| `-u`   | UDP                                      |
| `-l`   | Listening (escuchando)                   |
| `-p`   | Muestra el proceso asociado al socket    |
| `-n`   | No resolver nombres (más rápido y claro) |

## 3. Comando `nc` | Navaja suiza en redes
Abreviatura de `netcat` es una herramienta que permite leer y escribir datos a través de conexiones de red utilizando TCP o UDP. 

### Uso básico
#### Escuchar en un puerto
```bash
nc -lvnp 4444
nc -luvnp 4444
```
  * `-l`: listen/ Modo escucha
  * `-u`: Usa UDP
  * `-v`: Modo verbose (detallado)
  * `-n`: Sin resolución DNS
  * `-p`: Puerto local para escuchar o conectar


### Conectar a un puerto

```bash
nc <IP> puerto
nc localhost 30000 # localhost = 172.0.0.1
```

Desglosemos:
  * nc → ejecuta netcat
  * localhost → se conecta a tu misma máquina (127.0.0.1)
  * 30000 → puerto al que te conectas

Si escribe y se muestra en el otro lado y viceversa

### Escanear un puerto abierto
```bash
nc -zv <IP> <PUERTO>
nc -zv 192.168.10.12 22 # Reconocimiento básico 
```


## 3. Extra

### `netstat`
Es como `ss` que sirve para mostrar información sobre conexiones de red, sockets y estadísticas. 

Es más lento ya que consulta lo hace en `/proc/net` y `ss` más rápido, eficiente porque obtiene directamente la información del kernel de Linux mediante el protocolo netlink,

Forma parte de la suite de net-tools, que está en desuso en muchas distribuciones modernas y `ss` forma parte de `iproute2` conjunto de herramientas modernas.

> `ss` es el futuro, `netstat` es el pasado
