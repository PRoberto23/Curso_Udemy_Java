package com.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.entities.Comments;
import com.entities.Post;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
				
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comments c1 = new Comments("É uma linda cidade!");
		Comments c2 = new Comments("Tem ótimas praias!");
		
		Post p1 = new Post(sdf.parse("22/07/2022"), "Viajando para Fortaleza", "Vou visitar essa linda cidade", 13);
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
	}

}
