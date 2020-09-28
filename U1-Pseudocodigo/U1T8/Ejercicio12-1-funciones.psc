Funcion linea<-escribirCentrado(cad)
	Definir tam,esp,contador Como Entero
	tam=Longitud(cad)
	esp=trunc((80-tam)/2)
	linea=""
	
	Para contador<-1 Hasta esp Hacer
		linea=Concatenar(linea,"-")
	FinPara
	
	linea=linea+cad+linea
	
FinFuncion


Proceso sin_titulo
	// Crea un procedimiento EscribirCentrado, que reciba como parámetro 
	// un texto y lo escriba centrado en pantalla (suponiendo una anchura
	// de 80 columnas; pista: deberás escribir 40 - longitud/2 espacios 
	// antes del texto).
	Definir text Como Caracter
	Escribir "Introduce la cadena"
	Leer text
	
	Escribir escribirCentrado(text)
	
FinProceso
