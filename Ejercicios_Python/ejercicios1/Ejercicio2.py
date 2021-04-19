"""
Diseña un programa que lea la edad de dos personas y diga quién es más joven, la
primera o la segunda. Ten en cuenta que ambas pueden tener la misma edad. En tal caso, hazlo
saber con un mensaje adecuado.
"""

edad = 29
edad2 = 23

if edad > edad2:
    print("La primera persona es mayor")
elif edad == edad2:
    print("Las dos personas tienen la misma edad")
else:
    print("La segunda persona es mayor")