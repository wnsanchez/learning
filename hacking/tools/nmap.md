# NMAP | Network Mapper
Es una herramienta de escaneo de red usada para:
  * Descubrir hosts activos
  * Detectar puertos abiertos
  * Identificar servicios y versiones
  * Detectar sistemas operativos
  * Encontrar vulnerabilidades (con scripts)

## 1. Conceptos
### Hosts
Dispositivo en la red (PC, servidor, router).

Ejemplo: `192.168.1.10`

### TCP
Nmap envía paquetes SYN y espera respuestas (SYN/ACK o RST) para determinar si un puerto está abierto, cerrado o filtrado. Es rápido y preciso.

Opciones comunes: `-sS` (SYN scan), `-sT` (connect scan)

### UDP
UDP es sin conexión, por lo que Nmap envía paquetes vacíos o con payload específico. Si no hay respuesta, el puerto puede estar abierto o filtrado (ambigüedad común). 

Opción: `-sU`.

> Es más lento y menos confiable que TCP, ya que muchos servicios no responden.

### Puerto 
Es un número lógico `(0 - 65535)` que identifica un punto de comunicación en un disposotivo. 

Actúa como puerta por donde entra o sale el tráfico de red.

### Servicio
Es un programa o proceso que está escuchando en un `puerto` específico para responder solicitudes.


## 2. Tipos de escaneo

### a. TCP SYN Scan (Stealth Scan)
```bash
nmap -sS 192.168.1.10
```
  * No completa handshake
  * Más sigiloso
  * Requiere `root`

### b. TCP Connect Scan
```bash
nmap -sT 192.168.1.10
```
  * Completa el handshake
  * Más detectable
  * No necesita root

### c. UDP Scan
```bash
nmap -sU 192.168.1.10
```
  * Más lento
  * Menos confiable
  * Útil para DNS (53), SNMP (161)

### d. Versión detection
```bash
nmap -sV 192.168.1.10
```
> Detecta servicio y versión exacta

### e. Detección de SO 
```bash
nmap -O 192.168.1.10
```
> Detecta si es: Linux, Windows, router, etc.

### f. Escaneo agresivo 

```bash
nmap -A 192.168.1.10
```
Incluye: 
  * OS 
  * Versión detection
  * Script scanning
  * Traceroute

## 3. Ejemplos

### Scanneo simple


## 3. SCRIPTS
Verificar scripts hay 
```bash 
ls -l /usr/share/nmap/scripts
```
