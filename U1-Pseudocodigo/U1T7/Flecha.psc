Proceso sin_titulo
	Definir n,x,i Como Entero
	
	Repetir
		Escribir "Introduce un numero"
		Leer n
	Hasta Que n%2=1
	
	Escribir "*"
	
	Para x<-1 Hasta (n/2) Hacer
        escribir sin saltar "*"
        Para  i<-1 Hasta x Hacer
            Escribir sin saltar "**"
        FinPara
        Escribir ""
    Fin Para
	
    Para x<-n/2 Hasta 1 Con Paso -1 Hacer
        escribir sin saltar "*"
        Para  i<-1 Hasta x-1 Hacer
            Escribir Sin Saltar "**"
        FinPara
        Escribir ""
    Fin Para
	
FinProceso
