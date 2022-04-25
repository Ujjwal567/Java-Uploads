package inputOutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyAFile {
public static void main(String[] args) throws IOException {
	String source = "G:\\Java Core notes\\TestIO.txt";
	String target = "G:\\Java Core notes\\second.txt";
	
	FileReader read = new FileReader(source);
	FileWriter write = new FileWriter(target);
	
	int ch = read.read();
	while(ch !=-1){
		write.write(ch);
		ch = read.read();
	}
	write.close();
	read.close();
}
}
