Algoritmo sin_titulo
	// Prepara un programa que pida al usuario tres números y diga cuál es el mayor de los tres.
	Definir n1,n2,n3 Como Entero
	
	Escribir "Introduce un numero"
	Leer n1
	Escribir "Introduce otro numero"
	Leer n2
	Escribir "Introduce un ultimo numero"
	Leer n3
	
	Si n1>n2 y n1>n3 Entonces
		Escribir "El numero mayor es ",n1
	SiNo
		Si n2>n1 y n2>n3 Entonces
			Escribir "El numero mayor es ",n2
		SiNo
			Escribir "El numero mayor es ",n3
		FinSi
	FinSi
FinAlgoritmo
