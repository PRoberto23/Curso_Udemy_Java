package udemy.com.principal;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		
		int num1, num2, num3;
		int ct = 0;
		
		do {
			Scanner sc = new Scanner(System.in);
	
			System.out.println("Digite três números: ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			num3 = sc.nextInt();
		
			if(num1 > num2 && num1 > num3) {
				System.out.println("O maior número é: " + num1);
			} else if (num2 > num3) {
				System.out.println("O maior número é: " + num2);
			} else {
				System.out.println("O maior número é:" + num3);
			}
		
		}while(ct == 0);
		
	}
}
