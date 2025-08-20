####### CLASES

"""
class NombreClase:
    def __init__(self):
        # atributos del objeto
        pass

    def metodo(self):
        # acciones del objeto
        pass
"""

#### Ejemplo básico
class ClasePrueba:
    pass

print(ClasePrueba)
print(ClasePrueba())

# -----------------

class Persona:
    def __init__(self, name, surname, alias="Sin alias"):
        self.full_name = f"{name} {surname} ({alias})" #  Propiedad Pública
        self.__name = name # Propiedad Privada
        self.__surname = surname
# Creando un getter
    def get_name(self):
        return self.__name # Nos permite ver la propiedad privadas

# Creando objeto
my_person = Persona("Willian", "Sánchez")
print(my_person)
print(my_person.get_name()) # Ingresar a una privada
print(my_person.full_name)



#### EJEMPLO  
class Perro:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad
        
    def ladrar(self):
        print(f"{self.nombre} dice guau!")

## Crear un objeto
mi_perro = Perro("Fido", 3)
perro1 = Perro("Max", 4)

## Llamar objeto
mi_perro.ladrar()
perro1.ladrar()


##### EJERCICIOS

# 1. Crea una clase llamada "Animal" que tenga una propiedad "species" y un mÃ©todo "make_sound" que imprima un sonido genÃ©rico.
class Animal:
    def __init__(self, species):
        self.species = species
    
    def make_sound(self):
        print("Sonido animal genérico")


# 2. Modifica la clase "Animal" para que reciba la especie al crear un objeto y almacÃ©nala en una propiedad pÃºblica. AÃ±ade el mÃ©todo "make_sound" que imprima un sonido dependiendo de la especie.
class Animal:
    def __init__(self, species):
        self.species = species

    def make_sound(self):
        if self.species == "dog":
            print("Guau")
        elif self.species == "cat":
            print("Miau")
        else:
            print("Sonido genérico")


# 3. Crea una clase llamada "Car" con las propiedades pÃºblicas "brand" y "model". AdemÃ¡s, debe tener una propiedad privada "_speed" que inicialmente serÃ¡ 0.
class Car:
    def __init__(self, brand, model):
        self.brand = brand
        self.model = model
        self._speed = 0
    

# 4. AÃ±ade a la clase "Car" un mÃ©todo llamado "accelerate" que aumente la velocidad en 10 unidades. AÃ±ade tambiÃ©n un mÃ©todo "brake" que reduzca la velocidad en 10 unidades. AsegÃºrate de que la velocidad no sea negativa.
class Car:
    def __init__(self, brand, model):
        self.brand = brand
        self.model = model
        self._speed = 0

    def accelerate(self):
        self._speed += 10
    
    def brake(self):
        self._speed = max(0, self._speed - 10)

# 5. Crea una clase "Book" que tenga propiedades como "title" (pÃºblico) y "author" (privado). AÃ±ade un mÃ©todo para obtener el autor y otro para cambiar el tÃ­tulo del libro.
class Book:
    def __init__(self, title, author):
        self.title = title
        self.__authorauthor = author

    def get_author(self): # Getter
        return self.author
    
    def change_titulo(self, new_title):
        self.title = new_title



# 6. Crea una clase "Estudiante" que tenga como propiedades su nombre, apellido y una lista de notas. AÃ±ade un mÃ©todo para calcular y devolver la nota media del estudiante.
class Estudiante:
    def __init__(self, nombre, apellido, calificaciones):
        self.name = nombre
        self.apellido = apellido
        self.calificaciones = calificaciones

    def calcular_promedio(self):
        return sum(self.calificaciones) / len(self.calificaciones)


# 7. Crea una clase "BankAccount" con propiedades como "owner" y "balance". AÃ±ade mÃ©todos para depositar y retirar dinero, asegurÃ¡ndote de que no se pueda retirar mÃ¡s de lo que hay en la cuenta.
class BankAccount:
    def __init__(self, owner, balance=0):
        self.owner = owner
        self.balance = balance

    def deposit(self, amount):
        self.balance += amount

    def withdraw(self, amount):
        if self.balance <= amount:
            self.balance = self.balance - amount
        else:
            print("Saldo insuficiente")


# 8. Crea una clase "Point" que represente un punto en el espacio 2D con coordenadas "x" e "y". AÃ±ade un mÃ©todo que calcule la distancia entre dos puntos.
class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def calculate_distance(self, other_point):
        distance_x = abs(self.x - other_point.x)
        distance_y = abs(self.y - other_point.y)
        return (distance_x ** 2 + distance_y ** 2) ** 0.5



# 9. Crea una clase "Employee" que tenga propiedades como "name", "hourly_wage" (pago por hora) y "hours_worked". AÃ±ade un mÃ©todo que calcule el pago total basado en las horas trabajadas y el salario por hora.
class Employee:
    def __init__(self, name, hourly_wage, hours_worked):
        self.name = name
        self.hourly_wage = hourly_wage
        self.hours_worked = hours_worked

    def calculate_total_pay(self):
        return self.hourly_wage * self.hours_worked



# 10. Crea una clase "Store" que tenga una propiedad "inventory" (una lista de productos). AÃ±ade un mÃ©todo para agregar un producto al inventario y otro para mostrar todos los productos disponibles.
class Store:
    def __init__(self):
        self.inventory = []

    def add_inventory(self, producto):
        self.inventory.append(producto)

    def show_inventory(self):
        for product in self.inventory:
            print(product)


