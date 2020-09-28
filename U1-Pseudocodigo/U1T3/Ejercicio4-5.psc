Algoritmo sin_titulo
	// Crea un programa que pida al usuario dos números y muestre su división si el segundo no es cero, o un mensaje de aviso en caso contrario.
	Definir n1,n2 Como Real
	
	Escribir "Introduce un numero"
	Leer n1
	Escribir "Introduce otro numero"
	Leer n2
	
	Si n2<>0 Entonces
		Escribir "El resultado de la division de ",n1,"/",n2," es: ",n1/n2
	SiNo
		Escribir "El numero es ",n2,", no se puede realizar la operacion"
	FinSi
	
FinAlgoritmo