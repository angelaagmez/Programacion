"""
Realiza un programa que calcule el desglose mínimo en billetes y monedas de una
cantidad exacta de euros, que se solicita al usuario por pantalla.
Hay billetes de 500, 200, 100, 50, 20, 10 y 5 Euros y monedas de 2 y 1 Euro.

Por ejemplo, si deseamos conocer el desglose de 434 €, el programa mostrará por pantalla
el siguiente resultado:

2 billetes de 200€
1 billete de 20€
1 billete de 10€
2 monedas de 2 €
"""

dinero = float(input("Introduce la cantidad de dinero: "))

# Variables Billetes.
billetes500 = 500
billetes200 = 200
billetes100 = 100
billetes50 = 50
billetes20 = 20
billetes10 = 10
billetes5 = 5
monedas2 = 2
monedas1 = 1

if dinero / billetes500 >= 1:
    cantidad = dinero // billetes500
    print("Billetes de 500: ", cantidad)
    dinero = dinero % billetes500

if dinero/billetes200 >= 1:
    cantidad = dinero // billetes200
    print("Billetes de 200: ", cantidad)
    dinero = dinero % billetes200

if dinero / billetes100 >= 1:
    cantidad = dinero // billetes100
    print("Billetes de 100: ", cantidad)
    dinero = dinero % billetes100

if dinero/billetes50 >= 1:
    cantidad = dinero // billetes50
    print("Billetes de 50: ", cantidad)
    dinero = dinero % billetes50

if dinero / billetes20 >= 1:
    cantidad = dinero // billetes20
    print("Billetes de 20: ", cantidad)
    dinero = dinero % billetes20

if dinero/billetes10 >= 1:
    cantidad = dinero // billetes10
    print("Billetes de 10: ", cantidad)
    dinero = dinero % billetes10

if dinero / billetes5 >= 1:
    cantidad = dinero // billetes5
    print("Billetes de 5: ", cantidad)
    dinero = dinero % billetes5

if dinero / monedas2 >= 1:
    cantidad = dinero // monedas2
    print("Monedas de 2€: ", cantidad)
    dinero = dinero % monedas2

if dinero / monedas1 >= 1:
    cantidad = dinero // monedas1
    print("Monedas de 1€: ", cantidad)
    dinero = dinero % monedas1




