Proceso sin_titulo
	// Crea un programa que pida al usuario un c�digo de usuario 
	// y una contrase�a. Deber� repetirse hasta que el c�digo sea 
	// "1" y la contrase�a sea "1234".
	
	Definir cod Como Entero
	Definir passwd Como Entero
	
	Repetir
		Escribir "Introduce un codigo de usuario"
		Leer cod
		Escribir "Introduce una contrase�a"
		Leer passwd
	Hasta Que cod=1 y passwd=1234
	
FinProceso
