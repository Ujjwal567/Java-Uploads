package ExerciseinputOutput;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class FileSpliter {
public static void main(String[] args) {
	
	try {
		byte[]  b = new byte[1000000];
		int x =1,j = 0;
		String s  = "";
		

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr)		;
		System.out.println("Enter Path");
		String path = br.readLine();
				
		FileInputStream f = new FileInputStream(path);
				
		int readbytes;
		while (f.available()!=0){
			j = 0;
			s = "";
			if (x<=9){
				s= path +"0.00"+x;
			}else s = path+".0"+x;
			FileOutputStream fos = new FileOutputStream(s);
			
			while (j<5000000 && f.available()!=0){
				readbytes = f.read(b,0,1000000);
				j = j+readbytes;
				 fos.write(b, 0, readbytes);
				 
			}System.out.println("path"+x+"Created.");
			x++;
			
		}
		
		System.out.println("File Splitted Sucessufully....");
		f.close();
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
