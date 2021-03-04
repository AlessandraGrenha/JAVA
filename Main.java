import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		int n1;
		int n2;
		
		System.out.print("Digite o primeiro valor inteiro: ");
		n1 = input.nextInt();
		
		System.out.print("Digite o segundo valor inteiro: ");
		n2 = input.nextInt();
		
		if ((n1 % n2) == 0 || (n2 % n1) == 0) {
			System.out.printf("%d e %d são múltiplos entre si", n1 , n2);
		}
		else {
			System.out.printf("%d e %d não são múltiplos entre si", n1 , n2);
		}
		
	} //fim metodo main

}//fim class Main
