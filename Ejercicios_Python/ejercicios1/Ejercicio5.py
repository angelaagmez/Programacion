"""
 Realiza un programa que solicite al usuario 5 números enteros e imprima por pantalla el máximo de dichos números.
"""

num1 = int(input("Introduce el primer numero: "))
num2 = int(input("Introduce el segundo numero: "))
num3 = int(input("Introduce el tercer numero: "))
num4 = int(input("Introduce el cuarto numero: "))
num5 = int(input("Introduce el quinto numero: "))

numeros = [num1, num2, num3, num4, num5]

max = numeros[0]
min = numeros[0]

for i in range(1, 5):
    if max <= numeros[i]:
        max = numeros[i]
    elif min >= numeros[i]:
        min = numeros[i]

print(numeros)
print("El mayor es: ", max)
print("El minimo es: ", min)
