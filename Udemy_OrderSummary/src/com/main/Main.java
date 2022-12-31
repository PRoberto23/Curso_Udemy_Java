package com.main;

import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import com.entities.Client;
import com.entities.Order;
import com.entities.OrderItem;
import com.entities.Product;
import com.entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do cliente: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Data de aniversário (DD/MM/YYYY): ");
		Date birthDate = (Date) df.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println();
		System.out.println("Entre com os dados do pedido:");
		System.out.print("Status (PENDING_PAYMENT/PROCESSING/SHIPPED/DELIRED): ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.print("Quantos itens tem no pedido? ");
		int n = sc.nextInt();
		
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Entre com os dados do #" + i + " pedido: ");
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String productName = sc.nextLine();
			
			System.out.print("Preço do produto: ");
			double price = sc.nextDouble();
			
			Product product = new Product(productName, price);
			
			System.out.print("Quantidade: ");
			int quantity = sc.nextInt();
			
			OrderItem item = new OrderItem(quantity, price, product);
			
			order.addItem(item);
		}
		
		System.out.println();
		System.out.println("Sumário do pedido: ");
		
	}

}
