package inputOutput;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLineByLine {
public static void main(String[] args) throws Exception{
	FileReader r = new FileReader("G:\\Java Core notes\\TestIO.txt");
	BufferedReader b = new BufferedReader(r);
	
	String line = b.readLine();
	
	while (line !=null){
		System.out.print(line);
		line = b.readLine();
	}
}
}
