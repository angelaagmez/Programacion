Proceso sin_titulo
	// A partir del ejemplo que dibuja un rectángulo de asteriscos,
	// crea un que dibuje un cuadrado (deberá pedir sólo un dato, 
	// el lado, y ambas órdenes "para" deberán tener ese valor como
	// límite).
	
	Definir tam,fila,columna Como Entero
	
	Escribir "Introduzca el tamaño del cuadrado"
	Leer tam
	
	Para fila<-1 hasta tam Hacer
		
		Para columna<-1 hasta tam Hacer
			Escribir Sin Saltar "* "
		FinPara
		
		Escribir ""
		
	FinPara
	
	
FinProceso
