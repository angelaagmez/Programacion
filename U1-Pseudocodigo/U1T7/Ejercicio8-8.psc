Proceso sin_titulo
	// Dibuja un tri�ngulo creciente de asteriscos, del tama�o que 
	// indique el usuario. Por ejemplo, si escoge 4, el resultado 
	// deber�a ser:
	
	Definir tam,fila,colum Como Entero
	
	Escribir "Introduce el tama�o del triangulo"
	Leer tam
	
	Para fila<-1 Hasta tam Hacer
		
		Para colum<-1 hasta fila Hacer
			Escribir Sin Saltar "* "
		FinPara
		
		Escribir ""
		
	Fin Para
	
FinProceso
