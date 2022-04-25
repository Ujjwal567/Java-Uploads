package inputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyByBinary {
public static void main(String[] args) throws IOException {
	String source = "G:\\Java Core notes\\j.jpg";
	//String target = "G:\\Java Core notes\\Paulo Coelho.jpg";
	String target = "G:\\Java Core notes\\Paul.txt";
	
	FileInputStream read = new FileInputStream(source);
	FileOutputStream write = new FileOutputStream(target);
	
	int ch = read.read();
	while (ch!=-1){
		write.write(ch);
		ch = read.read();
	}
	write.close();
	read.close();
	System.out.println(source +"is copied to"+target);
}
}
