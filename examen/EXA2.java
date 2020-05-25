
import java.io.*;

public EXA2 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double bono;
		double puntos;
		double salario_minimo;
		System.out.print("Ingrese el Valor de Puntos:");
		puntos = Double.parseDouble(bufEntrada.readLine());
		System.out.print("Ingrese Salario Mínimo: ");
		salario_minimo = Double.parseDouble(bufEntrada.readLine());
		bono = 0;
		if (puntos>50 && puntos<=100) {
			bono = salario_minimo*0.10;
		}
		if (puntos>101 && puntos<=150) {
			bono = salario_minimo*0.50;
		}
		if (puntos>150) {
			bono = salario_minimo*1.00;
		}
		System.out.println("Su bono es: "+bono);
	}


}

