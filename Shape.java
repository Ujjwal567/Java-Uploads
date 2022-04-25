package exerciseoop;

public abstract  class Shape {
	
	private String color = null;
	private int borderWidth = 10;


	public String getcolor(){
		return color;
	}
	public void setcolor(String s){
		color = s;
	}
	public int getboderWidth(){
		return borderWidth;
	}
	public void setborderWidth(int i){
		borderWidth = i;
	}
	
	public abstract  double area() ;
		
	
	
}
