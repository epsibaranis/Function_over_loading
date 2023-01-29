package AccessingTwoNumbers;

public class main4 {

	public static void main(String[] args) {
		A3nos a1;
		a1=new A3nos();
		a1.display();
		a1.displayz();
		a1.set(300,200,400);
		a1.display();
		a1.displayz();
		int m1=a1.getx();
		System.out.println("get x value"+m1);
		int m2=a1.gety();
		System.out.println("get y value"+m2);
		a1.set(569);
		a1.displayz();
		a1.set(450,540);
		int m3=a1.getx();
		System.out.println("get x value"+m3);
		int m4=a1.gety();
		System.out.println("get y value"+m4);
		a1.display();
		a1.setobj(a1);
		a1.display();
		a1.displayz();
		int m5=a1.getx();
		System.out.println("get x value"+m5);
		int m6=a1.gety();
		System.out.println("get y value"+m6);
		a1.reset();
		a1.display();
		a1.displayz();
		int m7=a1.getx();
		System.out.println("get x value"+m7);
		int m8=a1.gety();
		System.out.println("get y value"+m8);
		a1.set();
		a1.display();
		int m9=a1.getx();
		System.out.println("get x value"+m9);
		int m10=a1.gety();
		System.out.println("get y value"+m10);
	}

}
