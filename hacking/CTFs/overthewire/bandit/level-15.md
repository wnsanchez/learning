# LEVEL 15
Conexión cifrada

## SSL/TLS 
`SSL` (Secure Sockets Layer) y su versión moderna `TLS` (TRansport Layer Security).

Son protocolos que:
  * Cifran la comunicación
  * Verifican la identidad del servidor
  * Proteger datos en tránsito

En linux se usan comúnmente con:
  * HTTPS = `HTTP` + `TLS` -> 443
  * SMTPS = `SMTP` + `TLS` -> 465
  * FTPS  = `FTP` + `TLS`  
  * IMAPS -> 993
  * POP3S -> 995

### TLS Hadndshake
Es el proceso inicial donde:
  * Cliente y servidor se presentan
  * Acuerdan como van a cifrar la comunicación
  * Verifican identidad (certificación)
  * Generan claves de sesión
  * Empieza la comunicación cifrada

> El proceso donde cliente y servidor acuerdan cómo hablar de forma cifrada antes de intercambiar datos reales.

### CIPHER SUITE
Es el conjunto de algoritmos que TLS usa para proteger la conexión.

> Cuando ocurre el TLS handshake, cliente y servidor negocian qué cipher suite usar

Que incluye un Cipher Suite:
  * Algoritmo de intercambio de claves
  * Algoritmo de autenticación
  * Algoritmo de cifrado simétrico
  * Algoritmo de integridad (hash/MAC)

> Es el combo específico de algoritmos que definen cómo se cifrará y protegerá una conexión TLS.

## 2. Comando `openssl`
Es utilizada para gestionar tareas de seguridad criptográfica, como la generación de claves, certificados digitales, solicitudes de firma de certificados (CSR), cálculo de resúmenes de mensajes y depuración de conexiones TLS. 

### Uso básico
```bash
# CONEXIÓN
openssl s_client -connect host:puerto
```

#### **TLS Handshet**
```ouput
SSL handshake has read 1234 bytes and written 456 bytes
```

#### **Cipher Suite**
```ouput
Cipher is TLS_AES_256_GCM_SHA384
```

| Parte   | Significado       |
| ------- | ----------------- |
| TLS     | Protocolo         |
| AES_256 | Cifrado simétrico |
| GCM     | Modo de operación |
| SHA384  | Función hash      |

Importancia:
  * Algunos retos requieren forzar un cipher específico
  * Algunos servidores solo aceptan cifrados débiles
  * Algunas vulnerabilidades dependen del cipher

Ejemplos:
  * Ataques a RC4
  * Ataques a 3DES
  * Problemas con TLS 1.0
  * Downgrade attacks


## Comando `ncat`
Alternativa a `openssl s_client`.

Primero, diferencia rápida:
  * `nc` -> netcat clásico (no soporta SSL)
  * `ncat` -> versión mejorada de Nmap (sí soporta SSL)

> No son lo mismo

Soporta:
  * SSL/TLS
  * Proxy
  * IPv6
  * Scripts
  * Modo escucha avanzado

### Conexión básica
En vez  de
```bash
openssl s_client -connect localhost:30001
```
Puedes usar:
```bash
ncat --ssl localhost 30001
```
`ncat` automáticamente:
  * Hace el TLS handshake
  * Negocia cifrado
  * Te deja en modo interactivo


