###### DICCIONARIO
# Conforma con clave:valor

diccionario = dict()
my_dict = {}

print(type(diccionario))
print(type(my_dict))

datos = { 
    "Nombre":"Willian",
    "Edad":39,
    "País":"Perú",
    "Lenguaje":{"Python", "Java"},
    "Ciudad": "Trujillo"
}
print(datos)

### Ver longitud
print(len(datos)) # Muestra los elementos clave:valor

### Ver si esta la clave
print("Nombre" in datos)

### Cambiar valor
datos["Ciudad"] = "Chiclayo"
print(datos)

### Ingresar a sus valores 
print(datos) # Muestra los elementos junto con su clave valor
print(datos["Nombre"]) # Muestra su valor
print(datos.items()) # Muestra los elementos clave valor en un lista
print(datos.keys()) # Muestra sus claves
print(datos.values()) # Muestra sus valores


### Convertir lista a diccionario
lista_datos = ["name", "age"]

nuevo_dict = dict.fromkeys((lista_datos)) # {'name': None, 'age': None}
print(nuevo_dict) # Añade a los valore None

dict_a = dict.fromkeys(("Nombre", "Piso"))
print(dict_a)

dict_b = dict.fromkeys(nuevo_dict, "Dato")
print(dict_b) # {'name': 'Dato', 'age': 'Dato'}


### DICCIONARIo
# 1. Crea un diccionario con las claves name, age, y country, asignando valores a cada una. Imprime el diccionario.
datos_usuario = {
    "Name":"Willian",
    "Age":24,
    "Country":"Perú"
}
print(datos_usuario)


# 2. Accede al valor de la clave name en el diccionario.
print(datos_usuario["Nombre"])


# 3. AÃ±ade una nueva clave job con el valor "Programador" al diccionario del punto anterior. Imprime el diccionario actualizado.
datos_usuario["Job"] = "Programador" # Agrega si no encunetra la clave
print(datos_usuario)

# 4. Modifica el valor de la clave age en el diccionario para que sea 38. Imprime el diccionario actualizado.
datos_usuario["Age"] = "38"
print(datos_usuario)

# 5. Elimina la clave country del diccionario e imprime el diccionario resultante.
del datos_usuario["Country"]
print(datos_usuario)


# 6. Crea un diccionario donde las claves sean nÃºmeros del 1 al 5 y los valores sean sus cuadrados (ejemplo: 1: 1, 2: 4, ...).
dic_nuevo = {
    1:1,
    2:2,
    3:3,
    4:4,
    5:5
}
print(dic_nuevo)


# 7. Verifica si la clave age estÃ¡ presente en el diccionario {"name": "Brais", "age": 37, "country": "Galicia"}.
print("Age" in datos_usuario)


# 8. Imprime solo las claves del diccionario.
print(datos_usuario.keys())

# 9. Convierte las claves del diccionario en una lista e imprime la lista resultante.
print(list(datos_usuario.keys()))


# 10. Crea un nuevo diccionario a partir de una lista de claves ["name", "age", "job"] usando fromkeys(), asignando a todas las claves el valor "Desconocido".
lista_claves = ["name", "age", "job"] 
dic_claves = dict.fromkeys(lista_claves, "Desconocido")
print(dic_claves)


