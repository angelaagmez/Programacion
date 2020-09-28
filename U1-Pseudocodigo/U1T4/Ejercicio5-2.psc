Proceso sin_titulo
	// Crea una variante del ejercicio 5.1, en la que emplees 
	// varios SI-ENTONCES en vez de SEGUN.
	
	Definir dia Como Entero
	
	Escribir "Introduce el numero del dia de la semana"
	Leer dia
	
	Si dia=1 Entonces
		Escribir "Lunes"
	SiNo
		Si dia=2 Entonces
			Escribir "Martes"
		SiNo
			Si dia=3 Entonces
				Escribir "Miercoles"
		SiNo
			Si dia=4 Entonces
				Escribir "Jueves"
		SiNo
			Si dia=5 Entonces
				Escribir "Viernes"
		SiNo
			Si dia=6 Entonces
				Escribir "Sabado"
		SiNo
			Si dia=7 Entonces
				Escribir "Domingo"
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
FinProceso
