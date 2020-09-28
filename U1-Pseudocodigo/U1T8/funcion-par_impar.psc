Funcion v <- espar( n )
	Si n%2=0 Entonces
		v=Verdadero
	SiNo
		v=Falso
	FinSi
FinFuncion

Proceso sin_titulo
	Definir num Como Entero
	
	Escribir "Introduce el numero"
	Leer num
	
	Si espar(num) Entonces
		Escribir "El numero es par"
	SiNo
		Escribir "El numero es impar"
	FinSi
FinProceso
