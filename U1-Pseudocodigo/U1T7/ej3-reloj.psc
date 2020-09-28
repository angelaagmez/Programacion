Proceso sin_titulo
	// Realiza un programa que pinte un reloj de arena relleno 
	// hecho de asteriscos. El programa debe pedir la altura. 
	// Se debe comprobar que la altura sea un número impar mayor 
	// o igual a 3, en caso contrario se debe mostrar un mensaje 
	// de error.
	
	Definir tam,f,c Como Entero
	
	Repetir
		Escribir "Introduce la altura del reloj, debe ser impar"
		Leer tam
	Hasta Que tam%2=1 y tam>=3

	Para f<-0 Hasta tam-1 Hacer
		
		Para c<-0 Hasta tam-1 Hacer
			
			Si f=0 o f=tam-1 o (c>=f y f+c<=tam-1) o (c<=f y f+c>=tam-1) Entonces
				Escribir Sin Saltar "* "
			SiNo
				Escribir Sin Saltar "  "
			FinSi
			
		FinPara
		
		Escribir ""
		
	Fin Para
	
	
FinProceso
