package inputOutput;

import java.io.FileReader;

public class FileReaderTest {

public static void main(String[] args)  throws Exception {
	
	FileReader reader= new FileReader("G:\\Java Core notes\\second.txt");
	
	int ch = reader.read();
	char chr;
	
	while(ch!=-1){
		chr = (char)ch;
		System.out.print(chr);
		ch = reader.read();
	}
	
	
	
}
}

