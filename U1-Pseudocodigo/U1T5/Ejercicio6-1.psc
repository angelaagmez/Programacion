Proceso sin_titulo
	//  Crea un programa que pida al usuario una contrase�a, de forma repetitiva 
	// mientras que no introduzca "1234". Cuando finalmente escriba la contrase�a correcta, 
	//se le dir� "Bienvenido" y terminar� el programa.
	
	Definir passwd Como Caracter
	
	Escribir "Introduzca contrase�a"
	Leer passwd
	
	Mientras passwd<>"1234" Hacer
		Escribir "La contrase�a no es correcta"
		
	Fin Mientras
FinProceso
