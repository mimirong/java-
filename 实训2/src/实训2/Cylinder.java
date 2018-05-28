package  µ—µ2;

public class Cylinder implements Cubage{
	
	double r,h;
	public Cylinder(double r,double h) {
		this.r=r;
		this.h=h;
	}
	@Override
	public double doCubage() {
		// TODO Auto-generated method stub
		return PI*r*r*h;
	}

	@Override
	public void showMessage(String str) {
		// TODO Auto-generated method stub
		System.out.println("’‚ «"+str);
	}

}
