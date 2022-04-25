package inheritancaAndPolymorphims;

public class Circle extends Shape implements InterfaceForInheritance  {

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
@Override
public void sum() {
	// TODO Auto-generated method stub
	
}

}//end
