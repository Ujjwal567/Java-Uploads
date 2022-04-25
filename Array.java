package trypacage;

public class Array {
public static void main(String[] args) {
	int [] marks = new int [6];  	//declaration and memory allocation
	marks[0] =100;
	marks[1] =98;
	marks[2] =95;
	marks[3] =90;
	marks[4] =80;
	//override
	marks[4] =85;
	marks[5] = 89;
	System.out.println(marks[4]);
}
}
