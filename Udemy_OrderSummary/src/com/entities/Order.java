package com.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.entities.enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;

	private Client client;

	private List<OrderItem> orderItem = new ArrayList<>();

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrderItem() {
		return orderItem;
	}

	public void addItem(OrderItem item) {
		orderItem.add(item);
	}

	public void removeItem(OrderItem item) {
		orderItem.remove(item);
	}
	
	/*
	 * public double total(){ }
	 */

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Horário de realização do pedido: " + moment + "/n");
		sb.append("Status do pedido: " + status + "/n");
		sb.append("Client: " + client.toString() + "/n");
		sb.append("Itens do pedido:/n ");
		
		
		
	}

	
}
