package AtvdAssincrona;

import java.util.Scanner;

public class Ecx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite a nota 1: ");
		Scanner ler1 = new Scanner(System.in);
		float nota1 = ler1.nextFloat();
		
		System.out.println("Digite a nota 2: ");
		Scanner ler2 = new Scanner(System.in);
		float nota2 = ler2.nextFloat();
		
		System.out.println("Digite a nota 3: ");
		Scanner ler3 = new Scanner(System.in);
		float nota3 = ler3.nextFloat();
		
		System.out.println("Digite a nota 4: ");
		Scanner ler4 = new Scanner(System.in);
		float nota4 = ler4.nextFloat();
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println(media);

	}

}
