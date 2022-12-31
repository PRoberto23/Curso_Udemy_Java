package com.main;

import java.util.Iterator;
import java.util.Scanner;

import com.entities.Client;
import com.entities.Order;
import com.entities.OrderItem;
import com.entities.Product;
import com.entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dadod do cliente: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Data de aniversário (DD/MM/YYYY): ");
		//falta recebe data
		
		System.out.println();
		System.out.println("Entre com os dados do pedido:");
		System.out.print("Status (PENDING_PAYMENT/PROCESSING/SHIPPED/DELIRED): ");
		String status = sc.next();
		System.out.print("Quantos itens tem no pedido? ");
		int n = sc.nextInt();
		
		Order order = new Order(null, OrderStatus.valueOf(status), new Client(name, email, null));
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Entre com os dados do #" + i + " pedido: ");
			System.out.print("Nome do produto: ");
			String productName = sc.nextLine();
			System.out.print("Preço do produto: ");
			double price = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantity = sc.nextInt();
			
			OrderItem item = new OrderItem(quantity, price, new Product(productName, price));
			order.addItem(item);
		}
		
		System.out.println();
		System.out.println("Sumário do pedido: ");
		
	}

}
