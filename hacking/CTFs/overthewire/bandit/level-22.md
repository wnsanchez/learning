# LEVEL 22

## SCRIPTS

### `md5sum`
Sirve para calcular y verificar el hash MD5 de un archivo.

Un hash MD5 es una cadena hexadecimal de 32 caracteres que funciona como una “huella digital” del archivo. Si el archivo cambia aunque sea un solo byte, el hash también cambia.

> Uso: Verificar integridad de archivos

Muy común cuando descargas:
  * ISOs de Linux
  * Programas grandes
  * Backups

Ejemplo: Si la página oficial dice que el MD5 es correcto es:
```bash
5d41402abc4b2a76b9719d911017c592
```
Y tu resultado coincide → el archivo no está corrupto.

Si es diferente → el archivo se dañó o fue modificado.

#### Ejemplo
```bash
md5sum imagen.iso
```
Salida típica:
```bash
5d41402abc4b2a76b9719d911017c592  imagen.iso
```
  * La primera parte → es el hash MD5
  * La segunda parte → es el nombre del archivo


### `cut`
Su función principal es cortar o filtrar partes de cada línea basándose en bytes, caracteres o campos delimitados. 

Uso básico:
  * `-d DELIM`: Define el delimitador (por defecto es espacio o tabulador)
  * `-f N`: Selecciona el campo número N.

```bash
echo "uno dos tres" | cut -d " " -f1
```
Salida: `uno`

