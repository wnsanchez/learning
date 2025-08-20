###### MÓDULOS
# Un módulo es simplemente un archivo .py que contiene definiciones y código de Python (funciones, clases, variables, etc.) que puedes importar en otro archivo Python.

"""
import nombre_modulo # Para exportar completo

from [MÓDULO o PAQUETE] import [FUNCIÓN / CLASE / VARIABLE / SUBMÓDULO]

import nombre_modulo as alias_modulo # Agregar alias 
"""


#### Ejmeplo de uso de módulo de math
"""
import math
resultado = math.sqrt(25)
print(resultado)

"""
### Importar propio módulo
"""
import module
print(module.hola("Willian"))
print(module.adios("Willian"))
"""



### 
# 1. Crea un mÃ³dulo llamado "calculator" que contenga funciones para sumar, restar, multiplicar y dividir dos nÃºmeros. Importa este mÃ³dulo en otro archivo y usa sus funciones.
import module
print(module.sumar(4, 3))
print(module.restar(4, 2))
print(module.multiplicacion(4, 2))
print(module.divi(4, 2))

# 2. Crea un mÃ³dulo llamado "converter" que tenga funciones para convertir temperaturas entre Celsius y Fahrenheit. Escribe un programa que importe este mÃ³dulo y realice conversiones.
# converter.py

def celsius_to_fahrenheit(celsius):
    return (celsius * 9/5) + 32


def fahrenheit_to_celsius(fahrenheit):
    return (fahrenheit - 32) * 5/9

# ImportaciÃ³n desde otro fichero

# from converter import celsius_to_fahrenheit, fahrenheit_to_celsius
# print(celsius_to_fahrenheit(25))
# print(fahrenheit_to_celsius(77))


# 3. Crea un mÃ³dulo que contenga una lista de nombres de estudiantes y una funciÃ³n que imprima todos los nombres. Importa este mÃ³dulo en otro archivo y usa la funciÃ³n para mostrar la lista.
# students.py
students_list = ["Alice", "Bob", "Charlie", "Diana"]


def print_students():
    for student in students_list:
        print(student)

# ImportaciÃ³n desde otro fichero

# from students import print_students
# print_students()



# 4. Crea un mÃ³dulo llamado "geometry" que tenga una funciÃ³n para calcular el Ã¡rea de un cÃ­rculo y un cuadrado. Usa este mÃ³dulo en otro archivo para calcular Ã¡reas.
# geometry.py

def area_circle(radius):
    return 3.14159 * radius ** 2


def area_square(side):
    return side * side

# ImportaciÃ³n desde otro fichero

# from geometry import area_circle, area_square
# print(area_circle(5))
# print(area_square(4))



# 5. Escribe un mÃ³dulo que contenga una funciÃ³n que acepte cualquier nÃºmero de argumentos y devuelva su suma. Importa y usa la funciÃ³n en otro archivo.
# sum_module.py

def sum_all(*args):
    return sum(args)

# ImportaciÃ³n desde otro fichero

# from sum_module import sum_all
# print(sum_all(1, 2, 3, 4))



# 6. Crea un mÃ³dulo que defina una clase llamada "Car" con propiedades como marca, modelo y aÃ±o. Importa este mÃ³dulo en otro archivo y crea una instancia de la clase "Car".
# car_module.py

class Car:
    def __init__(self, brand, model, year):
        self.brand = brand
        self.model = model
        self.year = year

    def display_info(self):
        return f"{self.brand} {self.model}, {self.year}"

# ImportaciÃ³n desde otro fichero

# from car_module import Car
# my_car = Car("Toyota", "Corolla", 2020)
# print(my_car.display_info())




# 7. Escribe un mÃ³dulo que contenga funciones para leer y escribir en archivos de texto. Crea un programa que use estas funciones para escribir y leer datos.
# file_module.py

def write_to_file(filename, content):
    with open(filename, 'w') as file:
        file.write(content)


def read_from_file(filename):
    with open(filename, 'r') as file:
        return file.read()

# ImportaciÃ³n desde otro fichero

# from file_module import write_to_file, read_from_file
# write_to_file("example.txt", "Hola, Python")
# print(read_from_file("example.txt"))



# 8. Crea un mÃ³dulo llamado "statistics" que tenga funciones para calcular la media y la mediana de una lista de nÃºmeros. Usa este mÃ³dulo para calcular estos valores en una lista dada.
# file_module.py

def write_to_file(filename, content):
    with open(filename, 'w') as file:
        file.write(content)


def read_from_file(filename):
    with open(filename, 'r') as file:
        return file.read()

# ImportaciÃ³n desde otro fichero

# from file_module import write_to_file, read_from_file
# write_to_file("example.txt", "Hola, Python")
# print(read_from_file("example.txt"))



# 9. Crea un mÃ³dulo que contenga una funciÃ³n para contar cuÃ¡ntas veces aparece una palabra en un texto. Escribe un programa que importe el mÃ³dulo y lo use para contar palabras en una cadena.
# word_count.py

def count_word(text, word):
    return text.lower().split().count(word.lower())

# ImportaciÃ³n desde otro fichero

# from word_count import count_word
# text = "Python is great and Python is fun"
# print(count_word(text, "python"))



# 10 Crea un mÃ³dulo llamado "dates" que contenga funciones para obtener la fecha actual y calcular la diferencia entre dos fechas. Usa este mÃ³dulo en un programa para mostrar la fecha actual y la diferencia entre dos fechas especÃ­ficas.

# dates.py

from datetime import datetime  # MÃ³dulo nativo de Python

def get_current_date():
    return datetime.now().strftime("%d-%m-%Y")


def date_difference(date1, date2):
    d1 = datetime.strptime(date1, "%d-%m-%Y")
    d2 = datetime.strptime(date2, "%d-%m-%Y")
    return abs((d2 - d1).days)

# ImportaciÃ³n desde otro fichero

# from dates import get_current_date, date_difference
# print(get_current_date())
# print(date_difference("2024-01-01", "2024-10-01"))



