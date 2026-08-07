# AWK
Es un lenguaje completo de procesamiento de datos con su propio modelo mental

## Sintaxis
```bash
awk ' patrón {acción}' archivo
```
Por cada línea del input:
  * La divide en campos (`$1`, `$2`, `$3`, etc)
  * Evalúa el `patrón` (condición) - sí es verdadero, ejecuta
  * Ejecuta la `acción`(lo que se ve en entre `{}`)

Eso es TODO awk. Todo lo demás son variaciones sobre esta estructura. Si internalizás esto, el resto es sintaxis.

```bash
echo "root x 0 0" | awk ' {print $1, $3}' # root 0
```
### Variables claves
  * `$0` -> línea completa
  * `$1, $2, ...` -> campos individuales
  * `NF` -> Number of fields (cuántos campos tiene la línea)
  * `NR` -> Numbrer of Record ( número de línea actual)
  * `FS` -> Field Separator (por defecto: espacios/tabs)
  * `OFS` -> Ouput Field Separator

## Usos
Usando `empleados.txt`
```bash
ID:Nombre:Departamento:Edad:Salario:Ciudad
1001:Ana:Ventas:28:2500:Lima
1002:Carlos:Sistemas:35:4200:Trujillo
1003:María:Recursos Humanos:41:3900:Arequipa
1004:Luis:Sistemas:29:4100:Piura
1005:Elena:Ventas:33:2800:Chiclayo
1006:Jorge:Contabilidad:45:5000:Lima
1007:Patricia:Marketing:30:3400:Trujillo
1008:Diego:Sistemas:38:4600:Cusco
1009:Rosa:Contabilidad:27:3100:Piura
1010:Miguel:Marketing:50:5500:Arequipa
1011:Sofía:Ventas:26:2400:Lima
1012:Pedro:Sistemas:31:4300:Trujillo
1013:Lucía:Recursos Humanos:36:4000:Chiclayo
1014:Fernando:Contabilidad:48:5200:Cusco
1015:Valeria:Marketing:29:3300:Lima
```

### Básico
#### 1. Lector
Como `cat`
```bash
awk ' {print}' empleados.txt
```

#### 2. Campos
Por defecto separa por espacios y tab
```bash
echo "root x 0 0" | awk ' {print $1, $3}'
```

#### 3. Separador
Usando la opción `-F` y el caracter que separa, ejemplo `-F:` o `-F ':'`
```bash
awk -F: ' {print $1, $2}' empleados.txt
```
La coma entre `$1` y `$2` deja un espacio entre ellos, tiene que ver por el valor de la variable `OFS`, que por defecto es un espacio.

```bash
# Personalizarlo
awk -F: ' {print $1 "=" $2}' empleados.txt
```

#### 4. Mostrar 
Solo líneas que tengan un campo específico.
```bash
# Solo sistemas
awk -F: '$3=="Sistemas"' empleados.txt   
```

#### 5. Comparación
Mostrar líneas que cumplan con la condición
```bash
# Salario mayor a 4000
awk -F: '$5>4000' empleados.txt
```
Otro:
```bash
# Solo nombres de personas mayor a 35
awk -F: ' $4>35 {print $2}' empleados.txt 
```

#### 6. BEGIN y END
Para entender BEGIN y AND es pensar que `awk` trabaja en tres momentos:
  * Antes de leer el archivo → BEGIN
  * Mientras lee cada línea → el bloque principal
  * Después de terminar el archivo → END

##### BEGIN
Se ejecuta **una sola vez**, antes de leer la primera línea.

Se usa para:
  * Imprimir títulos
  * Inicializar variables
  * Cambiar el separador de salida (`OFS`)

Ejemplo:
```bash
awk 'BEGIN {print "Lista de empleados"} {print $0}' empleados.txt
```

##### Bloque principal
```bash
awk -F: '{print $2}'
```
Este bloque se ejecuta **una vez por cada línea**.

Si el archivo tiene 16 líneas, se ejecuta 16 veces.

##### END
Se ejecuta **una sola vez**, cuando ya terminó de leer el archivo

Es ideal para mostrar resultados finales

Ejemplo:
```bash
awk 'END {print "Fin del archivo"}' empleados.txt
```

