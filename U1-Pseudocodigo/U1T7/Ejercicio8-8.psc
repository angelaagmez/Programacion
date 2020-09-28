Proceso sin_titulo
	// Dibuja un triángulo creciente de asteriscos, del tamaño que 
	// indique el usuario. Por ejemplo, si escoge 4, el resultado 
	// debería ser:
	
	Definir tam,fila,colum Como Entero
	
	Escribir "Introduce el tamaño del triangulo"
	Leer tam
	
	Para fila<-1 Hasta tam Hacer
		
		Para colum<-1 hasta fila Hacer
			Escribir Sin Saltar "* "
		FinPara
		
		Escribir ""
		
	Fin Para
	
FinProceso
