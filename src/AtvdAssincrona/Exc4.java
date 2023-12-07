package AtvdAssincrona;

import java.util.Scanner;

public class Exc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite o numero 1: ");
		Scanner ler1 = new Scanner(System.in);
		float num1 = ler1.nextFloat();
		
		System.out.println("Digite o numero 2: ");
		Scanner ler2 = new Scanner(System.in);
		float num2 = ler2.nextFloat();
		
		System.out.println("Digite o numero 3: ");
		Scanner ler3 = new Scanner(System.in);
		float num3 = ler3.nextFloat();
		
		System.out.println("Digite o numero 4: ");
		Scanner ler4 = new Scanner(System.in);
		float num4 = ler4.nextFloat();
		
		double calculo = (num1 * num2) - (num3 * num4);
		System.out.println(calculo);

	}

}
