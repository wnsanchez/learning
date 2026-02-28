# LEVEL 12

Múltiples compresiones y hexadecimal.

## Comandos

### `xxd`
`xxd` convierte archivos binarios en hexdump (vista hexadecimal).

**Opciones**:
  * `-p`: Muestra solo hex (sin ASCII)
  * `-l`: Mostrar solo cierta cantidad `xxd -l 32 archivo`
  * `-s`: Saltar byte, empezar desde un byte específico
  * `-r`: Convertirlo en binario

### `tar`
Herramienta esencial en Linux y otros sistemas Unix que sirve para empaquetar archivos y directorios en un solo archivo.

**Opciones:**
  * `-c`: Crea un archivo tar
  * `-v`: Modo verbose
  * `-f`: Especifíca el archivo
  * `-z`: Comprime o descomprime archivo `gzip`
  * `-j`: Comprime o descomprime archivo `bz2`
  * `-J`: Comprime o descomprime archivo `xz`

**Ejemplo:**
```bash
# Crear archivos tar
tar -cvf archivo.tar /directorio

# Crear archivo tar.gz
tar -czvf archivo.tar.gz *.txt

```

> Ver más sobre [tar](../../../notas/tar.md)

### `gunzip`
Comandos `gzip` y `gunzip` son complementarios en Linux para comprimir y descomprimir respectivamente.

```bash
# Comprimir gzip 
gzip archivo.txt # Crea txt.gz y elimina el original

# Descomprimir gunzip
gunzip archivo.gz 
gzip -d archivo.gz
```

### `bunzip2`
Comandos `bzip2` y `bunzip2` son complementarios en Linux para comprimir y descomprimir respectivamente.

