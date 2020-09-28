Proceso sin_titulo
	// Haz un programa que permita calcular la suma de pares de 
	// números. Pedirá dos números al usuario y mostrará su suma, 
	// volviendo a repetir hasta que ambos números introducidos 
	// sean 0. Esta vez deberás usar "Repetir", por lo que tu 
	//solución no será igual que la del ejercicio 6.2, que empleaba "Mientras".
	
	Definir n1,n2 Como Entero
	
	Repetir
		Escribir "Introduce un numero"
		Leer n1
		Escribir "Introduce otro numero"
		Leer n2
		Escribir "La suma es ",n1+n2
	Hasta Que n1=0 y n2=0
	
FinProceso
