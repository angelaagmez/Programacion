Proceso sin_titulo
	Definir n,div,cont, sum, med Como Entero
	
	b<-verdadero
	cont<-0
	med<-0
	sum<-0
	max<-0
	min<-0
	
	Repetir
		Escribir "Por favor, vaya introduciendo numeros enteros positivos. Para terminar, introduzca un numero primo"
		Leer n
		cont<-0
		Para div<-1 Hasta n Hacer
			Si n%div=0 Entonces
				cont<-cont+1
			FinSi
		FinPara
		Si cont>2 Entonces
			med=med+1
			sum<-sum+n
			Si b=verdadero Entonces
				max<-n
				min<-n
				b<-Falso
			SiNo
				Si n>max Entonces
					max<-n
				Finsi
				Si n<min Entonces
					min<-n
				FinSi
			FinSi
		FinSi
	Hasta Que cont<=2
	
	// med=(numeros sumados)/n
	
	Si med>=1 Entonces
		Escribir "Ha introducido ",med," numeros"
		Escribir "El maximo es ",max
		Escribir "El minimo es ",min
		Escribir "La media es ",sum/med
	FinSi
	

FinProceso
