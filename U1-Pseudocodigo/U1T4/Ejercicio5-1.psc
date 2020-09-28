Proceso sin_titulo
	// Haz un programa que pida al usuario un número de día de la semana 
	// (del 1 al 7) y escriba el nombre de ese día (por ejemplo, "
	// martes" para el día 2). Debes emplear la orden SEGUN.
	
	Definir dia Como Entero
	
	Escribir "Introduce el numero del dia de la semana"
	Leer dia 
	
	Segun dia Hacer
		1:
			Escribir "Lunes"
		2:
			Escribir "Martes"
		3:
			Escribir "Miercoles"
		4:
			Escribir "Jueves"
		5:
			Escribir "Viernes"
		6:
			Escribir "Sabado"
		7:
			Escribir "Domingo"
		De Otro Modo:
			Escribir "Día de la semana no válido"
	Fin Segun
FinProceso
