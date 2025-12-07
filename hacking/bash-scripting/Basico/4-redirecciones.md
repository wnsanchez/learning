# REDIRECCIONES

## Usos principales
### Enviar stdout a un archivo
```bash
echo "Hola" > archivo.txt
```

### Hacer un append (Añade)
```bash
echo "Mundo" > archivo.txt
```

### Enviar errores al agujero negro (/dev/null)
```bash
comando 2>/dev/null
```

### Enviar a stderr y stdout al mismo archivo o al /dev/null
```bash
# Version antigua
comando > normal.txt 2>&1
# Versión moderna
comando &>ambos.txt
```

### Enviar a stderr y stdout por separado
```bash
comando > salida.log 2>error.log
```

## Comando `exec`
  * Sirve para manipular descriptores (FDs)
  * Ejecutar programas reemplazando el shell actual

### Redirigir FDs (stderr, stdout)
```bash
# Ejemplo
exec 1>salida.txt
echo "hola" # Redirige a salida.txt no aparece en pantalla
```

### Nuevo descriptor
#### Crear FDs para escribir
```bash
exec 3>log.txt
```
Usando:
```bash
echo "Hola" >&3 # Stdou va a log.txt
```

#### Crear para para leer
```bash
exec 4< entrada.txt
```
Usando:
```bash
cat <&4
```

#### Cerrando descriptores
```bash
exec 3>&-
exec 4>&-
```

#### Copiar descriptor y eliminar
```bash
# Copiar 3 a 4
exec 4>&3 # Copia
exec 4>&3- # Copia y eliminar al FD 3
```


