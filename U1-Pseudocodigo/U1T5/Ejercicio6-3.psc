Proceso sin_titulo
	// Crea un programa que genere dos números al azar entre el 0 y el 100, y pida al 
	// usuario que calcule e introduzca su suma. Si la respuesta no es correcta, 
	// deberá volver a pedirla tantas veces como sea necesario hasta que el usuario acierte.
	// Pista: como verás en el apartado 10, para generar un número al azar del 0 al 100 puedes hacer numero <- AZAR(101)
	Definir n1,n2,resultado Como Entero
	
	n1=azar(101)
	n2=azar(101)
	
	Escribir "La suma es ",n1+n2 // no necesario
	
	Escribir "Adivina la suma de esos numeros"
	Leer resultado
	
	Mientras resultado<>n1+n2 Hacer
		Escribir "Intentalo de nuevo"
		Leer resultado
	FinMientras
	
	Escribir "Has acertado"
FinProceso
