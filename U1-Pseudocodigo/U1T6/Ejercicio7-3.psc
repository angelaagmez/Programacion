Proceso sin_titulo
	// Prepara un programa que divida dos números que introduzca 
	// el usuario. Si el segundo número es cero, se le deberá avisar
	// y volver a pedir tantas veces como sea necesario, hasta que
	// introduzca un número distinto de cero, momento en que se 
	// calculará y mostrará el resultado de la división.
	
	Definir n1,n2 Como Entero
	
	Repetir
		Escribir "Introduce un numero"
		Leer n1
		Escribir "Introduce otro numero"
		Leer n2
	Hasta Que n2<>0
	
	Escribir "El resultado es ",n1/n2
	
FinProceso
