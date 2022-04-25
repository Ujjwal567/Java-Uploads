package ExerciseinputOutput;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListintoFile {
	public static void main(String args[]) throws IOException{  
		 //Creating a List  
		 List<String> list=new ArrayList<String>();  
		 //Adding elements in the List  
		 list.add("Mango");  
		 list.add("Apple");  
		 list.add("Banana");  
		 list.add("Grapes");  
		 
		 
		 FileReader reader= new FileReader("G:\\Java Core notes\\Testlist2.txt");
			
			int ch = reader.read();
			char chr;
			
			while(ch!=-1){
				chr = (char)ch;
				System.out.print(chr);
				ch = reader.read();
			}
		 
		 FileWriter writer = new FileWriter("G:\\Java Core notes\\Testlist2.txt"); 
		 for(String str: list) {
		   writer.write(str + System.lineSeparator());
		 }
		 
		 
		 writer.close();
		
		 reader.close();
}
}