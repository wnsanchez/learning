###### SET
"""
Se usa {}
- Mutable
- No ordenado
- No permite duplicados
"""
my_set = set()
my_otro_set = {}

print(type(my_set))
print(type(my_otro_set)) # Incialmente un diccionario

my_otro_set = {34, "Willian", 1.56}
print(type(my_otro_set))

my_otro_set.add("Perú") 
print(my_otro_set)

my_otro_set.remove(34)

## EJEMPLOS DE SETS
set_a = {"Python", "Java"}
set_b = {"Javascript"}
set_c = {"Kotlin"}
set_d = {"C#", "Java", "Swift"}

# UNIR | A | B
set_union = set_a.union(set_b)
print(set_union)
set_union_a = set_a.union(set_b).union(set_c).union(set_d)
print(set_union_a)

# Intersección | A & B
set_interceptado = set_a.intersection(set_d)
print(set_interceptado)

# Diferencia | A - B
set_diferencia = set_a.difference(set_d)
print(set_diferencia)



####### EJERCICIOS
# 1. Crea un set con los nÃºmeros del 1 al 5 e imprÃ­melo.
setipta = {1, 2, 3, 4, 5}
print(setipta)


# 2. AÃ±ade el nÃºmero 6 al set {1, 2, 3, 4, 5} e imprÃ­melo.
setipta.add(6)
print(setipta)

# 3. Intenta aÃ±adir el nÃºmero 5 al set {1, 2, 3, 4, 5} nuevamente. Â¿QuÃ© sucede?
setipta.add(5) # No cambia ya que no admite duplicados
print(setipta)

# 4. Verifica si el nÃºmero 3 estÃ¡ en el set {1, 2, 3, 4, 5} e imprime el resultado.
print(3 in setipta)


# 5. Elimina el nÃºmero 4 del set {1, 2, 3, 4, 5} e imprime el set resultante.
setipta.remove(4)
print(setipta)

# 6. Usa el mÃ©todo clear() para vaciar un set y luego imprime su longitud.
setipta.clear()
print(setipta)



# 7. Convierte el set {"manzana", "naranja", "plÃ¡tano"} en una lista e imprime el primer elemento de la lista.
frutas = {"manzana", "naranja", "plátano"}
lista_fruta = list(frutas)
print(lista_fruta)
print(lista_fruta[0])


# 8. Realiza la uniÃ³n de dos sets: {1, 2, 3} y {4, 5, 6}, e imprime el set resultante.
set_uno = {1, 2, 3}
set_dos = {4, 5, 6}
set_unido = set_uno.union(set_dos)
print(set_unido)


# 9. Calcula la diferencia entre los sets {1, 2, 3, 4} y {3, 4, 5, 6} e imprime el resultado.
dif_a = {1, 2, 3, 4}
dif_b = {3, 4, 5, 6}
diferencia = dif_a.difference(dif_b)
print(diferencia)

# 10. Elimina un set llamado my_set usando del y luego intenta imprimirlo para ver el resultado.
del diferencia
print(diferencia) # Genera NameError




