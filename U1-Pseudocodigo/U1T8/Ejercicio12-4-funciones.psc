Funcion caden<-espaciado(c)
	Definir pos Como Entero
	caden=""
	Para pos<-1 Hasta Longitud(c) Hacer
		caden=caden+Subcadena(c,pos,pos)+" "
	FinPara
FinFuncion

Proceso sin_titulo
	// Crea un procedimiento EscribirEspaciado, que reciba como par�metro
	// un texto y lo escriba con un espacio adicional tras cada letra. 
	// Por ejemplo, "Hola, t�" se escribir�a "H o l a , t � ".
	
	Definir cad Como Caracter
	
	Escribir "Introduce el texto"
	Leer cad
	
	Escribir espaciado(cad)
	
FinProceso
