###### CONDICIONALES

"""
if condicion:
    # Codigo ejecuta si cumple la condición
elif condición:
    # Código no cumple | Pueden haber varios elif
else:
    # Código que ejecuta si no cumpla con las demás

Tener en cuenta la tabulación al declarar condiciones
"""

my_condition = True # Cambiar a False
if my_condition:
    print("Se ejecuta si es True")  # Con False no se ejecuta y pasa de largo
print("Pasando de largo") # Esta línea se ejecuta


condition_2 = 5 * 2
if condition_2 == 11: # Es False
    print("No se ejecuta")


if condition_2 > 11:
    print("Imprime si es mayor")
else:
    print("Imprime si es menor")



###### EJERCICIOS

# 1. Escribe un programa que verifique si un nÃºmero es positivo, negativo o cero.
numero = -5
if numero > 0:
    print(f"El numero {numero} es positivo")
elif numero < 0:
    print(f"El numero {numero} es negativo")
else:
    print("El numero es cero")


# 2. Solicita al usuario que ingrese su edad y muestra un mensaje indicando si es mayor de edad(18 aÃ±os o mÃ¡s) o menor de edad.
edad = int(input("Ingrese su edad:"))
if edad >= 18:
    print("Eres mayor de edad")
else:
    print("Eres menor de edad")


# 3. Escribe un programa que verifique si una cadena de texto estÃ¡ vacÃ­a y muestre un mensaje en consecuencia.
cadena = "" # Agregar contenido
if cadena:
    print("Tiene contenido")
else:
    print("Esta vacía")




# 4. Crea un programa que solicite dos nÃºmeros al usuario y compare cuÃ¡l es mayor. Si son iguales, muestra un mensaje indicando la igualdad.
num_a = int(input("Ingresa el primer número:"))
num_b = int(input("Ingresa el segundo número:"))
if num_a > num_b:
    print(f"Primer número {num_a} es mayor que {num_b}")
elif num_b > num_a:
    print(f"Segundo número {num_b} es mayor que {num_a}")
else:
    print("Los números son iguales")


# 5. Escribe un programa que verifique si un nÃºmero es divisible por 3 y por 5 al mismo tiempo.
numero_divisible = 15
if numero_divisible % 3 == 0 and numero_divisible % 5 == 0:
    print("Es divisible de 3 y 5")
else:
    print("No es divisible de 3 y 5")



# 6. Solicita al usuario que ingrese un nÃºmero y verifica si es par o impar.
verificar = int(input("Ingresar número:"))
if verificar % 2 == 0:
    print("El número es par")
else:
    print("El número es impar")



# 7. Escribe un programa que determine si una persona puede votar en funciÃ³n de su edad(mayor o igual a 18). Si tiene 16 o 17 aÃ±os, indica que puede votar con permiso especial.
edad_votar = 15
if edad_votar >= 18:
    print("Tiene permiso de votar")
elif 16 <= edad_votar < 18:
    print("Puedes votar con permiso especial")
else:
    print("Eres menor de edad")


# 8. Crea un programa que solicite una contraseÃ±a al usuario y verifique si coincide con una contraseÃ±a predefinida. Si no coincide, muestra un mensaje de error.
contraseña = input("Ingrese su conraseña:")
password = "1234"
if contraseña == password:
    print("Bienvenido")
else:
    print("Error")


# 9. Escribe un programa que determine si un nÃºmero estÃ¡ entre 10 y 20 (ambos incluidos).
number = 9
if 10 <= number <= 20:
    print("Esta dentro del rango")
else:
    print("Np esta dentro deñ rango")



# 10. Escribe un programa que simule un semÃ¡foro: solicita al usuario que ingrese un color(rojo, amarillo, verde) y muestra un mensaje indicando si debe detenerse, estar alerta o avanzar.

color = input("Introduce un color (rojo, amarillo, verde): ").lower()
if color == "rojo":
    print("Detente")
elif color == "amarillo":
    print("PrecauciÃ³n")
elif color == "verde":
    print("Avanza")
else:
    print("Color no válido")


