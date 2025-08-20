###### TUPLAS
"""
Inmutable ❌
Ordenada ✅
Permite duplicados ✅
"""

tupla = (1, 2, 3, 4, 5) # Usa ()
my_tuple = ("Willian", "Perú", 1.70)
tupla_mixta = (1, 40 , "HOLA", "mundo", 30, 40 , 10, 3.55)


print(my_tuple)
print(type(my_tuple)) # tuple

## Extracción por índices
print(tupla[1]) # Toma el índice 
print(tupla[-1]) # Toma el último valor

## Concatenación
otra_tupla = tupla + my_tuple
print(otra_tupla)

## REBANADO
print(tupla[3:]) #(4, 5)
print(tupla[:3])

## Métodos
print(tupla_mixta.count(40)) # Recuento de apariciones
print(tupla_mixta.index("HOLA")) # Muestra su índice

## NOTA
# Al declarar solo un elemento debo hacerlo de esta forma (elemento, ), por que puede tomarse como expresión


##### EJERCICIOS ############
# 1. Crea una tupla con los valores (10, 20, 30, 40, 50) e imprÃ­mela.
tuplita =(10, 20, 30, 40, 50)


# 2. Accede al segundo elemento de la tupla (100, 200, 300, 400, 500) y muÃ©stralo.
tuplones = (100, 200, 300, 400, 500)
tuplon_segundo = tuplones[1]
print(tuplon_segundo)


# 3. Intenta modificar el primer elemento de la tupla (1, 2, 3) a 10 y observa el resultado.
tupla_mod = (1, 2, 3)  
tupla_mod[0] = 10 # TypeError

# 4. Cuenta cuÃ¡ntas veces aparece el nÃºmero 3 en la tupla (1, 2, 3, 3, 4, 5, 3).
tupla_contar = (1, 2, 3, 3, 4, 5, 3)
print(tupla_contar.count(3))


# 5. Encuentra el Ã­ndice de la primera apariciÃ³n de la cadena "Python" en la tupla ("Java", "Python", "JavaScript", "Python").
lenguajes = ("Java", "Python", "JavaScript", "Python")



# 6. Concatena dos tuplas: (1, 2, 3) y (4, 5, 6) e imprime la tupla resultante.
tupla_a = (1, 2, 3)
tupla_b = (4, 5, 6)
tupla_unida = tupla_a + tupla_b
print(tupla_unida)

# 7. Crea una subtupla con los elementos desde la posiciÃ³n 2 hasta la 4 (sin incluir la 4) de la tupla (10, 20, 30, 40, 50).
subtupla = tuplita[2:4]
print(subtupla)

# 8. Convierte la tupla ("rojo", "verde", "azul") en una lista, cambia el segundo elemento a "amarillo" y vuelve a convertirla en una tupla. Imprime la tupla resultante.
tupla_color = ("rojo", "verde", "azul")
print(type(tupla_color))
tupla_a_lista = list(tupla_color)
print(type(tupla_a_lista))
tupla_a_lista[1] = "amarillo"
print(tupla_a_lista)
lista_a_tupla = tuple(tupla_a_lista)
print(lista_a_tupla)

# 9. Elimina una tupla llamada my_tuple usando del y luego intenta imprimirla para ver el resultado.
my_tuple = ("Java", "Python")
del my_tuple

# 10. Crea una tupla con un solo elemento (el nÃºmero 100) e imprÃ­mela. AsegÃºrate de usar la sintaxis correcta para crear una tupla con un solo elemento.
tupla_uno = (100, )
print(tupla_uno)


