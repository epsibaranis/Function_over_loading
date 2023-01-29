package AccessingTwoNumbers;

public class Main2 {

	public static void main(String[] args) {
		Point1 a1,a2,a3,a4,a5,a6;
		a1=new Point1();
		a1.display();
		
		a2=new Point1(100);
		a2.display();
		
		a3=new Point1(102,1032);
		a3.display();
		
		a4=new Point1(a1);
		a4.display();
		
		a5=new Point1();
		a5.set(105,106);
		a5.display();
		
		a6=new Point1();
		a6.set(607,706);
		int m1=a6.getx();
		System.out.println(m1);
		int m2=a6.gety();
		System.out.println(m2);
	}

}
