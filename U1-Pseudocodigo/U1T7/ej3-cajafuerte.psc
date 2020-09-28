Proceso sin_titulo
	Definir cod,intentos Como Entero
	
	intentos<-0
	
	Repetir
		Escribir "Introduce un codigo para la caja fuerte"
		Leer cod
		Si cod=1234 Entonces
			Escribir "La caja fuerte se ha abierto satisfactoriamente"
		SiNo
			Escribir "Lo siento esa no es la combinacion"
			intentos=intentos+1
		FinSi
	Hasta Que intentos>3 o cod=1234
	
FinProceso