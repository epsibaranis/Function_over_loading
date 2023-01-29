package AccessingTwoNumbers;

public class Main {

	public static void main(String[] args) {
		A2nos a1,a2,a3;
		a1=new A2nos();
		a2=new A2nos(100);
		a3=new A2nos(100,200);
		a1.set(5000);
		a2.set(2000);
		int m=a1.getx();
		System.out.println(m);
		int m1=a2.gety();
		System.out.println(m1);
		a3.set(400,500);
		a3.display();
		a3.set(a1);
		a3.display();

	}

}
