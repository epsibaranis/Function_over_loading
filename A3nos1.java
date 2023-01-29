package AccessingTwoNumbers;

class A3nos1 extends A2nos {
    protected int z;
	public A3nos1() {
		super();
		z=25;
	}
	public A3nos1(int a) {
		super(a);
		z=25;
	}
	public A3nos1(int a,int b) {
		super(a,b);
		z=25;
	}
	public A3nos1(int a,int b,int c) {
		super(a,b);
		z=c;
	}
    public A3nos1(A3nos1 a) {
    	super(a);
    	z=a.z;
    }
    public void set() {
    	set();
    	z=30;
    }
    public void set(A3nos1 a) {
    	a.getx();
    	a.gety();
    	z=a.z;
    }
    public void set(int a) {
    	z=a;
    }
    public void set(int a,int b,int c) {
    	set(a,b);
    	z=c;
    }
    public int getz() {
    	return z;
    }
    public void display() {
    	System.out.println(z);
    }

}
