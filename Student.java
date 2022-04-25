package ExerciseinputOutput;

import java.io.Serializable;
import java.io.*;
public class Student implements Serializable{

	int i = 10, j = 20;
    transient int k = 30;
  
    
    public static void main(String[] args) throws Exception
    {
    	Student input = new Student();
  
        // serialization
        FileOutputStream fos = new FileOutputStream("abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(input);
  
        // de-serialization
        FileInputStream fis = new FileInputStream("abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student output = (Student)ois.readObject();
        System.out.println("Ujjwal "+"Age = " + output.i);
        System.out.println("Ram  " +"Age = "+ output.j);
        System.out.println("Mohan  "+"Age = " + output.k);
       
    }
}
