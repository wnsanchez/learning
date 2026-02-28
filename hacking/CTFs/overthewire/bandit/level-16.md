# LEVEL 16

## NMAP
Herramientas de escaneo nos permite ver host activos, servicios con sus versiones, puertos que usan estos servicios, permite usar scripts.

**Revisar teoría**: [NMAP](../../../tools/nmap.md)

### Uso
#### Básico
```bash
nmap <IP> 
```
Este comando usará por defecto `TCP SYN (-sS)` si se ejecuta con privilegios de root o administrador, ya que sin root usa `TCP Connect (-sT)`. 
  * TCP SYN -> no completa la conexión
  * TCP Connect -> completa la conexión

Además solo escanea los primero 1000 puertos.

#### Servicios
Buscar por rango de puertos específicos, además de ver las versiones de los servicios.
```bash
nmap -sV -p 31000-32000 localhost
```

Revisar los puertos abiertos con `SSL` ignorar los `ssl/echo` ya que estos repetirán lo que ingreses, los interesantes son `ssl/unknown`
