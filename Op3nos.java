package AccessingTwoNumbers;

class Op3nos extends A3nos {

	public Op3nos() {
		super();
	}
	public int sum() {
		int m1=getx();
		int m2=gety();
		int m3=getz();
		return(m1+m2+m3);
	}
	public int diff() {
		int m1=getx();
		int m2=gety();
		int m3=getz();
		return(m1-(m2-m3));
	}
	public int product() {
		int m1=getx();
		int m2=gety();
		int m3=getz();
		return(m1*m2*m3);
	}
	public int mod() {
		int m1=getx();
		int m2=gety();
		int m3=getz();
		return((m1%m2)%m3);
	}
	public int Bigof3no() {
		int m1=getx();
		int m2=gety();
		int m3=getz();
		return(m1>(m2>m3?m2:m3)?m1:((m2>m3)?m2:m3));
	}
	public int smallof3no() {
		int m1=getx();
		int m2=gety();
		int m3=getz();
		return(m1<(m2<m3?m2:m3)?m1:((m2<m3)?m2:m3));
	}
    
}
