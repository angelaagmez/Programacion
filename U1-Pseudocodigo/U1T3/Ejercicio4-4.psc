Algoritmo sin_titulo
	// Haz un programa que pida al usuario dos números y diga cuántos de ellos son positivos.
	Definir n1,n2 Como Entero
	
	Escribir "Introduce un numero"
	Leer n1
	Escribir "Introduce otro numero"
	Leer n2
	
	Si n1>0 y n2>0  Entonces
		Escribir "Los dos son positivos"
	SiNo
		Si n1>0 o n2>0 Entonces
			Escribir "Uno es positivo"
		SiNo
			Escribir "Ninguno es positivo"
		FinSi
	FinSi
FinAlgoritmo
