package com.nissan.trainingcorejava;



interface PrintDisplay{
	public void display();
	default void dp() {
		
	}
	default void dent() {
		
	}
}

public class Lambda {
void run(){
	
	System.out.println("jjiii");
}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Jerin";
		
		PrintDisplay p = () ->{
			System.out.println(a);
		};
		p.display();

	}

}
