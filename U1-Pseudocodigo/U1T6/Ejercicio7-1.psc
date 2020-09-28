Proceso sin_titulo
	// Crea un programa que pida al usuario un código de usuario 
	// y una contraseña. Deberá repetirse hasta que el código sea 
	// "1" y la contraseña sea "1234".
	
	Definir cod Como Entero
	Definir passwd Como Entero
	
	Repetir
		Escribir "Introduce un codigo de usuario"
		Leer cod
		Escribir "Introduce una contraseña"
		Leer passwd
	Hasta Que cod=1 y passwd=1234
	
FinProceso
