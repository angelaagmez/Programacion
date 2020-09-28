Funcion div<-numDivisores(num)
	Definir c Como Entero
	div=0
	Para c<-1 Hasta num Hacer
		Si num%c=0 Entonces
			div=div+1
		FinSi
	FinPara
FinFuncion

Proceso sin_titulo
	// Crea una función CantidadDeDivisores, que reciba un número entero y
	// devuelva la cantidad de divisores (por ejemplo, para el número 16,
	// sus divisores son 1, 2, 4, 8, 16, por lo que la respuesta debería 
	// ser 5).
	Definir n,c Como Entero
	
	Repetir
		Escribir "Introduce un numero entero positivo"
		Leer n
	Hasta Que n>0
	
	c=numDivisores(n)
	
	Escribir n," tiene ",c
	
FinProceso
