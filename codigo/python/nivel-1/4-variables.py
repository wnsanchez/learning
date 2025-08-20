###### VARIABLES
# Python es tipado dinámico

### Nombrar correctamente
formato_correcto = "dato" # minúcula separadas con guiones bajos

### Almacenar dato
nombre = "Willian"
pais = "Perú"


## Concatenación de variables
print("Mi nombre es:", nombre, "y soy de Perú", pais)

## Variables en una sola línea (Evitar abusar)
name, surname, alias, age = "Willian", "Sánchez", "wnsanchez", 25 

# Forzar el tipo (Sirve de referencia no es tipado fuerte)
address: str = "Mi dirección"
address = 32
print(type(address)) # Cambia el tipo aún así


###### EJERCICIOS
# 1. Declara y asigna valores a las siguientes variables:
# â€¢	name: una cadena que contenga tu nombre.
# â€¢	age: un nÃºmero entero que represente tu edad.
# â€¢	height: un nÃºmero flotante que represente tu altura.
# â€¢	Imprime cada variable en una lÃ­nea separada.
nombre = "Willian"
age = 27
height = 1.69
print("Nombre:", nombre)
print("Edad:", age)
print("Altura:", height)

# 2. Convierte la variable edad de entero a cadena y concatenala con un texto que diga cuÃ¡ntos aÃ±os tienes.
print("Tengo " + str(age) + " años")

# 3. Declara una variable booleana is_student que indique si eres estudiante o no. Usa True o False segÃºn corresponda e imprÃ­mela.
is_student = True
print(is_student)


# 4. Usa la funciÃ³n len() para calcular cuÃ¡ntos caracteres tiene tu nombre completo, almacenado en una variable.
cantidad_caracteres = len(nombre)
print(cantidad_caracteres)


# 5. Declara tres variables en una sola lÃ­nea que representen tu nombre, apellido y ciudad de origen. Luego, imprime estos valores.
nombre, apellido, ciudad = "Willian", "Sanchez", "Lambayeque"

# 6. Usa la funciÃ³n input() para solicitar al usuario su color favorito y almacÃ©nalo en una variable color. Luego, imprime el valor ingresado.
color = input("Ingresa tu color favorito:")
print(color)

# 7. Declara una variable fruit e inicialÃ­zala con un valor. Luego, cambia el valor de la fruta a otro diferente y vuelve a imprimirla.
fruit = "Manzana" 
print(fruit)
fruit = "Naranja"
print(fruit)


# 8. Convierte un nÃºmero decimal, almacenado en la variable price, a un nÃºmero entero y luego imprÃ­melo.
price = 9.90
print((int(price)))
print(type(price))

# 9. Declara una variable llamada address_len y almacena en ella la cantidad de caracteres de una direcciÃ³n usando la funciÃ³n len(). Imprime el resultado.
address = "Calle 123, Ciudad"
address_len = len(address)
print(address_len)

# 10. Usa un tipo de dato forzado para declarar una variable phone, asegurÃ¡ndote de que siempre serÃ¡ un nÃºmero. Luego, cambia su valor a un nÃºmero diferente y verifica el tipo de la variable con type().
telefono: int = 1234567
print(type(telefono))
phone = 828288282
print(type(phone))
