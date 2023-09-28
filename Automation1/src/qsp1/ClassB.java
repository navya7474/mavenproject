package qsp1;

public class ClassB {

	public static void main(String[] args) {
A a=new A(10);
int v=a.getValue();
System.out.println(v);
a.setValue(30);
System.out.println(a.getValue());
	}

}
