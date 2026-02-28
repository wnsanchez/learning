# LEVEL 9

##  Archivos binarios
El reto es extraer contenido legible de un archivo binario que su contenido es texto no puro, como ejecutables (.exe o ELF en Linux), imágenes, archivos comprimidos, librerías, etc.

El comando `strings` nos permite extraer archivos legible de un binario

```bash
strings archivo | grep "==="
```




