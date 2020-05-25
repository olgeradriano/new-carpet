
import java.io.*;

public 	EXA3 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int edad;
		double genero;
		System.out.print("Ingrese su Edad :");
		edad = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Seleccione el valor de genero.");
		System.out.println("    1.- mujer");
		System.out.println("    2.- hombre");
		System.out.print("    :");
		do {
			genero = Double.parseDouble(bufEntrada.readLine());
			if (genero<1 || genero>2) {
				System.out.print("Valor incorrecto. Ingréselo nuevamente.: ");
			}
		} while (!(genero>=1 && genero<=2));
		if ((genero==2 && edad>=16 && edad<70) || edad<16) {
			System.out.println("Vacuna Contra el Covid-19: A");
		}
		if (genero==1 && edad>=16 && edad<70) {
			System.out.println("Vacuna Contra el Covid-19: B");
		}
		if (edad>70) {
			System.out.println("Vacuna Contra el Covid-19: C");
		}
	}


}

