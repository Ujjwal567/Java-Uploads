package inputOutput;

import java.io.File;

public class DisplayOnlyFiles {
public static void main(String[]args){
	File directory = new File ("G:\\Java Core notes");

	String [] list = directory.list();
	for (int i = 0; i < list.length; i++) {
		File f = new File("G:\\Java Core notes");
		if(f.isFile()){
			System.out.println((i+1)+" : "+list[i]);
		}
	}
}
}
