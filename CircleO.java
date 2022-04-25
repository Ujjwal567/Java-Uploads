package overridingTest;

public class CircleO extends ShapeO{

	
	private int radius;
	

	public int getradius(){
		return radius;
	}
	public void setradius(int r){
		radius = r;
	}

	public double area(){
		return 3.14*radius*radius;
	}
	
}
