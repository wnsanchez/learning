# LEVEL 11

## ROT 13
**ROT13** significa *"rotar 13 posiciones"*

Es solo un cifrado por sustitución muy simple:
  * Solo afecta a las letras del alfabeto latino (A-Z, a-z)
  * Cada letra se sustituye por la que está **13 posiciones adelante** 
  * Si se llega al final del alfabeto, se vuelve al principio 


> No es seguridad. Es **ofuscación reversible**.

Ejemplo: 
```
A → N
B → O
C → P
...
N → A
```

> Aplicar ROT13 **dos veces devuelve el texto original**


### Usando `tr`
Traduce carácter por carácter, sin entender palabras, líneas o contexto.

```bash 
cat archivo | tr "A-Za-Z" "N-ZA-Mn-za-m" 
```

**¿Qué significa `A-Za-z`?**
Esto define el **conjunto de entrada**:
  * `A-Z` -> mayúsculas
  * `a-z` -> minúsculas

Ordenadas exactamente así.
Internamente `tr` crea algo como:
```bash
[A, B, C, ..., Z, a, b, c, ..., z]
```
**¿Qué significa `N-ZA-Mn-za-m`?**
Este el `conjunto de salida`, mismo tamaño y orden.

Desglose:

* `N-Z` → letras de la N a la Z
* `A-M` → vuelve al inicio
* lo mismo para minúsculas

Visualmente:

```
Entrada:  A B C D ... M N O ... Z
Salida:   N O P Q ... Z A B ... M
```

`tr` hace una **sustitución posicional**:

```
entrada[i] → salida[i]
```

Nada más. Nada menos.