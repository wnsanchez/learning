"""
Aprendizaje python
"""

# Práctica básica

while True:
    print("\n--- Gestor de notas ---")
    print("1. Crear nota")
    print("2. Agregar nota")
    print("3 Ver notas")
    print("4. Salir")

    opcion = input("Elige una opción (1-4):")

    if opcion == "1":
        nota = input("Escribe tu nota:")
        nombre_archivo = input("¿Cómo se va llamar tu archivo?:")
        with open(nombre_archivo, "w", encoding="utf-8") as archivo:
            archivo.write(nota + "\n")
        print("✅ Nota guardada.")
    elif opcion == "2":
        nota = input("Escribe tu nota:")
        nombre_archivo = input("¿Cómo se llama tu archivo?")
        with open(nombre_archivo, "a", encoding="utf-8") as archivo:
            archivo.write(nota + "\n")
        print("Agregando nota ....")
        print(nota)
        print("Guardado")
    elif opcion == "3":
        nombre_archivo = input("¿Cómo se llama tu archivo?")
        try:
            with open(nombre_archivo, "r") as archivo:
              print("\nTus notas:")
              print("-------------")
              contenido = archivo.read()
              print(contenido)
        except FileNotFoundError:
            print("❌ Archivo no encontrado")
    elif opcion == "4":
        print("Saliendo ......")
        break
    else:
        print("Ingrese una opción válida.")

