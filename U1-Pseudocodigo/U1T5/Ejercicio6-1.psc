Proceso sin_titulo
	//  Crea un programa que pida al usuario una contraseña, de forma repetitiva 
	// mientras que no introduzca "1234". Cuando finalmente escriba la contraseña correcta, 
	//se le dirá "Bienvenido" y terminará el programa.
	
	Definir passwd Como Caracter
	
	Escribir "Introduzca contraseña"
	Leer passwd
	
	Mientras passwd<>"1234" Hacer
		Escribir "La contraseña no es correcta"
		
	Fin Mientras
FinProceso
