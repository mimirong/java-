package  µ—µ2;

public class Cone implements Cubage{
	double r,h;
	public Cone(double r,double h) {
		this.r=r;
		this.h=h;
	}
	@Override
	public double doCubage() {
		// TODO Auto-generated method stub
		return PI*r*r*h/3;
	}
	@Override
	public void showMessage(String str) {
		// TODO Auto-generated method stub
		System.out.println("’‚ «"+str);
	}
	
}