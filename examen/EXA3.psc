Algoritmo sin_titulo
	Definir edad Como Entero;
	Definir genero Como Real;
	Escribir Sin Saltar "Ingrese su Edad :";
    Leer edad ;
	Escribir "Seleccione el valor de genero.";
    Escribir "    1.- mujer";
    Escribir "    2.- hombre";
    Escribir Sin Saltar "    :";
	Repetir
        Leer genero;
        Si genero<1 O genero>2 Entonces
            Escribir Sin Saltar "Valor incorrecto. Ingréselo nuevamente.: ";
        FinSi
    Hasta Que genero>=1 Y genero<=2;
    Si (genero = 2 Y edad>=16 Y edad<70) O edad<16 Entonces
        Escribir "Vacuna Contra el Covid-19: A";
    FinSi
    Si genero = 1 Y edad>=16 Y edad<70 Entonces
        Escribir "Vacuna Contra el Covid-19: B";
    FinSi
    Si edad>70 Entonces
        Escribir "Vacuna Contra el Covid-19: C";
    FinSi
	
FinAlgoritmo
