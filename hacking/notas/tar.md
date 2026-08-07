# TAR
Comando `tar` en Linux es fundamental para **archivar y comprimir archivos y directorios**.

|Opciones permiten crear, extraer listar y gestionar archivos `.tar`, `.tar.gz`, `tar.bz2`, entre otros formatos.

## Opciones
  * `-c`: Crea un archivos tar.
  * `-x`: Extrae archivos desde un archivo tar.
  * `-t`: Lista el contenido de un archivo tar sin extraerlo.
  * `-f`: Especifica el nombre del archivo tar (debe ir al final de las opciones)
  * `-v`: Ejecuta el comando en modo detallado (verbose)
  * `-z`: Comprime o descomprime con gzip (crea archivos .tar.gz o .tgz)
  * `-j`: Comprime o descomprime con gzip ( crea archivos `.tar.bz2` o `.tbz`)
  * `-J`: Comprime o descomprime con xz (crea archivos `.tar.xz`)
  * `-C`: Especifíca el directorio de destino al extraer archivo.


## Usos
  * Crear un archivo tar sin compresión
    ```
    tar -cvf archivo.tar directorio/
    ```
  * Crear un archivo comprimido con gzip
    ```
    tar -czvf rchivo.tar.gz 
    ```
    * Extraer un archivo tar.gz
    ```
    tar -xzvf archivo.tar.gz
    ```
  * Extraer en un directorio específico
    ```
    tar -xzvf archivo.tar.gz -C /ruta/destino/
    ```
  * Listar contenido de un archivo tar:
    ```bash
    tar -tvf archivo.tar.gz
    ```
  * Extraer archivos específicos con comodines:
    ```bash
    tar -tvf archivo.tar.gz "*.txt"
    ```
