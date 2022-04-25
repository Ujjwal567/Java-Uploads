package inputOutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSer {
	
	 public static void main(String args[]){    
		  try{    
		      
			  SerializationMarkshet s1 =new SerializationMarkshet(211,"ravi");    
		      
		  FileOutputStream fout=new FileOutputStream("f.txt");    
		  ObjectOutputStream out=new ObjectOutputStream(fout);    
		  out.writeObject(s1);    
		  out.flush();    
		  //closing the stream    
		  out.close();    
		  System.out.println("success");    
		  }catch(Exception e){System.out.println(e);}    
		 }    
}
	