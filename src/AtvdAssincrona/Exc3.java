package AtvdAssincrona;

import java.util.Scanner;

public class Exc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite o sálario bruto: ");
		Scanner ler1 = new Scanner(System.in);
		float salario = ler1.nextFloat();
		
		System.out.println("Digite o adicional noturno: ");
		Scanner ler2 = new Scanner(System.in);
		float adcNoturno = ler2.nextFloat();
		
		System.out.println("Digite as horas extras: ");
		Scanner ler3 = new Scanner(System.in);
		float horasExtras = ler3.nextFloat();
		
		System.out.println("Digite os descontos: ");
		Scanner ler4 = new Scanner(System.in);
		float descontos = ler4.nextFloat();
		
		double salarioLqd = salario + adcNoturno 
				+ (horasExtras *5) - descontos;
		System.out.println(salarioLqd);

	}

}
