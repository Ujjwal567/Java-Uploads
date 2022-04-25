package exerciseoop;

import inheritancaAndPolymorphims.InterfaceForInheritance;
import inheritancaAndPolymorphims.Shape;

public class Circle extends Shape {

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
