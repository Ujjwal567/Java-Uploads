package ExerciseinputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class mergeSplit {
	public static void main(String[] args) throws IOException
    {
        // create  directory
        File dir = new File("G:\\Java Core notes\\merge");
 
        
        PrintWriter pw = new PrintWriter("G:\\output.txt");
 
        
        String[] fileNames = dir.list();
 
        
        for (String fileName : fileNames) {
            System.out.println("Reading from " + fileName);
 
            
            File f = new File(dir, fileName);
 
            
            BufferedReader br = new BufferedReader(new FileReader(f));
            pw.println("Contents of file " + fileName);
 
            
            String line = br.readLine();
            while (line != null) {
 
                
                pw.println(line);
                line = br.readLine();
            }
            pw.flush();
        }
        System.out.println("Reading from all files" +
        " in directory " + dir.getName() + " Completed");
    }

}
