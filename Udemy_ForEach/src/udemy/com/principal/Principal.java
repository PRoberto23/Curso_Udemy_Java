package udemy.com.principal;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] vect = new String[] {"Maria", "Bob", "Jonas"};
		
		for(int i = 0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("------------------------------");
		for(String obj : vect) {
			System.out.println(obj);
		}
	}

}
