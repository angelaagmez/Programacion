Proceso sin_titulo
	// Escribe un programa que muestre los n primeros t�rminos 
	// de la serie de Fibonacci. El primer t�rmino de la serie 
	// de Fibonacci es 0, el segundo es 1 y el resto se calcula 
	// sumando los dos anteriores, por lo que tendr�amos que los
	// t�rminos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... 
	// El n�mero n se debe introducir por teclado.
	
	Definir n1,n2,tam,x,tmp Como Entero
	
	n1=0
	n2=1
	
	Repetir
		Escribir "Introduce los terminos que apareceran de la serie de Fibonacci"
		Leer tam
	Hasta Que tam>=3
	
	Escribir Sin Saltar n1," ",n2
	
	Para x<-2 Hasta tam Hacer
		Escribir Sin Saltar " ",n1+n2
		tmp=n1+n2
		n1=n2
		n2=tmp
	FinPara
	
FinProceso
