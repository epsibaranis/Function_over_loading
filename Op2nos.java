package AccessingTwoNumbers;

class Op2nos extends A2nos{

	public Op2nos() {
		super();
	}
	public int sum(){
		int m1=getx();
		int m2=gety();
		return(m1+m2);
	}
	public int diff() {
		int m1=getx();
		int m2=gety();
		return(m1-m2);
	}
	public int product(){
		int m1=getx();
		int m2=gety();
		return(m1*m2);
	}
	public int mod() {
		int m1=getx();
		int m2=gety();
		return(m1%m2);
	}
	public int bigof2() {
		int m1=getx();
		int m2=gety();
		return(m1>m2?m1:m2);
	}
   public int smallof2() {
	   int m1=getx();
		int m2=gety();
		return(m1<m2?m1:m2);
   }
}
