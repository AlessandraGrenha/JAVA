
public class Raiz_Potencia_Absoluto {

	public static void main(String[] args) {
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("A raiz quadrada de " + x + " é = " + A);
		System.out.println("A raiz quadrada de " + y + " é = " + B);
		System.out.println("A raiz quadrada de 25 é = " + C);
		
		System.out.println();
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0 , 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado é = " + B);
		System.out.println("5 elevado ao quadrado é = " + C);
		
		System.out.println();
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("O valor absoluto "+ y + " é: "+ y);
		System.out.println("O valor absoluto "+ z + " é: "+ z);
		
	}

}
