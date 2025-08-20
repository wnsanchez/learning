##### LISTAS
lista = [4, 7, 8, 3]
lista_string = ["Hola", "Mundo"]
lista_mixta = ["Willian", 23, "Perú", 1.34]
lista_vacia = []

### Longitud
print(len(lista))

### Conversión 
lenguaje = "Python"
lenguaje = list(lenguaje)
print(lenguaje)

### Métodos
lista_vacia.append("Python")
lista_vacia.append("Java")
lista_vacia.append("Javascript")
print(lista_vacia)

lista_vacia.insert(1, "Azul") # Agrega en el índice el valor
lista_vacia.insert(0, "Rojo")
print(lista_vacia) 

lista_vacia.remove("Azul") # Cuando sabemos el valor si exite en la lista
# Solo elimina el primer valor encontrado
print(lista_vacia)

ultimo = lista_vacia.pop() # Elimina y guarda el último valor
print(ultimo)
print(lista_vacia)

del lista_vacia[0] # Borra por índice
print(lista_vacia)


lista_copia = lista_vacia.copy() # Copiar lista 
print(lista_copia)


lista_vacia.clear() # Limpiar lista
print(lista_vacia)

lista_copia.reverse() # Revierte la lista
print(lista_copia)

lista.sort() # Ordena lista
print(lista)

print(lista[2:3]) # Rebanado


###### EJERCICIO
# 1. Crea una lista con los nÃºmeros del 1 al 5 e imprÃ­mela
lista_numeros = [1, 2, 3, 4, 5]
print(lista_numeros)

# 2. Accede e imprime el tercer elemento de la lista [10, 20, 30, 40, 50].
lista_tercer = [10, 20, 30, 40, 50]
print(lista_tercer[2])

# 3. Agrega el nÃºmero 6 al final de la lista [1, 2, 3, 4, 5] e imprÃ­mela.
lista_numeros.append(6)
print(lista_numeros)


# 4. Inserta el nÃºmero 15 en la posiciÃ³n 2 de la lista [10, 20, 30, 40, 50].
lista_tercer.insert(2, 15)
print(lista_tercer)


# 5. Elimina el primer valor 30 de la lista [10, 20, 30, 30, 40, 50].
lista_tercer.remove(30)
print(lista_tercer)


# 6. Usa la funciÃ³n pop() para eliminar el Ãºltimo elemento de la lista [1, 2, 3, 4, 5] y almacÃ©nalo en una variable. Imprime la variable y la lista.
valor_elliminado = lista_numeros.pop()
print(valor_elliminado)


# 7. Invierte la lista [100, 200, 300, 400, 500] e imprÃ­mela.
lista_cien = [100, 200, 300, 400, 500] 
lista_cien.reverse()
print(lista_cien)

# 8. Ordena la lista [3, 1, 4, 2, 5] en orden ascendente e imprÃ­mela.
lista_desordenada = [3, 1, 4, 2, 5] 
lista_desordenada.sort()
print(lista_desordenada)

# 9. Concatena las listas [1, 2, 3] y [4, 5, 6] y almacena el resultado en una nueva lista. Imprime la lista resultante.
lista_a = [1, 2, 3]
lista_b = [4, 5, 6]
lista_unida = lista_a + lista_b
print(lista_unida)


# 10. Crea una sublista con los elementos de la lista [10, 20, 30, 40, 50] que van desde la posiciÃ³n 1 hasta la 3 (sin incluir la posiciÃ³n 3).
sublista = lista_tercer[1:3]
print(sublista)







