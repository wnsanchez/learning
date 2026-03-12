# LEVEL 24

## Conexión con `nc`
Automatizar conexión con `nc` e intentar varios envíos de para obtener la contraseña del siguiente nivel.

Conexión a con `nc`
```bash
nc <IP> <Puerto>
```
Enviar antes de conectarse
```bash
echo "Mensaje" | nc <IP> <Puerto>
```
Usar contraseña de bandit 24 más un PIN (0000 - 9999)
```bash
echo "Contraseña PIN" | nc <IP> <Puerto>
```

## Bucle FOR
```bash
for variable in lista_de_valores
do
    comando1
    comando2
    # ...
done
```
En una línea
```bash
for i in lista;do comando;done
```
  * `variable`: Nombre de la variable que toma cada valor de la lista.
  * `lista_de_variables`: Puede ser una lista explícita, un rango numérico, una expansión de comodines (como `*.txt`) o la salida de un comando.
  * `do` y `done`: delimitan el bloque de comandos a ejecutar.

### Ejemplos
```bash
# Imprimir números del 1 al 5
for i in 1 2 3 4 5
do
    echo "$i"
done

# Usar rango con sintaxis {inicio fin} (Bash 3.0+)
for i in {1..5}
do
    echo "Número: $i"
done

# Usar incremento en el rango (Bash 4.0+)
for i in {0..10..2}
do
    echo "Valor: $i"
done

```

## SCRIPT
```bash
for i in {0000..9999};do echo "$password $PIN";done | nc localhost 30002 | grep -vE "Wrong|I am"
```



