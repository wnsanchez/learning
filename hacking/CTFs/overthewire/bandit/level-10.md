# LEVEL 10

## Decodificar 
Para decodificar el contenido es usar el comando `base64`.

Para encriptar un contenido:
```bash
base64 archivo.txt
```

Para desencriptar un contenido
```bash
base64 -d archivo.txt
cat archivo.txt | base64 -d
```


> Si ves letras raras + `=` al final → piensa Base64
