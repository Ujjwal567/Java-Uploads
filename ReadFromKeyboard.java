package ExerciseinputOutput;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadFromKeyboard {
	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter (new FileWriter("G:\\Java Core notes\\take.txt",true));
		InputStreamReader k = new InputStreamReader (System.in);
		BufferedReader n = new BufferedReader(k);
		String line = n.readLine();
		while (!line.equals("quit")){
			out.println(line);
			line = n.readLine();
		}
		n.close();
		out.close();
		k.close();
	}
}