#### 7. Contadores y Promedios
##### Contadores
```bash
awk -F: '$3=="Sistemas" {contador++} END {print contador}' empleados.txt
```

##### Promedios
```bash
# Acumulador (suma)
df -h | awk 'NR>1 {sum += $3} END {print "Total usado:", sum}'
```

#### 8. NR | Number of Record
Número de registros o líneas

##### Ver número de línea
```bash
awk '{print $NR, $0}' empleados.txt
```
##### Sin cabecera
Con `NR` podemos quitar la cabecera. 
```bash
awk 'NR>1 {print}' empleados.txt
```

##### Líneas específicas
```bash
# Una línea
awk 'NR==3 {print}' empleados.txt

# Rango
awk -F: 'NR==3, NR==7' empleados.txt
```

##### Total de líneas
```bash
awk 'END {print NR}' empleados.txt
```

#### 9. NF | Number of Field
Número de campos o columnas
##### Número de campos en una línea
```bash
awk -F: '{print NF}' empleados.txt
```

##### Mostras último campo
```bash
awk -F: '{print $NF}' empleados.txt
```

#### 10. Operadores lógicos
##### `&&` | `AND`
Empleados de sistemas con salario mayor o igual a 4300
```bash
awk -F: 'NR>1 && $3=="Sistemas" && $5 >= 4300 {print $2, $5}' empleados.txt
```
Debe cumplir las tres condiciones:
  * No es la cabecera
  * Departamento = Sistemas
  * Salario >= 4300

##### `||` | `OR`
Empleados de Ventas o Marketing
```bash
awk -F: 'NR>1 && ($3=="Ventas" || $3=="Marketing") {print $2, $3}' empleados.txt
```
Se imprime si pertenece a Ventas o MArketing

##### `!`  | `NOT`
Todos menos lo de Sistemas
```bash
awk -F: 'NR>1 && $3!="Sistemas" {print $2, $3}'
```
Otra forma equivalente:
```bash
awk -F: 'NR>1 && !($3=="Sistemas") {print $2, $3}'
```

#### 11. Regex
`awk` puede usar regex usando como operador `~` y para el contenido dentro de `//`

##### Filtrar
```bash
awk '/Sistemas/ {print}' empleados.txt
```
```bash
awk '/^1004/' empleados.txt
```

##### Usando `~`
Forma general:
```bash
expresión ~ /regex/
```
Ejemplo:
```bash
awk -F: '$2 ~ /Ana/' empleados.txt
# NEgación
awk -F: '$2 !~ /Ana/' empleados.txt
```
#### 12. Bucles
##### IF
```bash
awk -F: '{ if ($3 == 0) print $1, "= ROOT PRIVILEGE"; else print $1, "= normal" }' /etc/passwd
```

##### FOR
```bash
for (inicio; condición; incremento) {
    instrucciones
}
```
Con `awk`
```bash
awk 'BEGIN {
    for (i=1; i<=5; i++) 
        print i
}' 
```
Salida:
```ouput
10
9
8
...
1
```

##### WHILE
Se ejecuta mientras la condición sea verdadera
```bash
awk 'BEGIN {
    i=1
    while(i<=5){
        print i
        i++
    }
}'
```

##### DO WHILE
```bash
awk 'BEGIN {
    i=1
    do{
        print i
        i++
    }while(i<=5)
}'
```

##### Anidados
```bash
awk 'BEGIN{
    for(i=1;i<=3;i++){
        for(j=1;j<=3;j++){
            print i,j
        }
    }
}'
```
Salida:
```ouput
1 1
1 2
1 3
2 1
2 2
2 3
3 1
3 2
3 3
```

#### 13. Arrays Asociativo
En `awk` puedes hacer:
```bash
departamento["Sistemas"] = 4
departamento["Ventas"] = 3
departamento["Marketing"] = 2
```

##### Ejemplo 1
Contar empleados por departamento usando ``for``
```bash
awk -F: '
    NR>1 {
        dep[$3]++
    }
    END {
        for (i in dep)
            print i, dep[i]
    }' empleados.txt 

```
Aquí:
```
for (i in dep)
```
Significa:
> "Recorre todas las claves del array dep"

Si el array contiene:
```
dep["Ventas"]=3
dep["Sistemas"]=4
dep["Marketing"]=3
```
El `for` imprimirá cada clave con su valor.
