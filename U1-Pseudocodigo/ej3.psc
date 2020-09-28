Proceso sin_titulo
	Definir tam,f Como Entero
	
	Repetir
		Escribir "Introduce el tamaño. Debe ser mayor o igual que 5 e impar"
		Leer tam
		Escribir "La altura introducida no es correcta"
	Hasta Que tam>=5 y tam%2=1

	
	Para f<-1 Hasta tam+2 Hacer 
		Si f=tam+2 o f=1 o f=trunc((tam+4)/2) Entonces
			Escribir "MMMMMM"
		SiNo
			Escribir "M    M"
		FinSi
	FinPara
FinProceso
