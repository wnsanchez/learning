##### FUNCIONES
# Permiten organizar nuestro código de manera eficiente, reducir la repetición y hacerlo más legible y fácil de mantener.

"""
Sintaxis:
def nombre_de_funcion(parametros):
    Código

# Llamada a la función
nombre_de_funcion(argumentos)

"""

### Función simple
def hello():
    print("Hello World")
hello()


### Función con parámetros
def saludar(nombre):
    print(f"Hola {nombre}")
saludar("Willian") # ingresar con argumentos

def sumar(num1, num2):
    print(num1 + num2)
sumar(4, 5)
sumar(10, - 5)


### F. Devuelven valores | return
def retorno(num_a, num_b):
    return num_a * num_b
retorno(4, 5) # Devuelve pero no imprime, agregar a una variable
resultado = retorno(4, 5)
print(resultado)


### Modificar la posición los argumentos
def nombres(name, surname):
    print(f"{name} {surname}")

nombres("Sánchez", "Willian") # Defecto
nombres(surname = "Sánchez", name = "Willian")


### Parámetros por defecto
def intro(nombre = "invitado"):
    print(f"{nombre}")
intro() # invitado
intro("Willian")

### Varios parámetros
def usuarios(*nombres):
    print(nombres)
usuarios("Willian", "Luis", "Juan") # Ingresar varios argumentos de los que se desea


## Ejemplos
def print_text(*texts):
    for text in texts:
        print(text)

print_text("Hola", "Python", "Dev")



###### EJERCICIOS
# 1. Crea una funciÃ³n llamada "personalized_greeting" que reciba un nombre como argumento e imprima "Hola, <nombre>". Si no se proporciona ningÃºn nombre, debe saludar diciendo "Hola, desconocido".
def personalized_greeting(nombre = "Desconocido"):
    print(f"Hola {nombre}")
personalized_greeting("Willian")


# 2. Escribe una funciÃ³n llamada "multiply" que reciba dos nÃºmeros como argumentos y retorne el resultado de multiplicarlos.
def multiply(num1, num2):
    return num1 * num2
resultado = multiply(4, 2)
print(resultado)

# 3. Crea una funciÃ³n llamada "is_even" que reciba un nÃºmero entero como argumento y retorne True si es par y False si es impar.
def is_even(numero):
    return numero % 2 == 0
respuesta = is_even(6)
print(respuesta)


# 4. Escribe una funciÃ³n llamada "convert_to_uppercase" que reciba una cadena de texto y la retorne en mayÃºsculas.
def convert_to_uppercase(string):
    return string.upper() 
nombre = convert_to_uppercase("Willian")
print_text(nombre)

# 5. Crea una funciÃ³n llamada "arbitrary_sum" que reciba un nÃºmero arbitrario de nÃºmeros como argumentos y retorne la suma de todos ellos.
def arbitrary_sum(*numeros):
    return sum(numeros)
suma = arbitrary_sum(4, 4, 2)
print(suma)


# 6. Escribe una funciÃ³n llamada "generate_full_greeting" que reciba dos argumentos: nombre y apellido, y retorne el saludo completo "Hola, <nombre> <apellido>". Los argumentos deben ser pasados por clave.
def generate_full_greeting(nombre, apellido):
    return f"Hola {nombre} {apellido}"
saludo = generate_full_greeting("Willian", "Sánchez")
print(saludo)


# 7. Crea una funciÃ³n llamada "power" que reciba dos nÃºmeros: base y exponente, y retorne el resultado de elevar la base al exponente.
def power(base, exponente):
    return base ** exponente
resultado = power(4, 2)
print(resultado)

# 8. Escribe una funciÃ³n llamada "calculate_average" que reciba tres nÃºmeros y retorne su promedio.
def calculate_average(num1, num2, num3):
    return (num1 + num2 + num3) / 3
promedio = calculate_average(4, 4, 1)
print(promedio)


# 9. Crea una funciÃ³n llamada "count_characters" que reciba una cadena de texto y retorne el nÃºmero de caracteres que contiene.
def count_characters(texto):
    return len(texto)
longitud = count_characters("Hola")
print(longitud)



# 10. Escribe una funciÃ³n llamada "display_messages" que reciba un nÃºmero indefinido de cadenas y las imprima en mayÃºsculas, una por una, tal como se hizo en el archivo proporcionado.
def display_messages(*cadena):
    for palabra in cadena:
        print(palabra.upper())

display_messages("Will", "Luis")

