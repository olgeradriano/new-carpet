Algoritmo sin_titulo
	Definir nota1,nota2,nota3,nota4,nota_final Como Real;
	Definir puntos1,puntos2,puntos3,puntos4 Como Real;
	Escribir Sin Saltar "Ingrese nota primera unidad:";
    Leer nota1 ;
	Escribir Sin Saltar "Ingrese nota segunda unidad:";
    Leer nota2 ;
	Escribir Sin Saltar "Ingrese nota tercera unidad:";
    Leer nota3 ;
	Escribir Sin Saltar "Ingrese nota del trabajo final:";
    Leer nota4 ;
	
	puntos1<-10*nota1/100;
	puntos2<-15*nota2/100;
	puntos3<-25*nota3/100;
	puntos4<-50*nota4/100;
	nota_final<-puntos1+puntos2+puntos3+puntos4;
	
	si puntos1<=2 Entonces
		puntos1<-10*nota1/100;
	FinSi
	si puntos2<=3 Entonces
		puntos2<-15*nota2/100;
	FinSi
	si puntos3<=5 Entonces
		puntos3<-25*nota3/100;
	FinSi
	si puntos4<=10 Entonces
		puntos4<-50*nota4/100;
	FinSi
	si nota_final<=20 Entonces
		nota_final<-puntos1+puntos2+puntos3+puntos4;
	FinSi
	
	
	Escribir "Primera unidad: ",puntos1;
	Escribir "Segundad unidad: ",puntos2;
	Escribir "Tercera unidad: ",puntos3;
	Escribir "Trabajo final: ",puntos4;
	Escribir "Nota Final del curso es: ",nota_final;
	
FinAlgoritmo
