package inputOutput;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteAFile {
public static void main(String[] args) throws IOException {
	FileWriter write = new FileWriter("G:\\Java Core notes\\second.txt",true);
	PrintWriter pw = new PrintWriter(write);
	
	for (int i = 0; i < 4; i++) {
		pw.println(i + ":Line");
		System.out.println("Copy");
	}
	pw.close();
	write.close();
	System.out.println("File is Sucessfully Written");
}
}
