Proceso sin_titulo
	Definir tam,f Como Entero
	
	Repetir
		Escribir "Introduce el tamaño. Mayor que 3 e impar"
		Leer tam
	Hasta Que tam>3 y tam%2=1
	
	// Pintamos las filas impares
	// Para las pares seria f<-0 y f%2=0
	
	Para f<-1 Hasta tam Hacer 
		Si f%2=1 Entonces
			Escribir "******"
		SiNo
			Escribir "*    *"
		FinSi
	FinPara
	
FinProceso
