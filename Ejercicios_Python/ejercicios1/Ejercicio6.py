"""
Supongamos que el precio de un libro es de 24,95€, pero la librería ofrece un 40% de descuento.
El coste del envío es de 3€ para el primer libro y 0,75€ para el resto.
¿Cual sería el precio para una compra de 60 ejemplares?
"""

descuento = 24.95 * 0.4

precioLibro = 24.95 - descuento

ejemplar1 = precioLibro + 3

restoEjemplares = precioLibro * 59

restoEnvios = 0.75 * 59

totalRestoEjemplares = restoEjemplares + restoEnvios

precioTotal = ejemplar1 + totalRestoEjemplares

print("El precio de los 60 ejemplares es: ", precioTotal)
