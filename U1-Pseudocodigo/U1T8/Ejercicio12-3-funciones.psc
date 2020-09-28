
	Funcion v <- multiplo( n1,n2 )
		Si n1%n2=0 Entonces
			v=Verdadero
		SiNo
			v=Falso
		FinSi
FinFuncion

Proceso sin_titulo
	Definir num1,num2 Como Entero
	
	Escribir "Introduce el primer numero"
	Leer num1
	Escribir "Introduce el segundo numero"
	Leer num2
	
	Si multiplo(num1,num2) Entonces
		Escribir num1," es multiplo de ",num2
	SiNo
		Escribir num1," no es multiplo de ",num2
	FinSi
FinProceso
