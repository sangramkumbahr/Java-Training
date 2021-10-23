package com.java.ex;
class A{
private void name() {
	
	System.out.println("private Method");
	
}
protected void show() {
	System.out.println("protected");
}
public void display() {
	name();// private method can only be accessed within the class
	System.out.println("public");
	
}
void dis() {
	
	System.out.println("void");


}
}
public class AccessModifier {
	public static void main(String[] args) {
		A obj= new A();
		//obj.name(); private cannot be accessed outside the class
		obj.show();//protected can be accessed from outside the class 
		obj.display();//public and friendly can be accessed from outside the class 
		obj.dis();
	}

}
