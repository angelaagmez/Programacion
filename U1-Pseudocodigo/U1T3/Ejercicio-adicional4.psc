Proceso sin_titulo
	// Escribe un algoritmo que calcule el sueldo semanal de un trabajador teniendo en cuenta lo siguiente:
	//-> El sueldo para las primeras 40 horas es 10�
	// -> A partir de la hora 41 (incluida) el trabajado cobrar� 15� hora
	// Por ejemplo: 
	// Introduzca el n�mero de horas trabajadas durante la semana: 36
	// El sueldo semanal que le corresponde es de 360
	// Introduzca el n�mero de horas trabajadas durante la semana: 50
	// El sueldo semanal que le corresponde es de 550
	
	Definir h Como Entero
	
	Escribir "Introduzca el numero de horas" 
	Leer h
	
	Si h<=40 Entonces 
		Escribir "El sueldo es de ",h*10
	SiNo
		Escribir "El sueldo es de ",400+((h-40)*15)
	FinSi
	
FinProceso
