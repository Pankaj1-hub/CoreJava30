package Variables;

public class Variables {

	int b=20; // instance variable
	static int c=30; // static variable
	
	public static void main(String[] args) {
		 int a=50;// local variable
		 
		System.out.println(a); 
		System.out.println(c);
		
		Variables v= new Variables();//object create
		System.out.println(v.b);
	 

	}

}
