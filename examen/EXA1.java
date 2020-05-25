
import java.io.*;

public EXA1{

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double nota_final;
		double puntos1;
		double puntos2;
		double puntos3;
		double puntos4;
		System.out.print("Ingrese nota primera unidad:");
		nota1 = Double.parseDouble(bufEntrada.readLine());
		System.out.print("Ingrese nota segunda unidad:");
		nota2 = Double.parseDouble(bufEntrada.readLine());
		System.out.print("Ingrese nota tercera unidad:");
		nota3 = Double.parseDouble(bufEntrada.readLine());
		System.out.print("Ingrese nota del trabajo final:");
		nota4 = Double.parseDouble(bufEntrada.readLine());
		puntos1 = 10*nota1/100;
		puntos2 = 15*nota2/100;
		puntos3 = 25*nota3/100;
		puntos4 = 50*nota4/100;
		nota_final = puntos1+puntos2+puntos3+puntos4;
		if (puntos1<=2) {
			puntos1 = 10*nota1/100;
		}
		if (puntos2<=3) {
			puntos2 = 15*nota2/100;
		}
		if (puntos3<=5) {
			puntos3 = 25*nota3/100;
		}
		if (puntos4<=10) {
			puntos4 = 50*nota4/100;
		}
		if (nota_final<=20) {
			nota_final = puntos1+puntos2+puntos3+puntos4;
		}
		System.out.println("Primera unidad: "+puntos1);
		System.out.println("Segundad unidad: "+puntos2);
		System.out.println("Tercera unidad: "+puntos3);
		System.out.println("Trabajo final: "+puntos4);
		System.out.println("Nota Final del curso es: "+nota_final);
	}


}

