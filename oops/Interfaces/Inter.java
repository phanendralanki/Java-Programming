interface Inter{
	//1.methods 
	
	//void show();
	//abstract void show();
	//public abstract void show();
	//protected abstract void show();
	//default abstract void show();
	
	void show();
	
	//2.fields //public static final 
	
	//int a = 10;
	//public static final int a = 10;
	//private int a =10;  //-> error 
	
	//concrete method
	// error: interface abstract methods cannot have body
/*
	void display(){
		
	}
*/

//concrete method with default
//we can write default concrete methods from java 8th version
/* 
	default void display(){
		
	}
	*/
	
	//static concrete methods - from 8th version 
	/*
	static void display(){
		
	}
	*/
	
	 /*
	//4. private methods in 9th version
	private void practice(){
		
	}
	*/
}
