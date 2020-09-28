Proceso sin_titulo
	// Desarrolla un programa que simule el comportamiento de una moneda que tiras al aire. 
	// Debe mostrar aleatoriamente "cara" o "cruz". (random)
	
	Definir tirada Como Entero
	Definir usuario Como Caracter
	
	Escribir "Introduce cara o cruz"
	Leer usuario
	
	tirada=azar(2)
	
	Si tirada=1 y usuario="cara" o tirada=0 y usuario="cruz" Entonces
		Escribir "Has acertado"
	SiNo
		Escribir "Has fallado"
	FinSi
FinProceso
