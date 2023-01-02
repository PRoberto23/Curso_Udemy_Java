package com.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.entities.Comments;
import com.entities.Post;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comments c1 = new Comments("É uma ótima cidade");
		Comments c2 = new Comments("Um lindo lugar");
		
		String title = "Estou indo visitar Fortaleza";
		String postD2 = "Finalmente nesta grande cidade";
		
		Post p1 = new Post(sdf.parse("12/08/2020 08:40:41"), title, postD2, 13);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
	}

}
