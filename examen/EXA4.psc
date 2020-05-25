Algoritmo sin_titulo
	Definir n1,n2,CALCULA Como Entero;
	Escribir "Ingrese Numero 1: ";
	Leer n1;
	Escribir "Ingrese Numero 2: ";
	Leer n2;
	
	Escribir "Ingrese una opcion";
	Escribir "1.- suma ";
	Escribir "2.- resta ";
	Escribir "3.- multiplicar ";
	Escribir "4.- potencia ";
	Leer CALCULA; 
	Segun CALCULA Hacer
		1: Escribir "Es sumar? ";
			Escribir ">", n1," + ",n2," = ", n1+n2;
			
		2: Escribir "Es resta ? ";
			Escribir ">", n1," - ",n2," = ", n1-n2;
			
		3: Escribir "Es multiplicar? ";
			Escribir ">", n1," x ",n2," = ", n1*n2;
			
	    4: Escribir "Es potencia ? ";
			Escribir ">", n1," elevado a ",n2," = ",n1^n2;
			
		   De Otro Modo:
		   Escribir "No se encuentra el numero ";
	FinSegun
	
	
FinAlgoritmo
