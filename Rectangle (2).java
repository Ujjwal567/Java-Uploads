package inheritancaAndPolymorphims;

public class Rectangle extends Shape implements InterfaceForInheritance{

	private float length;
	private int width;
	
	
	public float getlength(){
		return length;
	}
	public void setlength(float kf){
		length = kf;
	}
	
	public int getwidth(){
		return width;
	}
	public void setwidth(int h){
		width = h;
	}
	
	public double  area(){
		return length*width;
	}
	@Override
	public void sum() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}//end
