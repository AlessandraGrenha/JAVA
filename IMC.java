import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o peso: ");
		double peso = leitor.nextDouble();
		
		System.out.println("Digite a altura: ");
		double altura = leitor.nextDouble();
		
		double imc;
		imc = peso / (Math.pow(altura, 2));
		
		System.out.printf("IMC: %.2f" , imc);
		
		if (imc < 18.5) {
			System.out.println("\nVocê está a abaixo do peso ideal!");
		}
		else {
			if(imc <= 25) {
				System.out.println("\nVocê está no peso ideal!");
			}
			else {
				System.out.println("\nVocê está acima do peso ideal!");
			}
		}
	}

}
