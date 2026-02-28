# LEVEL 1

## Archivos con nombre `-`
Al intentar leerlos con `cat`, este lo toma cmo una opción y se queda esperando (STDIN)

Forma correcta de leerlos:
```bash
cat ./-
```
> Usando la ruta relativa


### Otras formas
```bash
cat /ruta-basoluta/-
```

```bash
grep -r "\w" 2>/dev/null | tail -n 1 | tr ':' ' ' | awk '{print $2}'
```




