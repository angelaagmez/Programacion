Proceso sin_titulo
	// Prepara un programa que divida dos n�meros que introduzca 
	// el usuario. Si el segundo n�mero es cero, se le deber� avisar
	// y volver a pedir tantas veces como sea necesario, hasta que
	// introduzca un n�mero distinto de cero, momento en que se 
	// calcular� y mostrar� el resultado de la divisi�n.
	
	Definir n1,n2 Como Entero
	
	Repetir
		Escribir "Introduce un numero"
		Leer n1
		Escribir "Introduce otro numero"
		Leer n2
	Hasta Que n2<>0
	
	Escribir "El resultado es ",n1/n2
	
FinProceso
