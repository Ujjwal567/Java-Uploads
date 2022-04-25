package inputOutput;

public class BreakeStringInToken {
	 public static void main(String args[]){
	      String my_str = "This_is_a_sample";
	      String[] split_str = my_str.split("_", 4);
	      	      for (String every_Str : split_str)
	      System.out.println(every_Str);
}
	 
}