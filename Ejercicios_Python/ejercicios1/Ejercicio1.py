"""
Diseña un programa que lea un número en coma flotante por teclado y muestre por pantalla
"El número es negativo" solo si el número es menor que cero.
"""

number = -4.5

if number < 0:
    print("El numero es negativo")
elif number == 0:
    print("El numero es cero")
else:
    print("El numero es positivo")