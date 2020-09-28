Proceso sin_titulo
	// Desarrolla un programa que pida un número, y luego escriba un menú con 3 opciones: 
	// 1-calcular el valor absoluto 
	// 2-calcular la raíz cuadrada 
	// 3- calcular el cuadrado de ese número. 
	// Según la opción que ingrese el usuario, debe calcularse una cosa u otra.
	
	Definir n Como Real
	Definir op Como Entero
	
	Escribir "Introduce un numero"
	Leer n
	
	Escribir "Elige una opcion"
	Escribir "1 - Valor absoluto"
	Escribir "2 - Raiz cuadrada"
	Escribir "3 - Cuadrado"
	Leer op
	
	Segun op hacer
		1: 
			Escribir "El valor absoluto es ", abs(n)
		2:
			Escribir "La raiz cuadrada es ",rc(n)
		3:
			Escribir "El cuadrado es ",n^2
		De otro modo: 
			Escribir "Opcion no valida"
	FinSegun
FinProceso
