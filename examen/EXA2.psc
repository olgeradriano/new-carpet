Algoritmo sin_titulo
	Definir puntos, salario_minimo,bono Como Real; 
	
	Escribir Sin Saltar "Ingrese el Valor de Puntos:";
    Leer puntos;
    Escribir Sin Saltar "Ingrese Salario Mínimo: ";
    Leer salario_minimo;
	bono <- 0;
    Si puntos>50 y puntos <=100 Entonces
        bono <- salario_minimo*0.10;
    FinSi
    Si puntos>101 Y puntos<=150 Entonces
        bono <- salario_minimo*0.50;
    FinSi
    Si puntos>150 Entonces
        bono <- salario_minimo*1.00;
    FinSi
    Escribir "Su bono es: ", bono;
FinAlgoritmo
