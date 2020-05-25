Proceso sin_titulo
	Definir i,salario_inicial,salario_recibido,year Como Real;
    Para i<-1 Hasta 6 Con Paso 1 Hacer
        Escribir "PROCESO ", i;
        salario_inicial <- 1500;
        year <- i;
        salario_recibido <- salario_inicial*(1.1)^(year);
        Escribir "Salario inicial: ", salario_inicial;
        Escribir "Salario recibido: ", salario_recibido;
        Escribir "Años de trabajo: ", year;
        Escribir " ";
    FinPara
	
FinProceso