
import java.io.*;
import java.math.*;

public EXA4 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int calcula;
		int n1;
		int n2;
		System.out.println("Ingrese Numero 1: ");
		n1 = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese Numero 2: ");
		n2 = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese una opcion");
		System.out.println("1.- suma ");
		System.out.println("2.- resta ");
		System.out.println("3.- multiplicar ");
		System.out.println("4.- potencia ");
		calcula = Integer.parseInt(bufEntrada.readLine());
		switch (calcula) {
		case 1:
			System.out.println("Es sumar? ");
			System.out.println(">"+n1+" + "+n2+" = "+n1+n2);
			break;
		case 2:
			System.out.println("Es resta ? ");
			System.out.println(">"+n1+" - "+n2+" = "+n1-n2);
			break;
		case 3:
			System.out.println("Es multiplicar? ");
			System.out.println(">"+n1+" x "+n2+" = "+n1*n2);
			break;
		case 4:
			System.out.println("Es potencia ? ");
			System.out.println(">"+n1+" elevado a "+n2+" = "+Math.pow(n1,n2));
			break;
		default:
			System.out.println("No se encuentra el numero ");
		}
	}


}

