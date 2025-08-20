####### CICLOS

#### WHILE

"""
while condicion:
    #Código Ejecuta mientras cumpla la condición

Nota: Asignar de manera manual una forma de que la condición sea falsa por así decirlo si no ejecuta indefinidamente
"""

my_condition = True

while my_condition:
    print("XD")
    my_condition = False

condition_2 = 0
while condition_2 < 6:
    print(condition_2)
    condition_2 += 1

## Usando else
# Contar hasta 5
contador = 1
while contador <= 5:
    print(contador)
    contador += 1
else:
    print("El bucle término correctamente") # Se ejecuta si el bucle terminó sin interrupciones



# Buscar con un número mayor a 10
numeros = [3, 5, 7, 9] # Agregar un 11 o más
i = 0 # Contador

while i < len(numeros):
    if numeros[i] > 10:
        print(f"Número mayor a 10 encontrado: {numeros[i]}")
        break
    i += 1
else:
    print("No se encontró un número mayor a 10")
"""
i es el contador, usamos len para encontra su longitud y así poder usarlo como un máximo para el contador que se usará como índice para ingresar a los elementos de la lista números.
El Break cortará el ciclo al encontrar el primer elemento que cumpla con la condición 
"""

### EJEMPLO
## Usuario intenta conectar a un servidor pero solo tiene tres intentos
intentos = 0
max_intentos = 3

while intentos < max_intentos:
    password = input("Ingresar tu contraseña:")
    if password == "secreto":
        print("Bienvenido")
        break # Corta al ingresar de manera correcta
    intentos += 1
else:
    print("Demasiados intentos. Acceso denegado")


#### FOR
"""
Sirve para iterar o recorrer un secuencia de elementos (lista, set, strings, dict)

Recorre de manera automática sin requerir algún contador
"""


# String
saludo = "Hello" # Elementos H, e, l, l, o
for elemento in saludo: 
    print(elemento)

"""
Palabra elemento solo ser referencia puede ser cualquier palabra
"""

# Listas
enteros = [1, 2, 3, 4]
for elemento in enteros:
    print(elemento)


lenguajes = ["Java", "Python"]
for x in lenguajes:
    print(x)
else:
    print("Terminó correctamente")

# Usando función range
"""
range(inicio, fin, salto)
fin y salto son opcionales
Empieza desde de 0
El salto es de 1
"""
for x in range(3):
    print(x)

for x in range(1, 6, 2):
    print(x)


# Usando enumerate

lista = ["uno", "dos", "tres"]
for índice, elemento in enumerate(lista):
    print(f"Soy el índice {índice}: {elemento}")

# Buscar un número
numeros = [2, 4, 6, 8, 10]

for numero in numeros:
    if numero == 5:
        print("¡Número 5 encontrado!")
        break
else:
    print("El número 5 no está en la lista.")


##### EJERCICIOS
# 1. Usa un bucle while para imprimir los nÃºmeros del 1 al 10.
i = 1
while i <= 10:
    print(i)
    i += 1


# 2. Usa un bucle for para recorrer la lista[10, 20, 30, 40, 50] e imprime cada nÃºmero.
lista_numeros = [10, 20, 30, 40, 50]
for x in lista_numeros:
    print(x)


# 3. Escribe un programa que use un bucle while para sumar los nÃºmeros del 1 al 100 e imprime el resultado.
inicio = 1
suma = 0

while inicio <= 100:
    suma = suma + inicio
    inicio += 1
print(suma)


# 4. Escribe un bucle for que imprima cada carÃ¡cter de la cadena "Python".
palabra = "Python"
for x in palabra:
    print(x)


# 5. Usa un bucle while para encontrar el primer nÃºmero divisible por 7 entre 1 y 50.
i = 1
while i <= 50:
    if i % 7 == 0:
        print(f"Es divisible por 7 el número {i}")
        break
    i += 1
else:
    print("Ningún número es divisible por 7")


# 6. Usa un bucle for para recorrer el diccionario {"name": "Brais", "age": 37, "country": "Galicia"} e imprime las claves.
datos = {"name": "Brais", "age": 37, "country": "Galicia"} 
for x in datos:
    print(x)


# 7. Escribe un programa que use un bucle while para imprimir los nÃºmeros pares entre 1 y 20.
x = 1
while x <= 20:
    if x % 2:
        print(f"Este número {x} es par")
    x += 1



# 8. Usa un bucle for con la funciÃ³n range() para imprimir los nÃºmeros del 1 al 10 en orden inverso.
for x in range(10, 0, -1):
    print(x)



# 9. Escribe un programa que use un bucle for para contar cuÃ¡ntas veces aparece el nÃºmero 30 en la lista[30, 10, 30, 20, 30, 40].
contador = 0

listita = [30, 10, 30, 20, 30, 40]
for x in listita:
    if x == 30:
        contador = contador + 1
    
print(f"Contador {contador}")
        


# 10. Usa un bucle for para recorrer una lista de nombres y detener el bucle cuando se encuentre el nombre "Willian".
nombres = ["Luis", "Emma", "Willian"]
for x in nombres:
    if x == "Willian":
        print("Nombre \"Willian\" encontrado")
        break
    print(x)
    





