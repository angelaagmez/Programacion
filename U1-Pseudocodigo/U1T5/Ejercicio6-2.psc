Proceso sin_titulo
	// Haz un programa que permita calcular la suma de pares de n�meros. 
	// Pedir� dos n�meros al usuario y mostrar� su suma, volviendo a repetir hasta que 
	// ambos n�meros introducidos sean 0.
	Definir n1,n2 Como Entero
	
	Escribir "Introduce el primer numero"
	Leer n1
	Escribir "Introduce el segundo numero"
	Leer n2
	
	Mientras n1<>0 o n2<>0 Hacer
		Escribir "La suma es ",n1+n2
		Escribir "Introduce el primer numero"
		Leer n1
		Escribir "Introduce el segundo numero"
		Leer n2
	Fin Mientras
	
FinProceso
