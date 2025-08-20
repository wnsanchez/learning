#### STRINGS
my_string = "primer String"
otro_string = "Segundo String"
nombre = "Willian"
pais = "Perú"

## Concatenación
print(my_string + ". " + otro_string)

## Ver longitud
print(len(my_string))

## Formateo
# f-strings | Moderno
print(f"Mi nombre es {nombre} y soy de {pais} ")

## REBANADO | Slicing
print(my_string[2:]) # imer String
print(my_string[:]) 
print(my_string[:5]) # No cuenta el índice 5
print(my_string[::2]) # Realiza saltos 2
print(my_string[::-1]) # Reversa


## Funciones
print(my_string.capitalize())
print(my_string.upper())
print(my_string.lower())
print(my_string.count("r"))
print("1".isnumeric())


###### EJERCICIOS
# 1. Declara una variable text con la frase â€œAprendiendo Pythonâ€ y luego imprime la longitud de la cadena usando len().
text = "Aprendiendo Python"
print(len(text))

# 2. Concatena dos cadenas: â€œHolaâ€ y â€œPythonâ€, y muestra el resultado en una sola lÃ­nea.
print("Hola" + " " + "Mundo")


# 3. Crea una cadena que incluya un salto de lÃ­nea, y luego imprÃ­mela para ver el resultado.
print("Primera línea.\nSegunad línea.")


# 4. Usa el formateo de cadenas con f-strings para imprimir tu nombre, apellido y edad en una cadena de texto.
print(f"Mi nombre es {nombre} y soy de {pais}")


# 5. Desempaqueta los caracteres de la palabra â€œPythonâ€ en variables separadas y luego imprÃ­melos uno por uno.
palabra = "Python"
a, b, c, d, e, f = palabra
print(a)
print(b)
print(c)
print(d)
print(e)
print(f)


# 6. Extrae un â€œsliceâ€ de la palabra â€œProgramaciÃ³nâ€ para obtener los caracteres desde la posiciÃ³n 3 hasta la 7.
texto = "Programación"
print(texto[3:8])


# 7. Invierte la cadena â€œPythonâ€ usando slicing y muestra el resultado.
lenguaje = "Python"
print(lenguaje[::-1])


# 8. Convierte la cadena â€œaprendiendo pythonâ€ en mayÃºsculas usando el mÃ©todo adecuado e imprÃ­mela.
frase = "aprendiendo python"
print(frase.upper())


# 9. Cuenta cuÃ¡ntas veces aparece la letra â€œnâ€ en la cadena â€œProgramaciÃ³n en Pythonâ€.
palabra = "Programación"
print(palabra.count("a"))

# 10. Verifica si la cadena â€œ12345â€ es numÃ©rica usando el mÃ©todo adecuado e imprime el resultado.
numeros = "123456"
print(numeros.isnumeric())

