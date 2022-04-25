package inputOutput;

import java.io.File;
import java.text.SimpleDateFormat;

public class TestFile {
public static void main(String[] args) {
	File f = new File("G:\\Java Core notes");
	if(f.exists()){
		System.out.println("Name "+ f.getName());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		//
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		String k= format1.format(f.lastModified());
		System.out.println(k);
		
		//System.out.println(f.lastModified());
		System.out.println(f.length());
		System.out.println(f.getTotalSpace());
		
		
	}
}
}
