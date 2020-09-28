Proceso sin_titulo
	
	Definir alt,anch,x,i Como Entero
	
	Escribir "Introduzca el alto del rectangulo"
	Leer alt
	Escribir "Introduzca el ancho del rectangulo"
	Leer anch
	
	Para x<-1 Hasta alt Hacer
			Para i<-1 Hasta anch Hacer
				Si x=1 o x=alt o i=1 o i=anch Entonces
					Escribir Sin Saltar "* "
				SiNo
					Escribir Sin Saltar "  "
				FinSi
			FinPara
		Escribir ""
	Fin Para

FinProceso
