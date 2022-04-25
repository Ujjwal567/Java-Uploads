package exerciseoop;

import inheritancaAndPolymorphims.InterfaceForInheritance;
import inheritancaAndPolymorphims.Shape;

public class Rectangle extends Shape  {

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
	
	
}
