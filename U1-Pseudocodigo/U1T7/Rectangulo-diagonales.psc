Proceso sin_titulo
	Definir alt,anch,x,i Como Entero
	
	Repetir
		Escribir "Introduzca el alto del rectangulo"
		Leer alt
	Hasta Que alt%2=1 y alt>=5
	
	// Para la primera diagonal x=i porque coinciden filas y columnas
	// Para la segunda diagonal calculamos x+i y vemos que es 1 mas de lo que hemos introducido en la altura

	Para x<-1 Hasta alt Hacer
		Para i<-1 Hasta alt Hacer
			Si x=1 o x=alt o i=1 o i=alt o x=i o x+i=alt+1 Entonces
				Escribir Sin Saltar "* "
			SiNo
				Escribir Sin Saltar "  "
			FinSi
		FinPara
		Escribir ""
	Fin Para
	
FinProceso
