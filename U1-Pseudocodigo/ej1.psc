Proceso sin_titulo
	Definir p Como Real
	
	Escribir "Introduzca la cantidad de producto" 
	Leer p
	
	Si p<=100 Entonces 
		Escribir "El precio es de ",p*5.23
	SiNo
		Si p>=101 y p<=1000 Entonces
			Escribir "El precio es de ",523+((p-100)*4.16)
		SiNo
			Escribir "El precio es de ",(p*5.23)/2
		FinSi
		
	FinSi
FinProceso
