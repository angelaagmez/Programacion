Proceso sin_titulo
	// Solicita al usuario un numero y encontrar los multiplos de 8
	
	Definir num,mult Como Entero
	
	Escribir "Introduce un numero"
	Leer num
	
	mult=0
	
	Mientras mult<=10 Hacer
		
		Si num%8=0 Entonces
			mult=mult+1
			Escribir num," es multiplo de 8"
		FinSi
		
		num=num+1
		
	FinMientras
	
FinProceso
