package udemy.com.principal;

import java.util.Scanner;

import udemy.com.entidades.Alugueis;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner(System.in);
		
		Alugueis[] alg = new Alugueis[10];
		
		System.out.println("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		
		for(int i = 1 ; i<=n ; i++) {
			System.out.println();
			System.out.println("Aluguel #" + i + ":");
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.next();
			
			System.out.print("Quarto:");
			int quart = sc.nextInt();
			
			alg[quart] = new Alugueis(nome, email);
		}
		
		System.out.println();
		System.out.println("Quartos alugados: ");
		for(int i = 0 ; i < 10 ; i++) {
			if(alg[i] != null) {
			System.out.println(i + ": " + alg[i]);
			}
		}
		
			
	}

}
