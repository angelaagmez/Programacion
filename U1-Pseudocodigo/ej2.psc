Proceso sin_titulo
	Definir num,inv Como Entero
	
	Escribir "Por favor, introduzca un numero entero positivo"
	Leer num
	
	inv<-0
	
	Repetir 
		inv<-(inv*10)+(num MOD 10)
		num<-trunc(num/10)
	Hasta Que num<=0
	
	Escribir "El numero resultante es ",inv
FinProceso
