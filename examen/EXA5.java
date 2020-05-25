
import java.io.*;
import java.math.*;

public EXA5 {

	public static void main(String args[]) {
		double i;
		double salario_inicial;
		double salario_recibido;
		double year;
		for (i=1;i<=6;i++) {
			System.out.println("PROCESO "+i);
			salario_inicial = 1500;
			year = i;
			salario_recibido = salario_inicial*Math.pow((1.1),(year));
			System.out.println("Salario inicial: "+salario_inicial);
			System.out.println("Salario recibido: "+salario_recibido);
			System.out.println("Años de trabajo: "+year);
			System.out.println(" ");
		}
	}


}

