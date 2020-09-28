Funcion caden<-espaciado(c)
	Definir pos Como Entero
	caden=""
	Para pos<-1 Hasta Longitud(c) Hacer
		caden=caden+Subcadena(c,pos,pos)+" "
	FinPara
FinFuncion

Proceso sin_titulo
	// Crea un procedimiento EscribirEspaciado, que reciba como parámetro
	// un texto y lo escriba con un espacio adicional tras cada letra. 
	// Por ejemplo, "Hola, tú" se escribiría "H o l a , t ú ".
	
	Definir cad Como Caracter
	
	Escribir "Introduce el texto"
	Leer cad
	
	Escribir espaciado(cad)
	
FinProceso
