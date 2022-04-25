package exerciseoop;

public class Person {
 String firstname;
 String Lastname;

Person (String firstname,String Lastname){
	this.firstname = firstname;
    this.Lastname = Lastname;		
}
@Override
public String toString() {
    return "" + firstname  + " " + Lastname ;}
}
