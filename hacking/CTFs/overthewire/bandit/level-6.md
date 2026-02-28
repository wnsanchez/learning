# LEVEL 6

## Búsqueda por grupo o usuario
Usando el comando `find` podemos usar sus opciones para encontrar según a quién pertenezca ya sea usuario y grupo

Opciones: 
  * `-user`: Especificar usuario
  * `-group`: Especificar grupo

```bash
find / -size 100M -type f -user user1 -group group1 
```

Muchas veces no tendremos acceso a ciertos lugares, la salida se mezclará con errores para controlar esto usamos `2>/dev/null`

Donde `2` representa STDERR y lo mandamos al `/dev/null` que es como un agujero negro todo lo mandado desaparece 

```bash
find / -size 100M -type f -user user1 -group group1 2>/dev/null
```