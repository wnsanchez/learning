# FIND
Encontrar archivos

### 1. Nombre
```bash
find / -name passwd 2>/deb/null
```

### 2. Tamaño
```bash
# Megabytes - M
find -size +100M
# GIGAS - G
find -size +1G
# Kilobytes -k
find -size -1k
```

### 3. Usuario
```bash
find / -user usario 2>/dev/null
```

### 4. Grupo
```bash
find / -group grupo 2>/dev/nul
```

### 5. Tipo
```bash
# Archivo
find -name nombre -type f 2>/dev/null
# Directorio
find -group grupo -tupe d 2>/dev/null
```

### 6. SUID
```bash
find / -perm -4000 2>/dev/null
```

### 7. SGID
```bash
find / -perm -2000 2>/dev/null
```


### 8. STICKY
```bash
find / -perm -1000 1>/deb/null
```

