package ExerciseinputOutput;

import java.io.File;

public class FileNameDire {
	public static void main(String[] args) {
		File directory = new File ("G:\\Java Core notes");
		
		String [] list = directory.list();
		
		for (int i = 0; i < list.length; i++) {
			System.out.println((i+1)+" : "+ list[i]);
		}
		
	}
}
