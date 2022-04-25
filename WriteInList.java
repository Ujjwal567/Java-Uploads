package trypacage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.StringTokenizer;

public class WriteInList {
public static void main(String[] args) throws IOException {
	String source = "G:\\Java Core notes\\Split1.txt";
	String target = "G:\\Java Core notes\\Split2.txt";
	
	String snt = source;
	FileReader read = new FileReader("G:\\Java Core notes\\Split2.txt");
	StringTokenizer stn = new StringTokenizer(snt, ".");
	String token = null;
	
	
	while (stn.hasMoreElements()){
		token = stn.nextToken();
		//System.out.println(token);
	}
	
		FileWriter write = new FileWriter(target);
	
	int ch = read.read();
	while(ch !=-1){
		write.write(ch);
		ch = read.read();
	}
	BufferedReader b = new BufferedReader(read);
String line = b.readLine();
	
	while (line !=null){
		System.out.print(line);
		line = b.readLine();
	}
	
	b.close();
	write.close();
	read.close();
	
	
	
}
}
