package AtvdAssincrona;

import java.util.Scanner;

public class Exc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite o sálario: ");
		Scanner ler = new Scanner(System.in);
		float salario = ler.nextFloat();
		
		System.out.println("Digite o abono: ");
		Scanner ler2 = new Scanner(System.in);
		float abono = ler.nextFloat();
		
		double novoSalario = salario + abono;
		System.out.println(novoSalario);
	}

}
